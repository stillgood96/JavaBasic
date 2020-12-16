package semiproject11_26;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeV3Service {
    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("인사정보 처리프로그램 v3\n")
                .append("-------------------\n")
                .append("1. 인사 정보 입력\n")
                .append("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? [1,2,3,4,5,0] ");
        System.out.print(sb);
    }

    public void readEmployee(){
       StringBuilder sb= new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s\n";


        String result = String.format(fmt,"empno","lname","email","jobid","mgrid","deptid");
        sb.append(result);

        ArrayList<EmployeeVO> emps = EmployeeV3DAO.selectEmp();

        for (EmployeeVO emp : emps ){
                result = String.format(fmt,emp.getEmpno(),emp.getLname(),emp.getEmail(),
                        emp.getJobid(),emp.getMgrid(),emp.getDeptid());
                sb.append(result);
        }
        System.out.println(sb.toString());

    }

    public void newEmployee() {
    }

    public void readOneEmployee() {
    }
}
