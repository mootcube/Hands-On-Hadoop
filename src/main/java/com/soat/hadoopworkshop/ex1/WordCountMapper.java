package com.soat.hadoopworkshop.ex1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.util.StringTokenizer;

public class WordCountMapper extends
		Mapper<LongWritable, Text, Text, IntWritable> {

    private static final IntWritable one=new IntWritable(1);
    
	@Override
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
	    String texte=value.toString();
	    StringTokenizer str=new StringTokenizer(texte,"'\"0123456789 .;:/,?!()[]{}@$£%&+-*");
	    while(str.hasMoreTokens())
		{
		    context.write(new Text(str.nextToken().toLowerCase()),one);
		}
		// Utiliser context.write(text, int) pour ecrire la sortie du mapper.
	}

}
