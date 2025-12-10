package ex08.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckTry02 {
    //예상 불가능한 Exception(RuntimeException)
    static void m1(int n){
        try{
            int result = 10/n;
            System.out.println(result);
        }catch(RuntimeException e){
            System.out.println("0을 입력하지 마십시오.");
        }
    }
    //예상 가능한 Exception(Exception)
    static void m2(){
        try {
            FileInputStream fis = new FileInputStream("파일명");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    static void main() {
        m1(0);
    }
}
