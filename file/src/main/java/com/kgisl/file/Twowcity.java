package com.kgisl.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Twowcity {

	public static void main(String[] args) throws IOException, CsvException {
		CSVReader reader = new CSVReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
        List<String[]> allRows = reader.readAll();
        ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> two = new ArrayList<String>();
        for (String[] row : allRows) {
        
	data.add(row[0]);
			}

			for(String a:data){
				String[]work=a.split(" ");
				if(work.length==2){
					two.add(a);
				}
			}

	System.out.println(two);

}

		   
	}


