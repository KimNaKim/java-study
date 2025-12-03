package ex03;

public class ForTest02 {
    public static void main(String[] args) {
        //문제 1번
        System.out.println("1. 1부터 10까지를 출력해라.");
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println();

        //문제 2번
        System.out.println("2.20부터 11까지를 출력해라.");
        for (int i = 20; i>=11; i--){
            System.out.println(i);
        }
        System.out.println();

        //문제 3번
        System.out.println("3. 1부터 10까지의 합을 출력해라.");
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
        System.out.println();

        //문제 4번
        System.out.println("4. 별 찍기");
        for(int i = 5; i>=1; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //도전문제 5번
        System.out.println("5. 별 찍기(도전)");
        for(int i = 1; i<= 5; i++){

            for(int k = 5; k>=i; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
