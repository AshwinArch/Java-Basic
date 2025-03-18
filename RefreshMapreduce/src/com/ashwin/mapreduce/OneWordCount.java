package com.ashwin.mapreduce;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class OneWordCount {

	public class OneWordMapper extends Mapper<Object, Text, Text, IntWritable>
	{
		private final IntWritable num = new IntWritable(1);
		private Text word = new Text();
				
		public void map(Object key, Text value, Context context) throws IOException ,InterruptedException 
		{
			Configuration conf = context.getConfiguration();
			final String search = conf.get("search");
			
			StringTokenizer str = new StringTokenizer(value.toString());
			while (str.hasMoreElements())
			{
				if(str.nextElement().toString().equalsIgnoreCase(search))
				{
					word.set(search);
					context.write(word, num);
				}
			}
		}		
	}

	public class OneWordReducer extends Reducer<Text, IntWritable, Text, IntWritable>
	{
		private IntWritable result = new IntWritable();
		
		public void reduce(Text key, Iterable<IntWritable> value, Context context) 
		throws IOException ,InterruptedException 
		{
			int sum = 0;
			for (IntWritable intWritable : value) 
			{
				sum += intWritable.get();
			}
			result.set(sum);
			context.write(key, result);
		}
	}

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		conf.set("search", "Hadoop");
		
		Job	job = new Job(conf, "One Word Count");
		job.setJarByClass(OneWordCount.class);
		
		job.setMapperClass(OneWordMapper.class);
		job.setCombinerClass(OneWordReducer.class);
		job.setReducerClass(OneWordReducer.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true)?0:1);
	}
}