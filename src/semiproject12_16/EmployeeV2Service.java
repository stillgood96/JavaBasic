package semiproject12_16;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeV2Service extends EmployeeV2GenericClass{

    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("인사정보 처리프로그램 v1\n")
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

    @Override
    public void newEmployee() {
        int empno;
        String fname;
        String lname;
        String email;
        String phone;
        String hdatd;
        String jobid;
        int sal;
        double comm;
        int mgrid;
        int deptid;

        Scanner sc = new Scanner(System.in);
        System.out.print("사번을 입력하세요 : ");
        empno = Integer.parseInt(sc.nextLine());
        System.out.print("이름을 입력하세요 : ");
        fname = sc.nextLine();
        System.out.print("성을 입력하세요 : ");
        lname = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        email = sc.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        phone = sc.nextLine();
        System.out.print("입사일을 입력하세요 : ");
        hdatd = sc.nextLine();
        System.out.print("직책을 입력하세요 : ");
        jobid = sc.nextLine();
        System.out.print("급여를 입력하세요 : ");
        sal = sc.nextInt();
        System.out.print("수당 입력하세요 : ");
        comm = sc.nextInt();
        System.out.print("상사번호를 입력하세요 : ");
        mgrid = sc.nextInt();
        System.out.print("부서번호를 입력하세요 : ");
        deptid = sc.nextInt();

        EmployeeV2VO emp = new EmployeeV2VO(empno,fname,lname,email,phone,hdatd,jobid,sal,comm,mgrid,deptid);
        String result = EmployeeV2DAO.insertEmployee(emp);
        System.out.println(result);
    }


    // 조회할 성적데이터를 DAO로부터 넘겨받아 출력
    @Override
    public void readEmployee() {
        String fmt = "사원번호 : %s, 성 :%s, 이름 :%s, 이메일 :%s, 전화번호 :%s, 입사일 :%s, 직책 :%s 급여 :%s 수당 :%s, 사수 :%s, 부서번호 :%s, 데이터추가일 :%s\n";
        StringBuilder sb = new StringBuilder();

        ArrayList<EmployeeV2VO> emps = EmployeeV2DAO.selectEmployee();

        for(EmployeeV2VO emp : emps){
            String result = String.format(fmt,emp.getEmpno(),emp.getFname(),emp.getLname(),emp.getEmail(),emp.getPhone(),emp.getHdatd(),emp.getJobid(),emp.getSal(),
                    emp.getComm(),emp.getMgrid(),emp.getDeptid(),emp.getDate());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    @Override
    public void readOneEmployee() {
        String fmt = "사원번호 : %s, 성 :%s, 이름 :%s, 이메일 :%s, 전화번호 :%s, 입사일 :%s, 직책 :%s, 급여 :%s 수당 :%s, 사수 :%s, 부서번호 :%s, 데이터추가일 :%s\n";
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원의 사원번호는 ? :");
        String empno = sc.nextLine();

        EmployeeV2VO emp = EmployeeV2DAO.selectOneEmployee(empno);

        String result = String.format(fmt,emp.getEmpno(),emp.getFname(),emp.getLname(),emp.getEmail(),emp.getPhone(),emp.getHdatd(),emp.getJobid(),emp.getSal(),
                emp.getComm(),emp.getMgrid(),emp.getDeptid(),emp.getDate());
        System.out.println(result.toString());
    }
}
