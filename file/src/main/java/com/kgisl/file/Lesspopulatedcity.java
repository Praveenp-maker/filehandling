package com.kgisl.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Lesspopulatedcity {
    public static void main(String[] args) throws IOException, CsvException {
   
    // ArrayList<String>citynames=new  ArrayList<String>();
    // ArrayList<String>citys=new  ArrayList<String>();
    // for(String[]s:allRows){
    //  citynames.add(s[0]);

    // }
    String line="";
    String splitBy=",";
    List<CityModel> modelL = new ArrayList<CityModel>();
    try{
     BufferedReader br=new BufferedReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
     while((line=br.readLine())!=null){
         String[]model=line.split(splitBy);
   
         modelL.add(new CityModel(model[0], model[1], model[2], model[3], model[4], model[5], model[6], model[7], model[8], model[9], model[10]));
     }
    }catch(IOException e){
     e.printStackTrace();
    }
   
   HashMap<String,String> map=new HashMap<String,String>();    
     //TreeMap<String,Integer> map=new TreeMap<String,Integer>();    
    // HashMap<String, Long> mp=new HashMap<String,Long>();

   // String minValue = map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();

    
       for (CityModel m:modelL) {
  String key=m.getCity();
     String value=m.getPopulation();
           map.put(key, value);
      }
//    String s= Collections.min(map.values());
//    System.out.println(s);


Entry<String, String> min = Collections.min(map.entrySet(),
                                       Comparator.comparing(Entry::getValue));
                         System.out.println(min.getKey()+" "+min.getValue());

//   for(Map.Entry m:map.entrySet())  
//   {  
//          System.out.println(m.getKey()+" "+m.getValue());      
//      }  



    //     for (Modelnew u:modelL) {
    //         String ke=u.getCity();
    //  Long minValue = mp.entrySet().stream()
    //      .min(Map.Entry.comparingByValue())
    //      .get()
    //   .getValue();
    //   mp.put(ke, minValue);
    //     }
    //     System.out.println(mp);

    //  System.out.println("Minimum value is: " + minValue+" "+);

    //   Optional<Map.Entry<String,Integer>> minValue = mp.entrySet().stream()
    //  .collect(Collectors.minBy(Map.Entry.comparingByValue()));
    //  System.out.println("Minimum value is: " + minValue.get().getValue());


    }
}