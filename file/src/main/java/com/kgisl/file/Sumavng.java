package com.kgisl.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Sumavng {
    public static void main( String[] args ) throws IOException, CsvException
    {
    CSVReader reader = new CSVReader(new FileReader("F:\\filehandling-main\\file\\src\\main\\resources\\worldcities.csv"));


    List<String[]> allRows = reader.readAll();
   ArrayList<String> data = new ArrayList<String>();
   int sum=0;
for(String[] row:allRows)
    {
        data.add(row[9]); 
    }
for(String e:data){
   // System.out.println(e);
if(e!=""){
 sum = sum+Integer.parseInt(e);
}
}
System.out.println(sum);
}}
