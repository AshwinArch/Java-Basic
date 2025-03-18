package com.ashwin.mapreduce;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.FileSplit;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.mapred.TextInputFormat;

public class MultiFileReader 
{
	public class MFRMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>
	{
		@Override
		public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
		throws IOException 
		{
			int sum = 0;
			String v[] = value.toString().split(" ");
			for(int i=0;i<v.length;i++)
			{
				sum += Integer.parseInt(v[i].toString());
			}
			FileSplit fileSplit =  (FileSplit)reporter.getInputSplit();
			String fileName = fileSplit.getPath().getName();
			output.collect(new Text(fileName), new IntWritable(sum));
		}
	}
	
	public class MFRReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>
	{
		@Override
		public void reduce(Text key, Iterator<IntWritable> value, OutputCollector<Text, IntWritable> collector, Reporter reporter)
		throws IOException 
		{
			int sum = 0;
			while(value.hasNext())
			{
				sum += value.next().get();
			}
			collector.collect(key, new IntWritable(sum));
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		JobConf conf = new JobConf();
		
		conf.setJarByClass(MultiFileReader.class);
		conf.setJobName("Multiple File Reader");
		
		conf.setMapperClass(MFRMapper.class);
		conf.setReducerClass(MFRReducer.class);
		
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);
		
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);
	
		FileInputFormat.addInputPath(conf, new Path(args[0]));
		FileOutputFormat.setOutputPath(conf, new Path(args[1]));
		
		JobClient.runJob(conf);
	}
}