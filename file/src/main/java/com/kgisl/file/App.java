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
import java.util.stream.Collectors;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  
        Scanner u=new Scanner(System.in);
         FetchingValues op=new FetchingValues();
       String line="";
       String splitBy=",";
       List<CityModel> modelList = new ArrayList<CityModel>();
       try{
        BufferedReader br=new BufferedReader(new FileReader("F:\\filehandling-main\\file\\src\\main\\resources\\worldcities.csv"));
        while((line=br.readLine())!=null){
            String[]model=line.split(splitBy);
            // System.out.println(model[0]+""+model[1]);
            modelList.add(new CityModel(model[0], model[1], model[2], model[3], model[4], model[5], model[6], model[7], model[8], model[9], model[10]));
        }
       }catch(IOException e){
        e.printStackTrace();
       }
       //System.out.println(modelList.get(4)+">>>>"+modelList.get(8));
       //op.countryWishCityCount(modelList);
    //modelList.stream().map(p->p.getCountry()+" "+p.getCity()).forEach(System.out::println);
// System.out.println(modelList);
      
        // Map mp=new HashMap<String,Integer>();
        // for (CityModel m:modelList) {
        //     String key=m.getCountry();
        //    int count=0;
        //     // List li=new ArrayList<String>();
        //     for (CityModel model : modelList) {
        //         while(key.equals(model.getCountry())){
        //             // li.add(model.getCity());
        //             count=count+1;
        //         }
        //     }
        //     mp.put(key, count);
        // }
        // System.out.println(mp);

      //  op.fetchingUniqueCity(modelList);
       // op.cityWithoutSpace(modelList);
      // op.duplicateCity(modelList);
      //op.threelatlangvalues(modelList);

     // op.symbolReplaceLatLang(modelList);
    // op.twoWordCities(modelList);
   // op.fetchingCityCount(modelList);
   //op.countrynamesort(modelList);

  // op.uniqueCapital(modelList);
  //op.Countrywisecitycount(modelList);
  //op.cityinsamelat(modelList);
 //op.givecitynamefetchall(modelList,"Tokyo");

 //op.passcitydisplaynearercity(modelList,"Tokyo");
op. passcountrygetcapital(modelList,"India");
//op.toupperlower(modelList);
//op.selectedcountrysum(modelList,"India");

//op.ordercitybypopulation(modelList);
//op.lesspopulatedcity(modelList);
//op.countryipordercitybypopulation(modelList,"India");

     
    }
       }
    
  
   