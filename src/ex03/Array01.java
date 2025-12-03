package ex03;

public class Array01 {
    public static void main(String[] args) {
        //극장 안의 관객 수 세기
        int [][] seats = {
                {0,0,0,1,1,0,0,0,0,0},
                {0,0,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,0}};
        int count = 0;
        for(int i = 0; i<seats.length; i++){
            for(int k=0; k<seats[i].length; k++){
                count += seats[i][k];
            }
        }
        System.out.println("현재 관객 수는 " + count + "명입니다.");
        System.out.println();

        //학생의 테스트 점수를 계산하는 코드
        int[][] scores = {
                {100,100,100,100,100},
                {75,60,80,100,50},
                {80,70,60,90,40}};
        int finalSum = 0;
        int finalCount = 0;
        for(int i = 0; i<scores.length; i++) {
            int sum = 0;
            int count2 = 0;
            for (int k = 0; k < scores[i].length; k++) {
                sum += scores[i][k];
                count2++;
                finalSum += scores[i][k];
                finalCount++;
            }
            System.out.println((i+1) + "번째 학생의 평균 점수 : " + sum/count2);
        }
        System.out.println("전체 평균 점수 : " + finalSum/finalCount);
    }
}
