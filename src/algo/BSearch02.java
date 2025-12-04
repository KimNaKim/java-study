package algo;

import java.util.Arrays;

public class BSearch02 {

    public static void main(String[] args) {
        int[] arr = {4,5,9,1,8,7,2,3,6};

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;
        //찾아야하는 값
        int target = 9;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] ==  target){
                System.out.println(mid + "번째 자리에 " + target + "이 있습니다.");
                break;
            }
            if (arr[mid] < target){
                System.out.println(mid + "번째 자리의 수는 " + target + "보다 작습니다.");
                left = mid + 1;
            } else {
                System.out.println(mid + "번째 자리의 수는 " + target + "보다 작습니다.");
                right = mid - 1;
            }
        }
        if(left==right){
            System.out.println("값을 찾지 못했습니다.");
        }

    }
}
