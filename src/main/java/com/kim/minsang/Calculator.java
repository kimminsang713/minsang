package com.kim.minsang;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
//    요구사항
//    String으로 된 문자열을 받는다 o
//    덧셈을 해서 결과값을 반환해주는 함수를 구현한다.
//    이때, 숫자와 숫자를 구분할때는 , 로 구분
//    음수가 들어올수 없다. 따라서 결과값은 무조건 양수이다.
//    예 )
//            1. "1" => 1
//            2. "1,2" => 3
//            3. "1,2,3" => 6
//            4. "1, 2, 3" => 6
//            6. "1, 1 2 3 4, 5," => 1240
//            7. ",,,1,2" => 3
//            8. "" =>
    public static void caluclator(){
        // 값을 받을 리스트 선언
        String num = "";
        String str = "";
        Scanner scan = new Scanner(System.in);
       // 포문으로 값을 사용자한테 받아 저장하기
        for(int i=0; i<=2; i++){
            System.out.print("숫자 입력 : ");
            num = scan.nextLine();
            str += num+",";
        }
        System.out.print(str);

        // 더하기


    }


}
