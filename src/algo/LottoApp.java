package algo;

import java.util.Random;

public class LottoApp {
    static void main() {
        Random random = new Random();
        int[] arr = new int[6];
        int count = 0;

        //로또번호 추첨하기
        while(count < 6){
            boolean isDup = false;
            int num = random.nextInt(45)+1;
            try{
                for(int i = 0; i<count; i++){
                    if(arr[i] == num){
                        isDup = true;
                    }
                }
            }catch (Exception e){
                arr[count] = 0;
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
