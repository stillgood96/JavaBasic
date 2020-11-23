package stillgood96.day11_23hak;

import java.util.Scanner;

/**
 * 파일명: SungjukV6
 * 작성일: 2020.11.23
 * 프로그램 설명: 성적처리프로그램 v6
 * 중간고사와 기말고사 성적처리프로그램을 만들려고 함
 * SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 상속을 이용해서 작성하세요
 *
 * 중간고사(MidSungJuk) : 국어,영어,수학
 * 기말고사(FinalSungJuk) : 국여,영어,수학,미술,과학
 * 성적처리 : computeSungJuk
 * 결과출력 : printSungJuk
 */

public class SungJukV6Main {
    public static void main(String[] args) {
        MidSungJuk sw=new MidSungJuk("이선우",99,98,99,0,0.0,' ');
        sw.computeSungJuk();
        sw.printSungJuk();
        FinalSungJuk sw2=new FinalSungJuk();
        sw2.name="이선우";
        sw2.kor=98;
        sw2.math=99;
        sw2.eng=99;
        sw2.art=95;
        sw2.sci=96;
        sw2.computeSungJuk();
        sw2.printSungJuk();

    }


}

class MidSungJuk {
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected double mean;
    protected char grd;

    public MidSungJuk() {
    }

    public MidSungJuk(String name, int kor, int eng, int math, int sum, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
    }
    public void computeSungJuk(){
        sum=kor+eng+math;
        mean=(double)sum/3;

        switch((int)(mean*10)){
            case 10: case 9:
                grd='수';break;
            case 8:
                grd='우';break;
            case 7:
                grd='미';break;
            case 6:
                grd='양';break;
            default:
                grd='가';break;
        }
    }
    public void printSungJuk(){
        String fmt=
                "이름:%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%.1f\n" +
                        "학점:%c";
        String result=String.format(fmt,name,kor,eng,math,sum,mean,grd);

        System.out.println(result);
    }
}



class FinalSungJuk extends MidSungJuk{
    int art;
    int sci;



    @Override
    public void computeSungJuk() {
        sum=kor+eng+math+sci+art;
        mean=(double)sum/5;
        switch((int)(mean*10)){
            case 10: case 9:
                grd='수';break;
            case 8:
                grd='우';break;
            case 7:
                grd='미';break;
            case 6:
                grd='양';break;
            default:
                grd='가';break;
        }
    }

    @Override
    public void printSungJuk() {
        String fmt=
                "이름:%s\n국어:%d\n영어:%d\n수학:%d\n미술:%d\n과학:%d\n총점:%d\n평균:%.1f\n" +
                        "학점:%c";
        String result=String.format(fmt,name,kor,eng,math,art,sci,sum,mean,grd);

        System.out.println(result);
    }
}




