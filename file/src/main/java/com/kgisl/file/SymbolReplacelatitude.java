package com.kgisl.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class SymbolReplacelatitude {
    public static void main( String[] args ) throws IOException, CsvException
    {  
        CSVReader reader = new CSVReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
        List<String[]> allRows = reader.readAll();
        ArrayList<String> data = new ArrayList<String>();
        for (String[] row : allRows) {
               data.add("lat  "+row[2].replace("-",""));
               data.add("lng  "+row[3].replace("-",""));
               
                }
            System.out.println(data);
            
            }
}
