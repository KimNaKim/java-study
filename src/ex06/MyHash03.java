package ex06;

public class MyHash03 {
    static void main() {
        //해시화 방법
        String str = "ABC";
        char[] arr = str.toCharArray();
        int h = 0;

        //step1. 문자를 숫자로 바꾼다
        int n = arr[0];
        h = h * 31 + n;     //임의의 수학적 규칙을 부여해서 암호화
        
        //step2.
        n = arr[1];
        h = h*31+n;

        //step3.
        n = arr[2];
        h = h*31+n;
        System.out.println(h);
    }
}
