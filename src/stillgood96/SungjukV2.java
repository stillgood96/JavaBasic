package stillgood96;

import java.util.Scanner;

/**
 * 파일명: SungjukV2
 * 작성일: 2020.11.17
 * 프로그램 설명: 성적처리프로그램 v1
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 단, 평균은 소수점 첫째 자리 까지 출력
 * 단,학점기준은 '수우미양가' 로 함 + switch문으로
 * 만점은 100점으로
 * 100~90, 89~80, 79~70, 69~60, 59~0기준으로 학점부여
 * 학점계산시 switch문으로
 */


public class SungjukV2 {
    public static void main(String[] args) {
        //변수선언  +선언할때 초기화도 해두면 좋다. +줄복사 ctrl+d

        String name = "선우";
        int kor=99;
        int eng=0;
        int mat=0;
        int sum = 0;
        double mean  = 0.0;
        char grd = '가';







        //처리
        //성적 데이터를 키보드로 입력받기 위해
        //Scanner 클래스 초기화
        Scanner sc=new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");          //이름을 입력하세요 : 줄바꿈이 안일어나고 입력받을 수 있게 print문으로 한다.
        name=sc.nextLine();  //문자를 받을때는 nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor=sc.nextInt();    //정수를 받을때는 nextInt(); 실수는 Double
        System.out.print("영어점수를 입력하세요 :");
        eng=sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        mat=sc.nextInt();

        sum = kor+mat+eng;   //총합
        mean = (double)sum/3; //평균

        //학점계산은 switch문으로 처리
        switch((int)(mean/10)) {
            case 10:
            case 9: grd='수'; break;
            case 8: grd='우'; break;
            case 7: grd='미'; break;
            case 6: grd='양'; break;
            default: grd='가'; break;
        }
        //String.format(형식지정자, 변수들)
        mean = Double.parseDouble(
                String.format("%.1f",mean));




        //결과출력
        System.out.println("이름:"+name);
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+mat);
        System.out.println("-----------");
        System.out.println("총점:"+sum);
        System.out.println("평균:"+mean);
//        System.out.printf("평균:%.1f\n",mean);        //alt+shift+방향키 누르면 줄바꿈 비추천
        System.out.println("학점:"+grd);
















    }



}
