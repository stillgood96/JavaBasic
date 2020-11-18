package lab;

import java.util.Scanner;

public class Q27_LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("현재연도를 입력하세요 :");
        int year=sc.nextInt();

        if(year%400 ==0){System.out.println("윤년입니다.");}

        if(year%4==0 && year%100 !=0){

            System.out.println("윤년입니다.");

        }else if(year%4 !=0 && year%100 ==0){  //else if로 조건설정안하면 400년주기 윤년에 평년도 같이 출력이됨
            System.out.println("평년입니다.");
        }

    }

}
