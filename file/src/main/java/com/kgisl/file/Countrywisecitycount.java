package com.kgisl.file;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countrywisecitycount 
{
    public static void main( String[] args )
    {  
       
       String line="";
       String splitBy=",";
       List<CityModel> modelList = new ArrayList<CityModel>();
       try{
        BufferedReader br=new BufferedReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
        while((line=br.readLine())!=null){
            String[]model=line.split(splitBy);
      
            modelList.add(new CityModel(model[0], model[1], model[2], model[3], model[4], model[5], model[6], model[7], model[8], model[9], model[10]));
        }
       }catch(IOException e){
        e.printStackTrace();
       }

       Map<String, Long> result = modelList.stream().map(m->m.getCountry())
       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       for (Map.Entry<String,Long> entry : result.entrySet()) {
        System.out.println("country = " + entry.getKey() +
                         ", cities count = " + entry.getValue());
    }}
    //    for (CityModel model : modelList) {
    //     String key=model.getCountry(); 
    //                 while(key.equals(model.getCountry())){
                       
                       
    //                 }
    //             }
    //             mp.put(key, count);
    // for(Map.Entry<String,Long> entry : result.entrySet()){
       

    //    }
 
   

    //     Map mp=new HashMap<String,Integer>();
    //     for (CityModel m:modelList) {
    //         String key=m.getCountry();
    //        int count=0;
    //         // List li=new ArrayList<String>();
    //         for (CityModel model : modelList) {
    //             while(key.equals(model.getCountry())){
    //                 // li.add(model.getCity());
    //                 count=count+1;
    //             }
    //         }
    //         mp.put(key, count);
    //     }
    //    System.out.println(mp);

//     Map<String, Long> frequencies = modelList.stream()
//         .collect(Collectors.groupingBy(modelList., Collectors.counting()));

// //then filter only the inputs which have frequency great than 1
// frequencies.entrySet().stream()
//         .filter(entry -> entry.getValue() > 1)
//         .forEach(entry -> System.out.println(entry.getKey()));
    }
       
  
   