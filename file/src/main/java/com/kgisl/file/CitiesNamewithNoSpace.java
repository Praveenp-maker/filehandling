package com.kgisl.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CitiesNamewithNoSpace {

  
    public static void main(String[] args) throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
        List<String[]> allRows = reader.readAll();
        ArrayList<String>citynames=new  ArrayList<String>();
        ArrayList<String>citys=new  ArrayList<String>();
        for(String[]s:allRows){
         citynames.add(s[0]);
        }
        for(String s:citynames) {
     	   
       	 s=  s.replaceAll("\\s", "");
              citys.add(s);
           }
            
         
     System.out.println(citys);
System.out.println(citys.size());
    
   
    }
       }
    
    

