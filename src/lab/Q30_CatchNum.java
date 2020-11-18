package lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q30_CatchNum {
    public static void main(String[] args) {

        int random=(int)(Math.random()*999)+1;

        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.println("0~999까지 숫자를 입력하세요:");
            int num=sc.nextInt();
            if(num>999 || num<0){
                if (num==9999){break;}
                System.out.println("범위를 벗어났습니다. 다시 입력해주세요");
                num=sc.nextInt();
            }
            if(num>random){
                System.out.println("추측하신 번호가 더 큽니다.");
            }else if(num<random){
                System.out.println("추측하신 번호가 더 작습니다.");
            } else if (num == random) {
                System.out.println("빙고 숫자를 맞췄습니다");
                break;
            }
        }



    }

}
