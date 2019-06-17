package kr.otawang;

import java.util.Arrays;
import java.util.Collections;

public class StringCalculator {

    public int add(String str) {

        if (str.isEmpty()) {
            return 0;
        }

        return Arrays.stream(str.split(",|:"))
                .mapToInt(Integer::parseInt).sum();
//
//        String[] numbers = str.split(",|:");
//        int sum = 0;
//
//        for(String number : numbers) {
//            sum += Integer.parseInt(number);
//        }
//
//        return sum;
    }

}
