package com.solid.srp;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BankTransactionAnalyzerTest {

    @Test
    void readFile_from_resources() {
        Path path = Paths.get("/src/main/resources/DataSample.csv");
        String answer = "DataSample.csv";

        assertThat(path.getFileName().toString()).isEqualTo(answer);
    }

    @Test
    void readLine_and_seperate() throws IOException {
        Path path = Paths.get("src/main/resources/DataSample.csv");
        List<String> data = Files.readAllLines(path);
        // Check File is exists
        assertThat(Files.exists(path)).isTrue();

    }
}
