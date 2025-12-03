package algo;

public class ChangeData02 {
    public static void main(String[] args) {
        //배열의 값을 오름차순으로 정렬하는 코드(버블 정렬)
        int[] arr = {2,8,6,7,4,3,1,5,10,9};
        int temp;

        /*if(arr[0]>arr[1]){
            temp = arr[1];
            arr[1]=arr[0];
            arr[0] = temp;
        }
        if(arr[1] > arr[2]){
            temp = arr[2];
            arr[2] = arr[1];
            arr[1] = temp;
        }
        if(arr[0] > arr[1]){
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }*/
        
        for(int k = 0; k<arr.length; k++){
            for(int i = 1; i<arr.length-k; i++){
                if(arr[i]<arr[i-1]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }


        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
