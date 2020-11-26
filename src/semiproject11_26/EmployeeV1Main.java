package semiproject11_26;

import java.util.Scanner;

/**
 * EmployeeV1Main
 * 인사정보 관리 프로그램 진입점
 * 인사정보 처리에 대한 CRUD 코드를 작성해 둠
 *  인사 관리 프로그램 v1
 * -------------------
 *  1. 인사 정보 입력
 *  2. 인사 정보 조회      ( 사번,성,이메일,직책,상사번호,부서번호 )
 *  3. 인사 정보 상세조회 (사번으로 조회)
 *  4. 인사 정보 수정
 *  5. 인사 정보 삭제
 *  0. 프로그램 종료
 * -------------------
 *  원하시는 작업은 ? 3
 */

public class EmployeeV1Main {
    public static void main(String[] args) {
        EmployeeV1Service empsrv =
                new EmployeeV1Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while (true) {
            empsrv.displayMenu();
            menu = sc.nextLine();

            switch (menu) {
                case "1": empsrv.newEmployee();break;
                case "2": empsrv.readEmployee();break;
                case "3": empsrv.readOneEmployee();break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.exit(0);
                    break; //System.exit(0)이 입력받으면 정상종료
                default:
                    System.out.println("잘못입력하셨습니다 !");
                    break;
            }
        }
    }
}
