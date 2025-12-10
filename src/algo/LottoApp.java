package algo;

import java.util.Random;

public class LottoApp {
    static void main() {
        Random random = new Random();
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        int count = 0;

        //로또번호 개수 추첨하기
        while(count < 10){
            //중복검사
            boolean isDup = false;
            int num = random.nextInt(99);
            for(int i = 0; i<count; i++){
                if(arr[count] == num){
                    isDup = true;
                }
            }
            if(!isDup){
                arr[count] = num;
                count++;
            }
        }
        System.out.print("로또번호 : ");
        for(int i= 0; i<arr.length; i++){

            System.out.print(arr[i] + " ");
        }
    }
}
