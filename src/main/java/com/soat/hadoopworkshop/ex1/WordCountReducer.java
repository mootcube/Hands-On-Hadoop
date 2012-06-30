package com.soat.hadoopworkshop.ex1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.util.*;

public class WordCountReducer extends
				  Reducer<Text, IntWritable, Text, IntWritable> {
    
    @Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
	throws IOException, InterruptedException {
	
	int sum=0;
	
	Iterator<IntWritable> ite=values.iterator();

	while(ite.hasNext())
	    {
		 sum+=	ite.next().get();
	    }
	
	context.write(key,new IntWritable(sum));
	
	// Utiliser context.write(text, int) pour ecrire la sortie du reducer;
    }
    
}
