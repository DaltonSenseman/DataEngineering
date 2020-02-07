package io.daltonsenseman.github;

import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException, CsvValidationException {
        // calls parser and prints the data
        CsvParser csvP = new CsvParser("src/Data/SEOExample.csv");
        csvP.printCsv();
    }
}
