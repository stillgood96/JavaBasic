package semiproject11_26;

import java.util.Scanner;

public class EmployeeV2Main {
    public static void main(String[] args) {
        EmployeeV2Service empsrv =
                new EmployeeV2Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while (true) {
            empsrv.displayMenu();
            menu = sc.nextLine();

            switch (menu) {
                case "1": empsrv.newEmployee();break;
                case "2": empsrv.readEmployee();break;
                case "3": empsrv.readOneEmployee();break;
                case "4": break;
                case "5": break;
                case "0":
                    System.exit(0);break; //System.exit(0)이 입력받으면 정상종료
                default: System.out.println("잘못입력하셨습니다 !");break;
            }
        }
    }
}
