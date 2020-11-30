package semiproject11_26.practice;

import stillgood96.SungJukV8Service;

import java.util.Scanner;

public class ProfessorMain {
    public static void main(String[] args) {
        ProfessorService pfs = new ProfessorService();
        Scanner sc = new Scanner(System.in);
        String menu = "";

        while(true){
            pfs.display();
            menu = sc.nextLine();

            switch (menu) {
                case "1" : pfs.newProfessor(); break;
                case "2" : pfs.readProfessor(); break;
                case "3" : pfs.readOneProfessor(); break;
                case "0" : System.exit(0); break;
            }
        }


    }
}
