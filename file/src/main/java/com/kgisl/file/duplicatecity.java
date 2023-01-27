package com.kgisl.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class duplicatecity {
    public static void main(String[] args) throws IOException, CsvException {
    CSVReader reader = new CSVReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
        List<String[]> allRows = reader.readAll();
        ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> two = new ArrayList<String>();
        for (String[] row : allRows) {
        
	data.add(row[0]);
			}
           
        Set<String> s = new HashSet<String>();

        for(String name : data) {
            if(s.add(name) == false)
                System.out.println(name);
        }
            }


}
