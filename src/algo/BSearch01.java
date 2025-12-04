package algo;

import java.util.Arrays;

public class BSearch01 {
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,3};

        //1. 정렬
        Arrays.sort(arr);

        //2. 검색


        if(arr[2] == 2){
            System.out.println("2를 찾았습니다.");
        }
        if(2<arr[2]){   //찾을 방향을 가늠하기
            System.out.println("2는 arr[2]보다 작습니다.");

            if(2 == arr[1]){
                System.out.println("2를 찾았습니다.");
            }
        }

        System.out.println("메인 끝");
    }
}
