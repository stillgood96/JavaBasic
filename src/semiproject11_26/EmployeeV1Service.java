package semiproject11_26;

import stillgood96.SungJukV0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service extends EmployeeV1GenericService {
    List<EmployeeVO> emp = new ArrayList<>();

    @Override
    public void newEmployee() {
        int empno;
        String fname;
        String email;
        String jobid;
        int mgrid;
        int deptid;

        Scanner sc = new Scanner(System.in);
        System.out.print("사원 번호 입력: ");
        empno=sc.nextInt();
        sc.skip("\r\n|[\n\r]");
        System.out.print("사원 성 입력: ");
        fname=sc.nextLine();
        System.out.print("이메일 입력: ");
        email=sc.nextLine();
        System.out.print("직책 입력: ");
        jobid=sc.nextLine();
        System.out.print("상사번호 입력: ");
        mgrid=sc.nextInt();
        System.out.print("부서번호 입력: ");
        deptid=sc.nextInt();
        sc.skip("\r\n|[\n\r]");

        EmployeeVO sw = new EmployeeVO(empno,fname,email,jobid,mgrid,deptid);

        emp.add(sw);
    }

    @Override
    public void readEmployee() {
        String fmt = "사원번호:%d,성:%s,이메일:%s,직책:%s,상사번호:%d,부서번호:%d\n";

        Iterator<EmployeeVO> emps = emp.iterator();
            while(emps.hasNext()){
                EmployeeVO info = emps.next();
                System.out.printf(fmt,info.getEmpno(),info.getFname(),info.getEmail(),
                        info.getJobid(),info.getMgrid(),info.getDeptid());
            }


    }

    @Override
    public void readOneEmployee() {
        String fmt =
                "사원번호:%d,성:%s,이메일:%s,직책:%s,상사번호:%d,부서번호:%d";

        // 상세조회할 학생이름 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원번호는?");
        int empno = sc.nextInt();

        // 입력받은 이름으로 데이터 검색후 결과 출력
        for (EmployeeVO sw : emp) {
            if (sw.getEmpno()==(empno)) {
                System.out.printf(fmt,sw.getEmpno(),sw.getFname(),sw.getEmail(),
                        sw.getJobid(),sw.getMgrid(),sw.getDeptid());
                System.out.println("");
                break;
            }else {
                System.out.println("조회하신 번호가 존재하지 않습니다 !");
            }
        }
    }

    @Override
    public void modifyEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.println("수정하실 사원번호는?");
        int epn=sc.nextInt();

        for (EmployeeVO sw : emp) {
            if (sw.getEmpno()==(epn)) {
                System.out.println("수정하실 부분 입력: ex)사원번호,성,이메일,직책,사수번호,부서번호");
                String a=sc.nextLine();
                switch(a){
                    case "사원번호" :
                        System.out.println("수정하실 사원번호 입력: ");
                        int empnumR =sc.nextInt();
                        EmployeeVO empnum = new EmployeeVO();
                        empnum.setEmpno(empnumR);
                        emp.set(sw.getEmpno(),empnum);
                        break;
                        }
            }else {
                System.out.println("조회하신 번호가 존재하지 않습니다 !");
            }
        }
    }

    @Override
    public void removeEmployee() {
        super.removeEmployee();
    }

    public void displayMenu () {
        StringBuilder sb = new StringBuilder();
              sb.append("-------------------\n")
                .append("인사 관리 프로그램v1\n")
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
}
