package DAY_12_18;

import semiproject11_26.EmployeeV3Service;

import java.util.Scanner;

/**
    SamKwangFinalV1
 비지니스 관리프로그램 진입점
 
 */

public class SamKwangFinalV1 {
    public static void main(String[] args) {
      SamKwangFinalV1Service sk = new SamKwangFinalV1Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while (true) {
            sk.displayMenu();
            menu = sc.nextLine();

            switch (menu) {
                case "1":  sk.newOrders();break;
                case "2": sk.readCODP();break;
                case "3": sk.readOneCODP();break;
                case "4": sk.readSOE(); break;
                case "5": sk.readOneSOE(); break;
                case "6": sk.readCOE();break;
                case "7": sk.readOneCoe(); break;
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
