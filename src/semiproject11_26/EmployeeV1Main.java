package semiproject11_26;

import java.util.Scanner;

public class EmployeeV1Main {
    public static void main(String[] args) {
        EmployeeV1Service srv = new EmployeeV1Service();

        Scanner sc = new Scanner(System.in);
        String menu =" ";

        while(true){
            srv.displayMenu();
            menu=sc.nextLine();

            switch(menu){
                case "1" : srv.newEmployee();
                           break;
                case "2" : srv.readEmployee(); break;
                case "3" : srv.readOneEmployee(); break;
                case "4" : srv.modifyEmployee(); break;
                case "5" : srv.removeEmployee(); break;
                case "0" : System.exit(0); break;
                default :
                    System.out.println("값을 잘못 입력!!");
            }
        }
    }
}
