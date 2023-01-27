package com.kgisl.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.opencsv.exceptions.CsvException;

//country name pass get capital
public class CountrytNameWithCapital {
    public static void main(String[] args) throws IOException, CsvException {
    Scanner u=new Scanner(System.in);
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

   System.out.println("country name is");
   String d="";
   String s=u.next();
   for(CityModel m:modelList){
   if(s==m.getCountry()){
    d=s+" city is"+m.getCity();
   // System.out.println(s+" "+m.getCity());

   }}

   System.out.println(d);
//   Map mp=new HashMap<String,String>();
//     for (Model m:modelList) {
//         String key=u.next();
// List li=new ArrayList<String>();
//       for (Model model : modelList) {
//            while(key.equals(model.getCountry())){
//                li.add(model.getCity());
             
//            }
//        }
//        mp.put(key, li);
//    }
//    System.out.println(mp);
}
}