package ex04;

public class People {
    //private 접근 제어자(타 파일에서는 직접 접근이 불가능)
    //OOP에서는 무조건 상태에 직접 접근을 불가하게 만들어야 한다.
    private String name;
    private int height;
    private int weight;

    //초기화 코드, 생성자 오버로딩
    //해당 코드로 생성자를 직접 만들었을 경우, 디폴트 생성자는 생겨나지 않음 (직접 선언해야 함)
    People(){}
    People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //상태변경 메서드
    public void eat(){
        weight += 2;
    }

    //상태확인 메서드(게터)
    public int getWeight(){
        return weight;
    }
}
