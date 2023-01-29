package com.kgisl.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class FetchingValues {

  //unique cities
   public void fetchingUniqueCity(List<CityModel> modelList) {
    List<String>cityname=new ArrayList<String>();
    for(CityModel s:modelList){
        cityname.add(s.getCity());
    }
    
    List<String> distinctCompanies = cityname
           .stream()
           .distinct()
           .collect(Collectors.toList());
    System.out.println(distinctCompanies);
 }


 //----------------------------------------------------------------------------------------------------------
 //cities without space
      public void cityWithoutSpace(List<CityModel> modelList){
        List<String>cityname=new ArrayList<String>();
        List<String>citynospcae=new ArrayList<String>();
        for(CityModel s:modelList){
            cityname.add(s.getCity());
        }

        for(String s:cityname) {
     	   if(s=="New York"){
       	 s=  s.replaceAll("\\s", "");
          citynospcae.add(s);
         }
         citynospcae.add(s);
           }
     //    System.out.println(citynospcae);

      }
//----------------------------------------------------------------------------------------------------------
//duplicate cities
public void duplicateCity(List<CityModel> modelList){
  List<String>cityname=new ArrayList<String>();
  for(CityModel s:modelList){
      cityname.add(s.getCity());
  }
   Set<String> s = new HashSet<String>();
       for(String name : cityname) {
          //  if(s.add(name) == false)
             //   System.out.println(name);
        }
            }
//-------------------------------------------------------------------------------------------------------
//lat lang 3 char
public void threelatlangvalues(List<CityModel> modelList){
  ArrayList<String> data = new ArrayList<String>();
 
  for (CityModel row : modelList) {
         data.add("lat  "+row.getLat().substring(0,4)); 
         data.add("lng  "+row.getLng().substring(0,4));
         
          }


          System.out.println(data);
        }
//-----------------------------------------------------------------------------------------------
//symbol replacement
public void symbolReplaceLatLang(List<CityModel> modelList){
  ArrayList<String> data = new ArrayList<String>();
 
  for (CityModel row : modelList) {
         data.add("lat  "+row.getLat().replace("-",""));
         data.add("lng  "+row.getLng().replace("-",""));
         
          }


          System.out.println(data);

}
//-----------------------------------------------------------------------------
//two word cities
public void twoWordCities(List<CityModel> modelList){
  ArrayList<String> data = new ArrayList<String>();
  ArrayList<String> twowordcities = new ArrayList<String>();
 
  for (CityModel row : modelList) {
         data.add(row.getCity());

        }
        for(String a:data){
          String[]work=a.split(" ");
          if(work.length==2){
            twowordcities.add(a);
          }
        }
  
    System.out.println(twowordcities);
}
//---------------------------------------------------------------------------------
//cities count
public void fetchingCityCount(List<CityModel> modelList) {
  List<String>cityname=new ArrayList<String>();
  for(CityModel s:modelList){
      cityname.add(s.getCity());
  }
  System.out.println(cityname.size());
}
//--------------------------------------------------------------------------------
//Countryname ascending
public void countrynamesort(List<CityModel> modelList){
  List<String>cityname=new ArrayList<String>();
  for(CityModel s:modelList){
      cityname.add(s.getCountry());
  }
  TreeSet<String> tree_set= new TreeSet<String>(cityname);
   System.out.println(tree_set);
  
  }
//----------------------------------------------------------------------------------
//unique capital
public void uniqueCapital(List<CityModel> modelList){
  List<String>capitalnames=new ArrayList<String>();
  for(CityModel s:modelList){
      capitalnames.add(s.getCapital());
  }
List<Object> distinctCompanies = capitalnames
        .stream()
        .distinct()
        .collect(Collectors.toList());
         System.out.println(distinctCompanies);

}
//------------------------------------------------------------------------------------
//country wise city count     
//country wise state count


public void Countrywisecitycount(List<CityModel> modelList){
  Map<String, Long> result = modelList.stream().map(m->m.getCountry())
  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  for (Map.Entry<String,Long> entry : result.entrySet()) {
   System.out.println("country = " + entry.getKey() +
                    ", cities count = " + entry.getValue());
}}
//----------------------------------------------------------------------------------------
//city in same lat
public void cityinsamelat(List<CityModel> modelList){
        Map <String,ArrayList<String>> mp=new HashMap<String,ArrayList<String>>();
        for (CityModel m:modelList) {
            String lat1=m.getLat();
            ArrayList<String> li=new ArrayList<String>();
            for (CityModel model : modelList) {
                //System.out.println(lat1);
                String lat2=model.getLat();
                //System.out.println(lat2);

                if(lat1.matches("(.*)"+lat2+"(.*)")){
                     li.add(model.getCity());
                  
                }
            }
            mp.put(lat1, li);
        }
       System.out.println(mp);

}
//--------------------------------------------------------------------------------
//give city name and fetch all values 
public void givecitynamefetchall(List<CityModel> modelList,String s){
System.out.println("city name is    :");
String cityName=s;
List<CityModel>d=new ArrayList<>();
for(CityModel g:modelList){
    
if(g.getCity().matches("(.*)"+cityName+"(.*)"))
{
   //System.out.println("equal");
   System.out.println(g.getCity()+" "+g.getCity_ascii()+" "+g.getLat()+" "+g.getLng()+g.getCountry()+" "+g.getIso2()+" "+g.getIso3()+" "+g.getAdmin_name());
}

 }

}

    
//-------------------------------------------------------------------------------------------------
//pass city display nearer  city
public void passcitydisplaynearercity(List<CityModel> modelList,String s){
 

String cityName=s;
List<CityModel>d=new ArrayList<>();
for(CityModel g:modelList){
    
if(g.getCity().matches("(.*)"+cityName+"(.*)"))
{
//    System.out.println("equal");
s=g.getCountry();
}
}
for(CityModel g:modelList){
if(s.matches("(.*)"+g.getCountry()+"(.*)")){
    System.out.println(g.getCountry()+" "+g.getCity());
 }

}
}
//----------------------------------------------------------------------------------------------------

//pass country name and get capital ss
public void passcountrygetcapital(List<CityModel> modelList,String s){
String countryName=s;
List<CityModel>d=new ArrayList<>();
for(CityModel g:modelList){
    
if(g.getCountry().matches("(.*)"+countryName+"(.*)"))
{

   System.out.println(g.getCountry()+" "+g.getCapital());
}

 }
}
//------------------------------------------------------------------------------------------
//upper lower case
public void toupperlower(List<CityModel> modelList){
 

List<String>cityname=new ArrayList<String>();
ArrayList<String> data = new ArrayList<String>();
  for(CityModel h:modelList){
      cityname.add(h.getCity());
  }
        for(String y:cityname){
           data.add(y.toUpperCase());
        }
        System.out.println(data);
}
//-----------------------------------------------------------------------------------------------------


//selected country sum avg of population  not ss

public void selectedcountrysum(List<CityModel> modelList,String s){
List<String>cityPop = new ArrayList<String>();
String countryname=s;
for(CityModel g:modelList){
    
     if(g.getCountry().matches("(.*)"+countryname+"(.*)"))
     {
        cityPop.add(g.getPopulation());
     }
 }

 ArrayList<String>g=new ArrayList<String>();
 g.add("10");
 g.add("10");
 g.add("10");
 g.add("10");
 g.add("10");
List<Integer> data=cityPop.stream().map(Integer::parseInt).collect(Collectors.toList());
//System.out.println(data);
int[]find=data.stream().mapToInt(Integer::intValue).toArray();

int sum=0,avg=0;
for(int i:find){
    sum=sum+i;
}
avg=sum/find.length;
System.out.println(sum+" "+avg);
}
//-----------------------------------------------------------------------------------------------
//order city by population
public void ordercitybypopulation(List<CityModel>modelList){
TreeMap<String,String>fmap=new TreeMap<>();
for(CityModel f1:modelList){
  String key=f1.getPopulation();
 String value=f1.getCity();
 fmap.put(key, value);
}
for(Map.Entry m:fmap.entrySet()){
  System.out.println(m.getKey()+" "+m.getValue());
}
}
//-----------------------------------------------------------------------------------------------------
//less populated city
public void lesspopulatedcity(List<CityModel>modelList){
  HashMap<String,String> map=new HashMap<String,String>();    
     for (CityModel m:modelList) {
  String key=m.getCity();
     String value=m.getPopulation();
           map.put(key, value);
      }
Entry<String, String> min = Collections.min(map.entrySet(),
 Comparator.comparing(Entry::getValue));
System.out.println(min.getKey()+" "+min.getValue());
    }
//------------------------------------------------------------------------------------------------------
//country input order city by pop
public void countryipordercitybypopulation(List<CityModel>modelList,String s){

  TreeMap<String,String>fmap=new TreeMap<>();
  for(CityModel f1:modelList){
    if(s==f1.getCountry()){
    String key=f1.getPopulation();
   String value=f1.getCity();
   fmap.put(key, value);
    }
  }
  for(Map.Entry m:fmap.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
  }
  }
//show same country in different country not ss
// ArrayList<String>citycountry=new ArrayList<>();
// ArrayList<String>citycountryrep=new ArrayList<>();

// for(CityModel s:modelList){
// citycountry.add(s.getCity());
// citycountry.add(s.getCountry());
// }
//   for(String s:citycountry){
//     if(s=="India"){
//         s.replace("d", "a");
//         citycountryrep.add(s);
//     }
//     citycountryrep.add(s);
//   }
//  System.out.println(citycountryrep);
// }
}
