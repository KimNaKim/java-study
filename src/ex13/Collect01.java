package ex13;

import java.util.ArrayList;

public class Collect01 {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();        //10칸의 배열이 생성됨
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        arr.get(2);

        arr.remove(0);

        boolean isThere = arr.contains(5);
        System.out.println(isThere);

        for(Integer a : arr){
            System.out.println(a);
        }
    }
}
