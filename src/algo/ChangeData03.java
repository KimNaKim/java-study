package algo;

public class ChangeData03 {
    public static void main(String[] args) {
        //삽입 정렬
        int[] arr = {2,8,6,7,4,3,1,5,10,9};
        int temp;

        //노가다
        /*temp = arr[1];
        if(arr[1]<arr[0]) {
            arr[1] = arr[0];
            arr[0] = temp;
        }
        temp = arr[2];
        if(arr[2]<arr[1]){
            arr[2] = arr[1];
            arr[1] = temp;
        }
        temp = arr[2];
        if(arr[2]<arr[0]){
            arr[2] = arr[0];
            arr[0] = temp;
        }*/

        //2->1 / 3->2->1/ 4->3->2->1 /

        for(int i = 1; i<arr.length; i++){
            for(int k=0; k<i; k++){
                if(arr[i]<arr[k]){
                    System.out.println(arr[i] +"은(는) " + arr[k] + "보다 작으므로 둘을 바꿉니다.");
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }else{
                    System.out.println(arr[i] +"은(는) " + arr[k] + "보다 작지 않습니다.");
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
