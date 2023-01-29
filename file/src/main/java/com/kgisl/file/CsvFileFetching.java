package com.kgisl.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CsvFileFetching {
    public static void main(String[] args) throws IOException, CsvException {
        
    
        CSVReader reader = new CSVReader(new FileReader("F:\\filehandling-main\\file\\src\\main\\resources\\worldcities.csv"));
 List<String[]> allRows = reader.readAll();
   // cities ending with ing
// ArrayList<String> data = new ArrayList<String>();
// for (String[] row : allRows) {
//          data.add(row[0]); 
       
//         }
//         List<String>fin=new ArrayList<String>();
//         for (String r : data) {
//            if(r.endsWith("ing")){
//             fin.add(r);
//            }
//            else{

//               }
//          }
//            System.out.println(fin);
      //-------------------------------------------------------------------------------------------
      //String to double  
// ArrayList<String> popdata = new ArrayList<String>();
// ArrayList<Double> popdouble = new ArrayList<Double>();
// for (String[] row : allRows) {
//          popdata.add(row[9]); 
         
       
//         }
// for(String d:popdata){
//     if(d!=null && d!=""){
//     popdouble.add(Double.parseDouble(d));
  
//     }
// }
// System.out.println(popdouble);
//------------------------------------------------------------------------------------------
//String to float
ArrayList<String> popdata = new ArrayList<String>();
ArrayList<Float> popfloat = new ArrayList<Float>();
for (String[] row : allRows) {
         popdata.add(row[9]); 
         
       
        }
for(String d:popdata){
    if(d!=null && d!=""){
    popfloat.add(Float.parseFloat(d));
  
    }
}
System.out.println(popfloat);

   }
}