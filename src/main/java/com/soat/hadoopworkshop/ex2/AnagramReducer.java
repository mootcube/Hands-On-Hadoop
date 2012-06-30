package com.soat.hadoopworkshop.ex2;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class AnagramReducer extends
Reducer<Text, IntWritable, Text, IntWritable> {
    
    
    
    @Override
    public void reduce(Text key, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {
        
        String string = new String();
        
        
        System.out.println(string);
        
        // Utiliser context.write(text, int) pour ecrire la sortie du reducer;
    }
    
}
