package example01;


public class EmployeeMain {

    //전체 사원 목록 출력
    static public void printAllEmployees(Employee[] employees, int count){
        for(int i = 0; i<count; i++){
            employees[i].printInfo();
        }
    }

    //총월급계산
    static public int calcTotalMonthSalary(Employee[] e, int count){
        int totalSalary = 0;
        for(int i = 0; i<count; i++){
            totalSalary += e[i].getSalary();
        }
        return totalSalary;
    }
    //총연봉계산
    static public int calcTotalYearSalary(Employee[] e, int count){
        int totalSalary = 0;
        for(int i = 0; i<count; i++){
            totalSalary += e[i].calcYearSalary();
        }
        return totalSalary;
    }
    //총연봉계산(직급보너스포함)
    static public int calcTotalYearSalaryWithBonus(Employee[] e, int count){
        int totalSalary = 0;
        for(int i = 0; i<count; i++){
            totalSalary += e[i].calcYearSalaryWithBonus();
        }
        return totalSalary;
    }

    //사원번호로 찾아서 promote() 실행하기
    static void promoteByEmpNo(Employee[] employees, int count, int empNo){
        for(int i = 0; i<count; i++){
            if(employees[i].getEmpNo()==empNo){
                employees[i].promote();
            }
        }
    }

    //월급 이체 시뮬레이션
    static void payAll(Employee[] employees, int count){
        for(int i = 0; i<count; i++){
            paySalary(employees[i]);
        }
    }

    //계좌이체 알람
    static void paySalary(Employee e){
        System.out.println("[급여 이체 완료] : " +
                e.getName() + "님께 " +
                e.getSalary() + "원이 " +
                e.getAccount() + "계좌로 지급되었습니다.");
    }



    public static void main(String[] args) {
        int count = 0;
        Employee[] employees = new Employee[10];

        // 1. 생성자 오버로딩 사용 예시 ----------------------

        // (1) 이름 + 전화번호만 알고 있는 상태로 입사
        employees[count++] = new Employee("홍길동", "010-1111-1111");
        // 나중에 정보 업데이트
        employees[0].setDept("개발팀");
        employees[0].setEmpNo(1001);
        employees[0].setSalary(3_000_000);
        employees[0].setAccount("111-111-111111");
        employees[0].setPosition("사원");

        // (2) 이름 + 전화번호 + 부서를 알고 입사
        employees[count++] = new Employee("김철수", "010-2222-2222", "인사팀");
        employees[1].setEmpNo(1002);
        employees[1].setSalary(2_800_000);
        employees[1].setAccount("222-222-222222");
        employees[1].setPosition("대리");

        // (3) 모든 정보를 알고 입사
        employees[count++] = new Employee(
                "이영희",
                "010-3333-3333",
                "영업팀",
                1003,
                3_500_000,
                "333-333-333333",
                "과장"
        );

        // 2. 전체 사원 정보 출력 -----------------------------
        printAllEmployees(employees, count);

        // 3. 월급 / 연봉 정산 -------------------------------
        int totalMonthSalary = calcTotalMonthSalary(employees, count);
        System.out.println("이번 달 월급 총액 = " + totalMonthSalary + "원");

        int totalYearSalary = calcTotalYearSalary(employees, count);
        System.out.println("기본 연봉 총액 = " + totalYearSalary + "원");

        int totalYearSalaryWithBonus = calcTotalYearSalaryWithBonus(employees, count);
        System.out.println("보너스 포함 연봉 총액 = " + totalYearSalaryWithBonus + "원");

        // 4. 특정 사원 승진 시키기 --------------------------
        System.out.println();
        System.out.println("== 김철수 대리 승진 처리 ==");
        promoteByEmpNo(employees, count, 1002); // 사원번호 1002 승진
        printAllEmployees(employees, count);

        // 5. 월급 이체 시뮬레이션 ---------------------------
        System.out.println();
        System.out.println("== 이번 달 월급 이체 시작 ==");
        payAll(employees, count);
    }

}

