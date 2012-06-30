package com.soat.hadoopworkshop.ex3;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MostFrequentMapper extends
				    Mapper<LongWritable, Text, IntWritable, Text> {
    
    @Override
	public void map(LongWritable key, Text value, Context context)
	throws IOException, InterruptedException 
	{
	    String texte=value.toString();
	    StringTokenizer str=new StringTokenizer(texte,"'\"0123456789 .;:/,?!()[]{}@$£%&+-*");
	    
	    while(str.hasMoreTokens())
		{
		    context.write(one,new Text(str.nextToken().toLowerCase()));
		}

	    
	    
	}
    
}
