package stillgood96.practice.dayathome11_20;

import java.util.Scanner;

public class SungJukV5serv {
    public SungJukV5prac readSungJuk(){
        String name;
        int kor;
        int eng;
        int math;

        Scanner sc=new Scanner(System.in);
        System.out.println("이름을 입력하세요 :");
        name=sc.nextLine();
        System.out.println("국어 점수 입력 :");
        kor=sc.nextInt();
        System.out.println("영어 점수 입력 :");
        eng=sc.nextInt();
        System.out.println("수학 점수 입력 :");
        math=sc.nextInt();

        return new SungJukV5prac(name,kor,eng,math,0,0.0,' ');
        //많은 변수의 값을 가져가야하는데 정보들을 보관하는 prac클래스의 매개변수 생성자를이용
    }

    public void computeScore(SungJukV5prac ohNo){
        //sum값 구하기 private으로 감싸져있어
        ohNo.setSum(ohNo.getEng()+ ohNo.getKor()+ ohNo.getMath());
        //mean 평균값 구하기
        ohNo.setMean(ohNo.getSum()/3);
        //grd값 switch로 구하기

        switch((int)(ohNo.getMean()/10)){
            case 10:
            case 9: ohNo.setGrade('수');break;
            case 8: ohNo.setGrade('우');break;
            case 7: ohNo.setGrade('미');break;
            case 6: ohNo.setGrade('양');break;
            default:ohNo.setGrade('가');break;

        }

    }
    public void printSungJuk(SungJukV5prac ohYes){
        String fmt="이름:%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%.1f\n학점:%c\n";
        System.out.println(String.format(fmt,ohYes.getName(),ohYes.getKor(),ohYes.getEng(),ohYes.getMath()
        ,ohYes.getSum(),ohYes.getMean(),ohYes.getGrade()));
    }
}
