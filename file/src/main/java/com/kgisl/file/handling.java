package com.kgisl.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class handling {
    public static void main( String[] args ) throws IOException, CsvException
    {
    CSVReader reader = new CSVReader(new FileReader("D:\\praveen\\java\\file\\src\\main\\resources\\worldcities.csv"));
    List<String[]> allRows = reader.readAll();
    for(String[] row:allRows)
    {
        System.out.println(Arrays.toString(row));
    }
}}
