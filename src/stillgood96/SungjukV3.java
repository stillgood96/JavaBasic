package stillgood96;

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
        String [] name= new String[3];
        for(int i=0;i<3;i++){
            String name="";
        }



        String name="",name2="",name3 = "";
        int kor=0,kor2=0,kor3=0;
        int eng=0,eng2=0,eng3=0;
        int mat=0,mat2=0,mat3=0;
        int sum = 0,sum2=0,sum3=0;
        double mean  = 0.0,mean2=0.0,mean3=0.0;
        char grd = '가',grd2='가',grd3='가';
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%s\n학점:%c";
        String fmt2=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%s\n학점:%c";
        String fmt3=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%s\n학점:%c";
        String result,result2,result3;


        //처리
        //성적 데이터를 키보드로 입력받기 위해
        //Scanner 클래스 초기화
        System.out.println("1번째 학생 성적 입력중...");
        Scanner sc=new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");
        name=sc.nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor=sc.nextInt();
        System.out.print("영어점수를 입력하세요 :");
        eng=sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        mat=sc.nextInt();

        System.out.println("2번째 학생 성적 입력중...");
        Scanner sc2=new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");
        name2=sc2.nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor2=sc.nextInt();
        System.out.print("영어점수를 입력하세요 :");
        eng2=sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        mat2=sc.nextInt();

        System.out.println("3번째 학생 성적 입력중...");
        Scanner sc3=new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");
        name3=sc3.nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor3=sc.nextInt();
        System.out.print("영어점수를 입력하세요 :");
        eng3=sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        mat3=sc.nextInt();

        sum = kor+mat+eng;
        mean = (double)sum/3;

        sum2 = kor2+mat2+eng2;
        mean2 = (double)sum2/3;

        sum3 = kor3+mat3+eng3;
        mean3 = (double)sum3/3;

        //학점계산은 switch문으로 처리
        switch((int)(mean/10)) {
            case 10:
            case 9: grd='수'; break;
            case 8: grd='우'; break;
            case 7: grd='미'; break;
            case 6: grd='양'; break;
            default: grd='가'; break;
        }
        switch((int)(mean2/10)) {
            case 10:
            case 9: grd2='수'; break;
            case 8: grd2='우'; break;
            case 7: grd2='미'; break;
            case 6: grd2='양'; break;
            default: grd2='가'; break;
        }
        switch((int)(mean3/10)) {
            case 10:
            case 9: grd3='수'; break;
            case 8: grd3='우'; break;
            case 7: grd3='미'; break;
            case 6: grd3='양'; break;
            default: grd3='가'; break;
        }
        //Math.round(값) : 반올림하는 메서드!
        //98765.4321 => round => 98765
        //98765.4321 x 100 = 9876543.21
        //round(9876543.21) => 9876543
        //9876543 / 100 => 98765.43
        mean=Math.round(mean*100) / 100.0; //.0을붙여야함
        mean2=Math.round(mean*100) / 100.0;
        mean3=Math.round(mean*100) / 100.0;

        result=String.format(fmt,name,kor,eng,mat,sum,String.valueOf(mean),grd);
        //mean의 값만 String.valueOf로 해준다.
        result2=String.format(fmt,name2,kor2,eng2,mat2,sum2,String.valueOf(mean2),grd2);
        result3=String.format(fmt,name3,kor3,eng3,mat3,sum3,String.valueOf(mean3),grd3);



        //결과출력

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);





















    }



}
