package com.soat.hadoopworkshop.ex2;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class AnagramReducer extends
	Reducer<Text, Text, Text, Text> {
    
    private static final Text voidtxt=new Text("");
    
	@Override
	public void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException, InterruptedException {
	    StringBuilder str=new StringBuilder();
	    for(Text i:values)
		{
		    str.append(i.toString()).append(" ");
		}
	    context.write(voidtxt,new Text(str.toString()));
		// Utiliser context.write(text, int) pour ecrire la sortie du reducer;
	}
}
