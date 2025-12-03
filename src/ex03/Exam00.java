package ex03;

public class Exam00 {
    public static void main(String[] args) {
        //도전문제 5번
        String space = " ";
        String star = "*";
        System.out.println("5. 별 찍기(도전)");
        for(int i = 1; i<= 5; i++){

            for(int k = 4; k>=i; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
