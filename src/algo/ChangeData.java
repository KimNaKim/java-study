package algo;

public class ChangeData {
    public static void main(String[] args) {
        //선언한 배열의 순서를 반대로 바꾸는 코드
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        /*int rev;
        rev = arr[9];
        arr[9] = arr[0];
        arr[0] = rev;
        rev = arr[8];
        arr[8] = arr[1];
        arr[1] = rev;
        rev = arr[7];
        arr[7] = arr[2];
        arr[2] = rev;
        rev = arr[6];
        arr[6] = arr[3];
        arr[3] = rev;
        rev = arr[5];
        arr[5] = arr[4];
        arr[4] = rev;*/

        for(int i = 0; i<arr.length/2; i++){
            int save;
            int otherSide = arr.length-1-i;
            save = arr[otherSide];
            arr[otherSide] = arr[i];
            arr[i] = save;
        }


        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
