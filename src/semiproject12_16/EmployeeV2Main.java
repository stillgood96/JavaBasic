package semiproject12_16;

import java.util.Scanner;

public class EmployeeV2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeV2Service srv = new EmployeeV2Service();
        while(true){
            srv.displayMenu();
            int result = Integer.parseInt(sc.nextLine());

            switch (result){
                case 1: srv.newEmployee();break;
                case 2: srv.readEmployee();break;
                case 3: srv.readOneEmployee();break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                    break; //System.exit(0)이 입력받으면 정상종료
                default:
                    System.out.println("잘못입력하셨습니다 !");
                    break;
            }
        }

    }
}
