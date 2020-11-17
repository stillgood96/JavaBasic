package stillgood96;

import java.util.Scanner;

public class MyPractice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("학생의 수를 입력하세요: ");
        final int num=sc.nextInt();


        String [] name=new String[num];
        int [] kor=new int[num];
        int [] eng=new int[num];
        int [] mat=new int[num];
        int [] sum=new int[num];
        double [] avg=new double[num];
        char [] grd=new char[num];
        String fmt=
                "학생 이름:%s\n 국어점수:%d \n영어점수:%d \n수학점수:%d \n총점수:%2d \n평균:%1f \n학점:%c";

        for(int i=0;i<num;i++){

            System.out.println(i+1+"번째 학생이름 입력");
            sc.skip("\r\n|[\n\r]");
            System.out.print("학생 이름:");
            name[i]=sc.nextLine();
            System.out.print("국어점수:");
            kor[i]=sc.nextInt();
            System.out.print("영어점수:");
            eng[i]=sc.nextInt();
            System.out.print("수학점수");
            mat[i]=sc.nextInt();
        }

        for(int i=0;i<num;i++){
            sum[i]=kor[i]+eng[i]+mat[i];
            avg[i]=(double)sum[i]/3;

        }

        for(int i=0;i<num;i++) {
            switch ((int) (avg[i] / 10)) {
                case 10:
                case 9: grd[i]='수'; break;
                case 8: grd[i]='우'; break;
                case 7: grd[i]='미'; break;
                case 6: grd[i]='양'; break;
                default : grd[i]='가'; break;


            }
        }

        for(int i=0; i<num;i++){
            System.out.printf(fmt,name[i],kor[i],eng[i],mat[i],sum[i],avg[i],grd[i]);
            System.out.println("\n--------------------------------------------------");
        }


    }
}
