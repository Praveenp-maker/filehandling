package com.kgisl.file;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countrywisecitycount 
{
    private static final CityModel[] CityModel = null;

    public static void main( String[] args )
    {  
       Scanner u=new Scanner(System.in);
       String line="";
       String splitBy=",";
       List<CityModel> modelList = new ArrayList<CityModel>();
       try{
        BufferedReader br=new BufferedReader(new FileReader("F:\\filehandling-main\\file\\src\\main\\resources\\worldcities.csv"));
        while((line=br.readLine())!=null){
            String[]model=line.split(splitBy);
      
            modelList.add(new CityModel(model[0], model[1], model[2], model[3], model[4], model[5], model[6], model[7], model[8], model[9], model[10]));
        }
       }catch(IOException e){
        e.printStackTrace();
       }


   
// country wise city count and country wise state count
    //    Map<String, Long> result = modelList.stream().map(m->m.getCountry())
    //    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    //    for (Map.Entry<String,Long> entry : result.entrySet()) {
    //     System.out.println("country = " + entry.getKey() +
    //                      ", cities count = " + entry.getValue());
    // }}



      // for (CityModel model : modelList) {
    //     String key=model.getCountry(); 
    //                 while(key.equals(model.getCountry())){
                       
                       
    //                 }
    //             }
    //             mp.put(key, count);
    // for(Map.Entry<String,Long> entry : result.entrySet()){
       

    //    }
 
   
//cities in same lat ss
    //     Map <String,ArrayList<String>> mp=new HashMap<String,ArrayList<String>>();
    //     for (CityModel m:modelList) {
    //         String lat1=m.getLat();
    //         ArrayList<String> li=new ArrayList<String>();
    //         for (CityModel model : modelList) {
    //             //System.out.println(lat1);
    //             String lat2=model.getLat();
    //             //System.out.println(lat2);

    //             if(lat1.matches("(.*)"+lat2+"(.*)")){
    //                  li.add(model.getCity());
                  
    //             }
    //         }
    //         mp.put(lat1, li);
    //     }
    //    System.out.println(mp);


//     Map<String, Long> frequencies = modelList.stream().map(m->m.getLat()+m.getCity())
//         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
// Map<String,String>h=new HashMap<String,String>();
//  frequencies.entrySet().stream()
//       .filter(entry -> entry.getValue() > 1)
//       .forEach(entry -> System.out.println(entry.getKey()));

// List<Integer>s=new ArrayList<>();
// for(CityModel f:modelList){
//     String d=f.getPopulation();
//    // Integer h=Integer.parseInt(d);
//    // s.add(h);
//    System.out.println(d);

// }
//System.out.println(s);
// TreeMap<Integer,String>f=new TreeMap<>();

//     for(CityModel s :modelList){
       
//          String t=s.getPopulation().split(splitBy, 0);
//           Integer e=Integer.parseInt(t);
        
       
//          String  value=s.getCity();
//         f.put(e,value);
     

//  System.out.println(t+" "+value);



       
// }
// System.out.println(f);


//give city name and fetch all values success
// System.out.println("city name is    :");
// String cityName=u.next();
// List<CityModel>d=new ArrayList<>();
// for(CityModel g:modelList){
    
// if(g.getCity().matches("(.*)"+cityName+"(.*)"))
// {
//    System.out.println("equal");
//    System.out.println(g.getCity()+" "+g.getCity_ascii()+" "+g.getId());
// }

//  }


// nearer city display by passing city

// System.out.println("city name is    :");
// String cityName=u.next();
// String s=null;
// List<CityModel>d=new ArrayList<>();
// for(CityModel g:modelList){
    
// if(g.getCity().matches("(.*)"+cityName+"(.*)"))
// {
// //    System.out.println("equal");
// s=g.getCountry();
// }
// }
// for(CityModel g:modelList){
// if(s.matches("(.*)"+g.getCountry()+"(.*)")){
//     System.out.println(g.getCountry()+" "+g.getCity());
//  }

// }

System.out.println("country name is    :");
String countryName=u.next();
List<CityModel>d=new ArrayList<>();
for(CityModel g:modelList){
    
if(g.getCountry().matches("(.*)"+countryName+"(.*)"))
{

   System.out.println(g.getCountry()+" "+g.getCapital());
}

 }


//avng sum not ss
// String line=null;
// String splitBy=",";
// List<Modelnew> modelList = new ArrayList<Modelnew>();
// try{
//  BufferedReader br=new BufferedReader(new FileReader("F:\\filehandling-main\\file\\src\\main\\resources\\worldcities.csv"));
//  while((line=br.readLine())!=null){
//      String[]model=line.split(splitBy);

//      modelList.add(new Modelnew(model[0], model[1], model[2], model[3], model[4], model[5], model[6], model[7], model[8], Long.parseLong(model[9]), model[10]));
//  }
// }catch(IOException e){
//  e.printStackTrace();
// }
// System.out.println("enter country name");
// String countryname=u.next();
// List<Long>cityPop = new ArrayList<Long>();

// for(Modelnew g:modelList){
    
//      if(g.getCountry().matches("(.*)"+countryname+"(.*)"))
//      {
//         cityPop.add(g.getPopulation());
//      }
// }

// long sum=0;

// // for(long s:cityPop){
// //     sum=sum+s;
// // }




// System.out.println(cityPop);
    }
}

   