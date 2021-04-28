package com.solid.srp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzer {

    public final static String PATHNAME = "src/main/resources/DataSample.csv";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(PATHNAME);

        final List<String> data = Files.readAllLines(path);

        double total = 0d;

        for(String line : data) {
            final String[] columns = line.split(","); // csv separation
            total += Double.parseDouble(columns[1]);
        }

        System.out.println(total);
    }
}
