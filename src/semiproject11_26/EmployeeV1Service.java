package semiproject11_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * EmployeeV1Service
 * 인사정보 처리 인터페이스를 구현한 클래스
 * 인사정보 처리에 대한 CRUD 코드를 작성해 둠
 */


public class EmployeeV1Service
        extends EmployeeV1GenericService {
    List<EmployeeVO> empdata = new ArrayList<>();

    EmployeeVO ep = null;
    /**
     * 인사정보 처리 UI 출력
     */
    public void displayMenu() {
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
    /**
     * 인사정보 입력받기
     */
    public void newEmployee() {
        /*
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

         */
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
        // 모든 인사정보는 일단 문자형으로 받되
        // 필요에 따라 적절한 형변환을 해서 변수에 저장
        System.out.print("사번을 입력하세요 : ");
         empno = Integer.parseInt(sc.nextLine());
        //emp.setEmpno( Integer.parseInt(sc.nextLine()) );

        System.out.print("이름을 입력하세요 : ");
        fname = sc.nextLine();
        //emp.setLname( sc.nextLine() );

        System.out.print("성을 입력하세요 : ");
        //emp.setFname( sc.nextLine() );
        lname = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        //emp.setEmail( sc.nextLine() );
        email = sc.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        //emp.setPhone( sc.nextLine() );
        phone = sc.nextLine();
        System.out.print("입사일을 입력하세요 : ");
        //emp.setHdatd( sc.nextLine() );
        hdatd = sc.nextLine();
        System.out.print("직책을 입력하세요 : ");
        //emp.setJobid( sc.nextLine() );
        jobid = sc.nextLine();
        System.out.print("급여를 입력하세요 : ");
        //emp.setSal( Integer.parseInt(sc.nextLine() ) );
        sal = sc.nextInt();
        System.out.print("수당 입력하세요 : ");
        //emp.setComm( Double.parseDouble(sc.nextLine() ) );
        comm = sc.nextInt();
        System.out.print("상사번호를 입력하세요 : ");
       // emp.setMgrid( Integer.parseInt(sc.nextLine()) );
        mgrid = sc.nextInt();
        System.out.print("부서번호를 입력하세요 : ");
        //emp.setDeptid( Integer.parseInt(sc.nextLine()) );
        deptid = sc.nextInt();
        ep = new EmployeeVO(empno,fname,lname,email,phone,hdatd,jobid,sal,comm,mgrid,deptid);

        empdata.add(ep);
    }

    @Override
    /**
     * 기본 인사정보 출력
     */
    public void readEmployee() {
        // 데이터 출력시 간격유지를 위해 '\t' or 형식지정자 앞에 숫자 사용

        String fmt = "%8s %8s %8s %8s %8s %8s\n";

        System.out.printf(fmt,
                "empno","lname","email","jobid","mgrid","deptid"); //한글로쓰면 칸이 안맞음
        Iterator<EmployeeVO> iter = empdata.iterator();

        while(iter.hasNext()) {
            EmployeeVO e = iter.next();
            System.out.printf(fmt,e.getEmpno(),e.getFname(),e.getEmail(),
                    e.getJobid(),e.getMgrid(),e.getDeptid());
        }
    }

    @Override
    /**
     * 상세 인사정보 출력
     * 사원번호를 입력받아 출력함
     */
    public void readOneEmployee() {
        String fmt = "%8s %8s %8s %8s %8s %8s "+
                "%8s %8s %8s %8s %8s\n";
        EmployeeVO emp = new EmployeeVO();
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원번호는 ?");
        emp.setEmpno( Integer.parseInt( sc.nextLine() ));

        for(EmployeeVO d : empdata) {
            // 입력한 사원번호와
            // 순회해서 읽어온 사원번호와 비교
            // 일치하면 이것을 출력하기 위해
            // 다른 변수에 저장함
            if ( d.getEmpno() == emp.getEmpno() ) {
                emp = d;
            }
        }
        System.out.printf(fmt, emp.getEmpno(),
                emp.getFname(),emp.getLname(),emp.getEmail(),emp.getPhone(),
                emp.getHdatd(),emp.getJobid(),emp.getSal(),emp.getComm(),emp.getMgrid(),
                emp.getDeptid());
    }

    @Override
    public void modifyEmployee() {
        super.modifyEmployee();
    }

    @Override
    public void removeEmployee() {
        super.removeEmployee();
    }
}
