package example01;

public class Employee {
    private String name;        //이름
    private String phone;       //전화번호
    private String dept;        //부서 이름
    private int empNo;          //사원번호
    private int salary;         //월급
    private String account;     //계좌번호
    private String position;    //직급

    //생성자(이름과 전화번호만 알 때)
    Employee(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.dept = "미정";
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }
    //생성자2(이름 전화번호 부서를 알 때)
    Employee(String name, String phone, String dept){
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = 1;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }
    //생성자3(모든 정보를 알 때)
    Employee(String name,
             String phone,
             String dept,
             int empNo,
             int salary,
             String account,
             String position){
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }

    //사원 정보 출력 메서드
    public void printInfo(){
            System.out.println(
                            this.name + " / " +
                            this.phone + " / " +
                            this.dept + " / 사원번호 : " +
                            this.empNo + " / 직급 : " +
                            this.position + " / 월급 : " +
                            this.salary + " / 계좌 : " +
                            this.account);
    }

    //사원 정보 수정용 메서드
    public void setDept(String dept){ this.dept = dept;}
    public void setEmpNo(int empNo){ this.empNo = empNo;}
    public void setSalary(int salary){ this.salary = salary;}
    public void setAccount(String account){ this.account = account;}
    public void setPosition(String position){ this.position = position;}

    //게터
    public String getName() { return name;}
    public int getSalary(){ return salary;}
    public String getAccount(){ return account;}
    public int getEmpNo(){ return empNo;}
    public String getPhone(){ return phone;}
    public String getDept(){ return dept;}
    public String getPosition(){ return position;}

    //연봉 계산 메서드
    int calcYearSalary(){ return this.salary*12;}

    //연봉 + 직급별 보너스를 포함한 연봉
    int calcYearSalaryWithBonus(){
        int totalSalary = 0;
        if(this.position.equals("사원")){
            totalSalary = (int) (this.calcYearSalary() + (this.calcYearSalary()*0.1));
        } else if(this.position.equals("대리")){
            totalSalary = (int) (this.calcYearSalary() + (this.calcYearSalary()*0.2));
        } else if(this.position.equals("과장")){
            totalSalary = (int) (this.calcYearSalary() + (this.calcYearSalary()*0.3));
        }else if(this.position.equals("부장")){
            totalSalary = (int) (this.calcYearSalary() + (this.calcYearSalary()*0.4));
        }
        return totalSalary;
    }

    //승진 메서드
    public void promote(){
        if(this.position.equals("사원")){
            this.position="대리";
            this.salary = (int) (this.salary*1.1);
        } else if (this.position.equals("대리")){
            this.position="과장";
            this.salary = (int) (this.salary*1.1);
        } else if (this.position.equals("과장")){
            this.position="부장";
            this.salary = (int) (this.salary*1.1);
        } else if (this.position.equals("부장")){
            //포지션은 유지, 월급만 인상
            this.salary = (int) (this.salary*1.1);
        }
    }
}
