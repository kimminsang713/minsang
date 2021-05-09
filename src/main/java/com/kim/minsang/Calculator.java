package com.kim.minsang;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
//    요구사항
//    1.String으로 된 문자열을 받는다 o -> 음수가 들어올수 없다.
//    2.덧셈을 해서 결과값을 반환해주는 함수를 구현한다. o
//    3.이때, 숫자와 숫자를 구분할때는 , 로 구분
//    4.음수가 들어올수 없다. 따라서 결과값은 무조건 양수이다.
//    예 )
//    자바 8 문법공부
//    로또 기능구현

    public static void caluclator(String str){
        int result = 0;
//        배열에서 포문으로 값을 빼온 뒤 더하기
        str = blankReplace(str);

        String[] arr= stringToArrayByComma(str);
        for(String num : arr){
            if(isBlank(num)) continue;
            result += Integer.parseInt(num);
        }
        //결과
        System.out.println(result);
    }

    //공백 제거 메소드
    private static String blankReplace(String str){
        return str.replaceAll(" " , "");
    }

    // split을 통해 ,로 구분지어 배열에 담기
    private static String[] stringToArrayByComma(String str){
        return str.split(",");
    }

    private static boolean isBlank(String str){
        return str.equals("");
    }
}
