package ex06;

class Data{
    int num;

    public Data(int num){
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

public class MyHash01 extends Object {
    static void main() {
        //상태가 같은 2개의 Data 클래스 선언
        Data d1 = new Data(1);
        Data d2 = new Data(1);
        Data d3 = d1;               //얕은 복사

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d3.hashCode());

        if(d1.hashCode() == d2.hashCode()){
            System.out.println("같은 주소에 있는 객체");
        }else{
            System.out.println("다른 주소에 있는 객체");
        }

        if(d1.num == d2.num){
            System.out.println("같은 상태");
        }else{
            System.out.println("다른 상태");
        }

        if(d1.hashCode() == d3.hashCode()){
            System.out.println("같은 주소에 있는 객체(얕은 복사)");
        }else{
            System.out.println("다른 주소에 있는 객체");
        }
    }
}
