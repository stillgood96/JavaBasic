package DAY_12_18;


import semiproject11_26.EmployeeV3DAO;
import semiproject11_26.EmployeeVO;

import java.util.ArrayList;
import java.util.Scanner;

public class SamKwangFinalV1Service {
    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("비즈니스 관리 프로그램 v3\n")
                .append("-------------------\n")
                .append("1. 미정\n")
                .append("2. CODP 정보 조회\n")
                .append("3. CODP 정보 상세조회\n")
                .append("4. SOE 정보 조회\n")
                .append("5. SOE 정보 상세 조회 \n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? [1,2,3,4,5,0] ");
        System.out.print(sb);
    }


    public void newOrders() {
    }

    // 고객 : 고객번호, 고객이름
    // 주문 : 주문번호, 주문일
    // 주문항목 : 제품번호, 주문수량
    // 제품 : 제품이름 , 단가
    public void readCODP() {
        String fmt = "%10s %10s %10s %10s \n%10s %10s %10s %10s\n ";
        StringBuilder sb = new StringBuilder();
        ArrayList<SamKwangCODP_VO> codps = SamKwangFinalV1DAO.selectCODP();
        String result = "";

        for(SamKwangCODP_VO codp : codps ){
            result=String.format(fmt,codp.get고객번호(),codp.get고객이름(),codp.get주문번호(),codp.get주문일().substring(0,10),
                    codp.get제품번호(), codp.get수량(),codp.get제품이름(),codp.get단가());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    public void readOneCODP() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s\n" +
                "%10s %10s %10s %10s %10s\n" +
                "%10s %10s %10s %10s %10s %10s\n"  +"------------------------------------\n";
        String result = "조회하시는 주문번호가 존재하지 않습니다.";
        Scanner sc =new Scanner(System.in);
        System.out.print("조회할 주문 번호는 ? :");
        int 주문번호 = Integer.parseInt(sc.nextLine());

        ArrayList<SamKwangCODP_VO> codps = SamKwangFinalV1DAO.selectOneCodp(주문번호);

        if(codps != null){
        for (SamKwangCODP_VO codp : codps) {
            result = String.format(fmt, codp.get제품번호(), codp.get주문번호(), codp.get고객번호(), codp.get고객이름(),
                    codp.get주소(), codp.get시도(), codp.get우편번호(), codp.get전화번호(), codp.get주문일(), codp.get납기일(),
                    codp.get인사번호(), codp.get수량(), codp.get제품이름(), codp.get제품분류(), codp.get단가(), codp.get재고량());
            sb.append(result);
        }
        }else{
        System.out.println(result);
        }

        System.out.println(sb.toString());
    }

    public void readSOE() {
        String fmt = "%10s %10s %10s %10s %10s %10s\n";
        StringBuilder sb = new StringBuilder();
        String result = "찾으시는 주문번호가 존재하지 않습니다 !";
        ArrayList<SamKwangSOE_VO> soes = SamKwangFinalV1DAO.selectSOE();

        for(SamKwangSOE_VO soe : soes ){
            result = String.format(fmt,soe.get인사번호(),soe.get주문번호(),soe.get운송ID(),soe.get운송이름(),
                    soe.get주문일(),soe.get직책());
            sb.append(result);
        }
        System.out.println(sb.toString());

    }

    public void readOneSOE() {
        String fmt ="%10s %10s %10s %10s %10s %10s\n %10s %10s %10s %10s %10s %10s %10s \n";

        String result = "찾으시는 운송ID가 존재하지 않아요!!";

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 운송ID는 ? ");
        int 운송ID = Integer.parseInt(sc.nextLine());

        SamKwangSOE_VO soe  = SamKwangFinalV1DAO.selectOneSOE(운송ID);
        if (soe !=null) {
            result = String.format(fmt, soe.get인사번호(), soe.get주문번호(), soe.get운송ID(), soe.get운송이름(), soe.get담당자전화번호(),
                    soe.get주문일(), soe.get납기일(), soe.get고객번호(), soe.get주민등록번호(), soe.get성명(), soe.get소속부서(), soe.get직책(), soe.get입사일());
        }else
            System.out.println(result);



    }
}
