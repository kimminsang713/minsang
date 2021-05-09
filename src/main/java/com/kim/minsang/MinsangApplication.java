package com.kim.minsang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class MinsangApplication {

    //    1. "1" => 1
//            2. "1,2" => 3
//            3. "1,2,3" => 6
//            4. "1, 2, 3" => 6
//            6. "1, 1 2 3 4, 5," => 1240
//            7. ",,,1,2" => 3
//            8. "" =>

    public static void main(String[] args) {
//        SpringApplication.run(MinsangApplication.class, args);
        Calculator.caluclator("1");
        Calculator.caluclator("1,2");
        Calculator.caluclator("1,2,3");
        Calculator.caluclator("1, 2, 3");
        Calculator.caluclator("1, 1 2 3 4, 5,");
        Calculator.caluclator(",,,1,2");
        Calculator.caluclator("");
        Calculator.caluclator(",");
    }

}
