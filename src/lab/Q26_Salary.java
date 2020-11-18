package lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q26_Salary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("사용자의 연봉을 입력하세요:");
        int money=sc.nextInt();
        System.out.print("사용자의 결혼 여부를 입력하세요(했으면1 or 안했으면0) :");
        int marry=sc.nextInt();
        double sum=0;


        if (marry==0){
            System.out.println("납부하실 세금은");
            if(money>3000){
                sum=money*0.25;
                System.out.println((int)sum+"만원 입니다.");


            }else if(money<3000){
                sum=money*0.1;
                System.out.println((int)sum+"만원 입니다.");
            }
       }else if(marry==1){
            System.out.println("납부하실 세금은");
            if(money>6000){
                sum=money*0.35;
                System.out.println((int)sum+"만원 입니다.");


            }else if(money<6000){
                sum=money*0.15;
                System.out.println((int)sum+"만원 입니다.");
            }
        }






    }

}
