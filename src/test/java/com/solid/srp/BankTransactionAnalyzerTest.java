package com.solid.srp;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class BankTransactionAnalyzerTest {

    @Test
    void readFile_from_resources() {
        Path path = Paths.get("src/java/resources/DataSample.csv");
        String answer = "DataSample.csv";

        assertThat(path.getFileName().toString()).isEqualTo(answer);
    }
}
