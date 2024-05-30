package ru.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.*;


@Getter
@Setter
@Slf4j
@Component
public class ComponentClass {
    private static final String from = "C:\\study\\jaba\\practic12\\first-file.txt";
    private static final String to = "C:\\study\\jaba\\practic12\\second-file.txt";

    @PostConstruct
    public void postConstruct() {
        log.info("Started!");
    }

    @PreDestroy
    public void preDestroy() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to));
        if (new File(from).exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(from));
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
            bufferedWriter.write(String.valueOf(text.hashCode()));
            bufferedReader.close();
        } else {
            bufferedWriter.write("null");
        }
        bufferedWriter.close();
    }
}
