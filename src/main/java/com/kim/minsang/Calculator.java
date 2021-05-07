package com.kim.minsang;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
//    요구사항
//    1.String으로 된 문자열을 받는다 o -> 음수가 들어올수 없다.음수가 들어올수없으러면 입력받을때 체크하고 리턱시켜야행
//    2.덧셈을 해서 결과값을 반환해주는 함수를 구현한다. o
//    3.이때, 숫자와 숫자를 구분할때는 , 로 구분
//    4.음수가 들어올수 없다. 따라서 결과값은 무조건 양수이다.
//    예 )
//            1. "1" => 1
//            2. "1,2" => 3
//            3. "1,2,3" => 6
//            4. "1, 2, 3" => 6
//            6. "1, 1 2 3 4, 5," => 1240
//            7. ",,,1,2" => 3
//            8. "" =>
    public static void caluclator(){
        // 값을 받을 변수
        String num = "";
        String str = "";
        int i = 0;
        int result = 0;

        Scanner scan = new Scanner(System.in);

        // 사용자가 몇번 입력할지 정함
        System.out.print("몇번 입력하시겠습니까? : ");
        int size = scan.nextInt();
        scan.nextLine();


        // 반복문으로
        while(i<size){ // 3번돌면 반복문 빠져나가게
            System.out.print("숫자 입력 : ");
            num = scan.nextLine();

//            if(Integer.valueOf(num) < 0 ){ // 입력받은 값이 음수인지 체크
//                System.out.print("음수는 입력할 수 없습니다. 다시 입력해주세요 ");
//                i--;
//            }else{
//
//            }
            i++;
            str += num+",";
        }
        // split을 통해 ,로 구분지어 배열에 담기
        String arr[] = str.split(",");

//        배열에서 포문으로 값을 빼온뒤 더하기
        for(int j=0; j<arr.length; j++){
             result+=Integer.valueOf(arr[j]);
             System.out.print(arr[j] + ",");
        }
        //결과
        System.out.print("=>" + result);


    }


}
