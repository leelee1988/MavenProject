package com.company;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    private static final String CSV_FILE_PATH = "src/Data/SEOExample.csv";

    public static void main(String[] args) throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
        CSVReader csvReader = new CSVReader(reader);
        List<String[]> records = csvReader.readAll();
        for(String[] record : records){
            System.out.print(record[0] + ", ");
            System.out.print(record[1] + ", ");
            System.out.print(record[2] + ", ");
            System.out.print(record[3] + ", ");
            System.out.print(record[4] + ", ");
            System.out.print(record[5] + ", ");
            System.out.print(record[6] + ", ");
            System.out.print(record[7] + ", ");
            System.out.print(record[8] + ", ");
            System.out.println(record[9]);

        }
    }
}