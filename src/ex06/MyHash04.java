package ex06;

import java.util.HashMap;

public class MyHash04 {
    static void main() {
        //해시맵 생성하기
        HashMap<String, String> arr = new HashMap<>();
        arr.put("age","1");
        arr.put("name","임꺽정");
        System.out.println(arr.get("name"));
        System.out.println(arr.get("age"));
        System.out.println(arr.values());
    }
}
