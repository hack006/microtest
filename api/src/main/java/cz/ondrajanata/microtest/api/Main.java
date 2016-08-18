package cz.ondrajanata.microtest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Ondrej Janata on 8.8.16.
 * - janaton1@fel.cvut.cz
 */
@SpringBootApplication
@ComponentScan("cz.ondrajanata.microtest")
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
