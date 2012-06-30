package com.soat.hadoopworkshop.ex2;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AnagramMapper extends
			       Mapper<LongWritable, Text, Text, Text> {
    
    @Override
	public void map(LongWritable key, Text value, Context context)
	throws IOException, InterruptedException {
	
	for(String i:value.toString().split("\n"))
	    {
		char[] ca=i.toCharArray();
		java.util.Arrays.sort(ca);
		context.write(new Text(new String(ca)),new Text(i));
	    }
	
    }
    
}
