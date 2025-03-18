package com.ashwin.mapreduce;


import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

public class WordCountNew 
{
	public static class InputMapper extends Mapper< Object, Text, Text, IntWritable>
	{
		private final IntWritable num = new IntWritable(1);
		private Text txt = new Text();	
		
		protected void map(Object key, Text value, Context context) 
		throws IOException ,InterruptedException 
		{
			StringTokenizer str = new StringTokenizer(value.toString());
			while (str.hasMoreElements()) 
			{
				txt.set(value);
				str.nextElement();			
			}
			context.write(txt, num);
		}
	}
	public static class OutputReducer extends Reducer<Text, IntWritable, Text, IntWritable>
	{
		private IntWritable result = new IntWritable();
		
		protected void reduce(Text Key, Iterable<IntWritable> Value,Context con) 
		throws IOException ,InterruptedException 
		{
			int sum=0;
			for (IntWritable intWritable : Value) 
			{
				sum =sum+intWritable.get();
			}
			result.set(sum);
			con.write(Key, result);
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		Configuration conf = new Configuration();
		Job job = new Job(conf, "WordCount");
		
		job.setJarByClass(WordCountNew.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		job.setMapperClass(InputMapper.class);
		job.setCombinerClass(OutputReducer.class);
		job.setReducerClass(OutputReducer.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);		
	}
}