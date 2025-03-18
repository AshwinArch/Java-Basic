package com.mapreduce.sort;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;

import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;

public class Test  
{
	public static void main(String[] args) throws IOException
	{
		// TODOpackage Com;
      	if (args.length != 2) 
  		{
  			System.err.println("Usage: FileWordCount: <input path> <output path>");
  			System.exit(-1);
  		}
      	
      	System.out.println("In Driver.java");
      	
      	JobConf conf = new JobConf(Test.class);
   		
      	conf.setJobName("MergeSort");
  		
  		FileInputFormat.addInputPath(conf, new Path(args[0]));
  		FileOutputFormat.setOutputPath(conf, new Path(args[1]));
  		
  		conf.setMapperClass(com.mapreduce.sort.MergeMapper.class);
  		conf.setReducerClass(com.mapreduce.sort.MergeReducer.class);
  		
  		conf.setOutputKeyClass(IntWritable.class);
  		conf.setOutputValueClass(IntArrayWritable.class);
  		  		
  		JobClient.runJob(conf);
		}
}