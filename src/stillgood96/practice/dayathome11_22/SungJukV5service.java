package stillgood96.practice.dayathome11_22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SungJukV5service {


    public SungJukV5VO readSungJuk(){
        String name;
        int kor;
        int eng;
        int math;
        Scanner sc=new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        name=sc.nextLine();
        System.out.println("국어 점수 입력:");
        kor=sc.nextInt();
        System.out.println("영어 점수 입력:");
        eng=sc.nextInt();
        System.out.println("수학 점수 입력:");
        math=sc.nextInt();

        return new SungJukV5VO(name,kor,eng,math,' ',0,0.0); //SungJukV5VO의 매개변수생성자
    }


    public void computeSungJuk(SungJukV5VO compute){
        //총점 구하기
        compute.setSum(compute.getEng()+ compute.getKor()+compute.getMath());
        //평균 구하기
        compute.setMean((double)compute.getSum()/3);

        //grade 스위치문으로 구하기

        switch((int)(compute.getMean()*10)){
            case 10: case 9:
                compute.setGrd('수');break;
            case 8:
                compute.setGrd('우');break;
            case 7:
                compute.setGrd('미');break;
            case 6:
                compute.setGrd('양');break;
            default:
                compute.setGrd('가');break;
        }
    }

    //출력문
    public void print(SungJukV5VO print){
        String fmt=
                "이름 :%s\n국어점수 :%d\n영어점수 :%d\n수학점수 :%d\n총점 :%d\n평균 :%.1f\n학점 :%c\n";
        String result=
                String.format(fmt,print.getName(),print.getKor(),print.getEng(),print.getMath(),print.getSum(),print.getMean(),print.getGrd());
        System.out.println(result);
    }

}
