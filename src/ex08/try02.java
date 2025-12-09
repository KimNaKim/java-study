package ex08;

class Service{
    static void loginProcess(String id, String pw){
        if(id.length() < 5){
            throw new RuntimeException("id의 길이가 5자 이하입니다.");
        }
        if(!pw.equals("1234")){
            throw new RuntimeException("비밀번호가 틀렸습니다.");
        }
    }
}

//잘못된 경우에 처리하는 곳 (예외 처리를 하는 곳으로 약속됨)
//srp 원칙이 성립
class Controller{
    static void login(String id, String pw){
        try{
            Service.loginProcess(id, pw);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

}


public class try02 {
    static void main() {
        Controller.login("ssar123","1233");
    }
}
