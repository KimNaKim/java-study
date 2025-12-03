package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
         int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요. : ");
        grade = sc.nextInt();
        //다중 if-else문
        if (grade >= 95){
            System.out.println("A+등급입니다.");
        }else if (grade >= 90){
            System.out.println("A0등급입니다.");
        }else if (grade >= 80){
            System.out.println("B등급입니다.");
        }else if (grade >= 70){
            System.out.println("C등급입니다.");
        }else if (grade >= 60){
            System.out.println("D등급입니다.");
        }else {
            System.out.println("F등급입니다.");
        }
    }
}
