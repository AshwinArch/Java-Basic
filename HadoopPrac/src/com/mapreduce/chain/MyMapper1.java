package com.mapreduce.chain;


import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class MyMapper1 extends MapReduceBase implements Mapper<LongWritable, Text, Text, Text>
{

	@Override
	public void map(LongWritable k1, Text k2, OutputCollector<Text, Text> k3,
			Reporter k4) throws IOException {
		
		String line = k2.toString();
		StringTokenizer itr = new StringTokenizer(line);
		String student = itr.nextToken();
		String marks = itr.nextToken();
		//IntWritable marksNew=new IntWritable( Integer.parseInt(marks) );
		
		k3.collect( new Text(student) , new Text(marks) );
	}
	
}



