package com.mapreduce.sort;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class MergeMapper extends MapReduceBase 
implements Mapper<LongWritable, Text, IntWritable, IntArrayWritable> 
{
		public void map(LongWritable key, Text value, OutputCollector<IntWritable, IntArrayWritable> output, 
                Reporter reporter) throws IOException 
                {
				    String str = value.toString();
					
					String[] tokens = str.split(" ");
					int x = tokens.length;
					int[] arr = new int[x];
					
					//getting values...
					for (int i = 0; i < x; i++)
					{
						arr[i] = Integer.parseInt(tokens[i]);
					}
					IntArrayWritable sorted = new IntArrayWritable();
					IntWritable[] array=new IntWritable[x];

					//converting into array of IntWritable...
					for(int i=0;i<x;i++)
					{
						array[i] = new IntWritable(arr[i]);
					}
				    
					//setting as IntArrayWritable...
					sorted.set(array);
				    output.collect( new IntWritable(x) , sorted);
		 }
}