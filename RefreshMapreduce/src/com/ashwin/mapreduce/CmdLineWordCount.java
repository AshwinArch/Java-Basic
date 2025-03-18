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

public class CmdLineWordCount {

	public static class InMap extends Mapper<Object, Text, Text, IntWritable>
	{
		private static final IntWritable num = new IntWritable(1);
		private Text word = new Text();
		
		public void map(Object key, Text value, Context context) 
		throws IOException ,InterruptedException 
		{
			StringTokenizer str = new StringTokenizer(value.toString());
			Configuration conf = context.getConfiguration();
			String search = conf.get("search");
			
			while (str.hasMoreElements()) 
			{
				if (search.equalsIgnoreCase(str.nextElement().toString())) 
				{
					word.set(search);
					context.write(word, num);
				}
			}
		}
	}
	
	public static class OutReducer extends Reducer<Text, IntWritable, Text, IntWritable>
	{
		private static IntWritable result  = new IntWritable();
		
		public void reduce(Text key, Iterable<IntWritable> value, Context context )  throws IOException, InterruptedException 
		{
			int sum = 0 ;
			for (IntWritable val : value) 
			{ 
				sum +=val.get();
			}
			result.set(sum);
			context.write(key, result);
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		
		Configuration conf = new Configuration();
		conf.set("search", args[2]);
		Job job =new Job(conf, "CMD LINE WORD COUNT");
		
		job.setJarByClass(CmdLineWordCount.class);
		
		job.setCombinerClass(OutReducer.class);
		job.setReducerClass(OutReducer.class);
		job.setMapperClass(InMap.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true)?0:1);
	}
	
}





