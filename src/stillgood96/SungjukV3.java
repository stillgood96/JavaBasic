package stillgood96;


//ax+bx+cx=(a+b+c)x

import java.util.Scanner;

/**
 * 파일명: SungjukV3
 * 작성일: 2020.11.17
 * 프로그램 설명: 성적처리프로그램 v3
 * 학생 3명의 성적데이터를 키보드로 입력받아
 * 이름,국어,영어,수학점수,총점,평균,학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용하기로 함
 * 그리고, 'Math.round()'을 이용해서 평균은 소수점 둘째자리까지 끊어서 출력함
 * 단, 평균은 소수점 첫째 자리 까지 출력
 * 단,학점기준은 '수우미양가' 로 함 +switch문을 이용함
 * 만점은 100점으로
 * 100~90, 89~80, 79~70, 69~60, 59~0기준으로 학점부여
 *
 *
 *
 */


public class SungjukV3 {
    public static void main(String[] args) {
        //변수선언  +선언할때 초기화도 해두면 좋다. +줄복사 ctrl+d



        String name="";
        int kor=0;
        int eng=0;
        int mat=0;
        int sum =0;
        double mean  = 0.0;
        char grd = '가';
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%1f\n학점:%c";




        //처리
        //성적 데이터를 키보드로 입력받기 위해
        //Scanner 클래스 초기화

        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;++i) {
            System.out.println(i+"번째 학생 성적 입력");
            System.out.print("이름을 입력하세요 :");
            name = sc.nextLine();
            System.out.print("국어점수를 입력하세요 :");
            kor = sc.nextInt();
            System.out.print("영어점수를 입력하세요 :");
            eng = sc.nextInt();
            System.out.print("수학점수를 입력하세요 :");
            mat = sc.nextInt();


            sum = kor + mat + eng;
            mean = (double) sum / 3;


            //학점계산은 switch문으로 처리
            switch ((int) (mean / 10)) {
                case 10:
                case 9:
                    grd = '수';
                    break;
                case 8:
                    grd = '우';
                    break;
                case 7:
                    grd = '미';
                    break;
                case 6:
                    grd = '양';
                    break;
                default:
                    grd = '가';
                    break;
            }


            //결과출력

            System.out.printf(fmt, name, kor, eng, mat, sum, mean, grd);


        }



















    }



}
