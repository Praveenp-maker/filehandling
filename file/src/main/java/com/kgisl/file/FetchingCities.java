package com.kgisl.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.swing.event.SwingPropertyChangeSupport;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

public class FetchingCities {
    public static void main( String[] args ) throws IOException, CsvException
    {
    CSVReader reader = new CSVReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
    // for (String[] go : reader) {
    //     System.out.println(go[0]);
    // }


    List<String[]> allRows = reader.readAll();
   //ArrayList<String> data = new ArrayList<String>();


//___________________________________________________________________________________________________________________
//Reading all values   
// for(String[] row:allRows)
    // {
    //     System.out.println(Arrays.toString(row));
    // }}}
//___________________________________________________________________________________________________________
//fetching cities name
// for (String[] row : allRows) {
//     data.add(row[0]); 
   
//     }
//    reader.close();
//    System.out.print(data);


//    }
   
//    }
   //-------------------------------------------------------------------------------------------------------------
//unique cities
//    for (String[] row : allRows) {
//         data.add(row[0]); 
       
//         }
//        reader.close();
//        List<Object> distinctCompanies = data
//        .stream()
//        .distinct()
//        .collect(Collectors.toList());



// //System.out.println(distinctCompanies);

// for (Object distinctCompany : distinctCompanies) {
//     data.remove(distinctCompany);
// }

// //print duplicate elements
// System.out.println(data);

// }
    
       
       
//        }

//------------------------------------------------------------------------------------------------------

//duplicate cities
// for (String[] row : allRows) {
//     data.add(row[0]); 
   
//     }
//    reader.close();
//    List<Object> distinctCompanies = data
//    .stream()
//    .distinct()
//    .collect(Collectors.toList());

// for (Object distinctCompany : distinctCompanies) {
// data.remove(distinctCompany);
// }

// //print duplicate elements
// System.out.println(data);

// }

   
   
//    }
//--------------------------------------------------------------------------------------------------------

//cities count
// ArrayList<String> data = new ArrayList<String>();
// for (String[] row : allRows) {
//          data.add(row[0]); 
       
//         }
//         long total =  data.stream().distinct().sorted().count();     //distinct cities
//         System.out.println(total);
// System.out.println(data.size());

//     }}

//-----------------------------------------------------------------------------------------------------------
//Less populated city
// ArrayList<String> data = new ArrayList<String>();
// for (String[] row : allRows) {
    
//             data.add(row[0]); 
//             data.add(row[9]);
           
//             }
          
//           System.out.println(data);

//           List<Object> distinctCompanies = data
//                  .stream()
//                  .distinct()
//                  .collect(Collectors.toList());
          
          
          
        
//           for (Object distinctCompany : distinctCompanies) {
//               data.remove(distinctCompany);
//           }
//          // System.out.println(distinctCompanies);

//          distinctCompanies.sort(null);
//          System.out.println(distinctCompanies.get(0));
//     }

// }
//--------------------------------------------------------------------------------------------------------------
//country name A-Z
// ArrayList<String> data = new ArrayList<String>();
// for (String[] row : allRows) {
    
//             data.add(row[4]); 
//         }
//            // System.out.println(data);
//            TreeSet<String> tree_set
//            = new TreeSet<String>(data);

   
//        System.out.println(
//                           tree_set);
      
//         }}
//----------------------------------------------------------------------------------------------------------
   
// ArrayList<String> data = new ArrayList<String>();
//  for (String[] row : allRows) {
    
//             data.add(row[0]); 
//         }
// ArrayList<String> h=new ArrayList<String>();

//allRows.stream().filter()


//-------------------------------------------------------------------------------------------------------
//unique capital
//  ArrayList<String> data = new ArrayList<String>();
// for (String[] row : allRows) {
//          data.add(row[8]); 
       
//         }
// List<Object> distinctCompanies = data
//        .stream()
//        .distinct()
//        .collect(Collectors.toList());
//         System.out.println(distinctCompanies);
      
       

//     }}
//---------------------------------------------------------------------------------------------------------
//cities ending with ing
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

//    }}
//----------------------------------------------------------------------------------------------------------


// ArrayList<String> data = new ArrayList<String>();
// for (String[] row : allRows) {
//          data.add(row[0]); 
//     }

//     List<String>Two=new ArrayList<String>();
// for(String s:data){
//     if(s.indexOf(1)==1){
//         Two.add(s);
//     }
// }
// System.out.println(Two);
//     }}
//---------------------------------------------------------------------------------------------------
//sum and avg of population
// ArrayList<String> data = new ArrayList<String>();
// for (String[] row : allRows) {
//          data.add(row[9]); 
//     }
//     int sum=0;
//     int avg=0;
//     for(int i=0;i<data.size();i++){
//          sum+=i;


//     }
//     avg=sum/data.size();
//     System.out.println(sum+" "+avg);
//     }}
//--------------------------------------------------------------------------------------------------------
// ArrayList<String> data = new ArrayList<String>();
// Map<String,String>m= new HashMap<String,String>();
// for (String[] row : allRows) {
//         m.put(row[0], row[4]);
//     }
    // Map<Object, Long>p=((Collection<String[]>) m).stream().collect(Collectors.groupingByConcurrent(,Collectors.counting()));
    // System.out.println(p);
 //------------------------------------------------------------------------------------------------------

//  ArrayList<String> data = new ArrayList<String>();
//  for (String[] row : allRows) {
//     data.add("city "+row[0]);
//            data.add("pop "+row[9]); 
        
//          }
//          System.out.println(data);
//lower upper
// ArrayList<String> data = new ArrayList<String>();
// ArrayList<String> da = new ArrayList<String>();
// for (String[] row : allRows) {
//              data.add(row[0]); 
//         }
//         for(String a:data){
//            da.add(a.toUpperCase());
//         }
//         System.out.println(da);

//ArrayList<String> data = new ArrayList<String>();
// ArrayList<Double> da = new ArrayList<Double>();
//  for (String[] row : allRows) {          
//        data.add(row[2]); 
          
//         }
//       //  String[] doubleValues = Arrays.stream(data)
//         .mapToDouble(Double::parseDouble)
//         .toArray();
//         // for(String j:data){
//         //     if (j != null) {
//         //     Double d= Double.valueOf(j);
//         //     da.add(d);
//         //     } 
//         // }
//         System.out.println(doubleValues);
 }}
