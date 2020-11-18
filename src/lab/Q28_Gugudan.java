package lab;


import java.util.Scanner;

public class Q28_Gugudan {
    public static void main(String[] args)  {
        int times=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("출력시킬 단은 ? : ");
        int dan=sc.nextInt();
        if(dan>9 || dan<0){
            System.out.print("잘못입력하셨습니다. 다시입력해주세요:");
            dan=sc.nextInt();
        }

        for(times=1;times<=9;times++){
            int gop=dan*times;
            System.out.printf("%d x %d = %d\n",dan,times,gop);
        }



    }
}
