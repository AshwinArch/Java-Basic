package com.mapreduce.sort;

import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class MergeReducer extends MapReduceBase 
implements Reducer<IntWritable, IntArrayWritable, Text, Text>  {
	
   public void reduce(IntWritable key, Iterator<IntArrayWritable> values,
				OutputCollector<Text, Text> output, Reporter arg3) throws IOException {
			// TODO Auto-generated method stub
			;
	  //Getting values from mapper...  
	   IntArrayWritable iter = null;
	   while (values.hasNext()) 
	   {
		iter = values.next();
	   }
	   
	   int len=Integer.parseInt(key.toString());
	
	   IntArrayWritable pair = new IntArrayWritable();
	   IntWritable[] array=new IntWritable[len];
	   int[] arr=new int[array.length];
	   int[] temp=new int[array.length];
	   pair.set(iter.get()); 
      
	   int p=0;
	   for(Writable element : pair.get()) 
	   {
				 IntWritable ay = (IntWritable)element;
				 array[p]=ay;
				 p++;
				  
		}
		for(int i=0;i<array.length;i++)
		{
			arr[i]=Integer.parseInt(array[i].toString());
		}
			 
		//Sorting Array...
				
		int c;
		for(int a=0;a<array.length;a++)
		{
		       c=0;
		       for(int b=0;b<array.length;b++)
		       {
		        if(arr[a]>arr[b])
		         {
		            c++;
		         }
		        }
			            temp[c]=arr[a];
		}

		
		   IntWritable[] out=new IntWritable[array.length];
		   System.out.println("After IntWritable:"+"\n");
		   String last=" ";
			for(int i=0;i<temp.length;i++)
			{
			out[i]=new IntWritable(temp[i]);
			}

			
			for(int i=0;i<temp.length;i++)
			{
			last=last+" "+out[i].toString();
			}
			 System.out.println("After Int2dWritabable:"+"\n");
			output.collect( new Text("Array") , new Text(last));			
		   
			
		}
	 }


