package stillgood96;

import java.util.Scanner;

/**
 * 파일명: SungjukV2
 * 작성일: 2020.11.17
 * 프로그램 설명: 성적처리프로그램 v1
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
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


public class SungjukV2B {
    public static void main(String[] args) {
        //변수선언  +선언할때 초기화도 해두면 좋다. +줄복사 ctrl+d

        String name = "선우";
        int kor=99;
        int eng=0;
        int mat=0;
        int sum = 0;
        double mean  = 0.0;
        char grd = '가';
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%s\n학점:%c";
        String result;







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
        //Math.round(값) : 반올림하는 메서드!
        //98765.4321 => round => 98765
        //98765.4321 x 100 = 9876543.21
        //round(9876543.21) => 9876543
        //9876543 / 100 => 98765.43
        mean=Math.round(mean*100) / 100.0; //.0을붙여야함

        result=String.format(fmt,name,kor,eng,mat,sum,String.valueOf(mean),grd);
        //mean의 값만 String.valueOf로 해준다.



        //결과출력

//           System.out.println(
//                           "이름:"+name+
//                           "\n"+"국어:"+kor+
//                           "\n"+"영어:"+eng+
//                           "\n"+"수학:"+mat+
//                           "\n"+"총합:"+sum+
//                           "\n"+"평균:"+mean+
//                           "\n"+"학점:"+grd
//           );

//
//           문자열 연결 연산자(+)로 문자을 만드는 경우
//           String 변수의 특성때문에 성능 저하 발생
        System.out.println(result);







//        System.out.println("이름:"+name);
//        System.out.println("국어:"+kor);
//        System.out.println("영어:"+eng);
//        System.out.println("수학:"+mat);
//        System.out.println("-----------");
//        System.out.println("총점:"+sum);
//        System.out.println("평균:"+mean);
////        System.out.printf("평균:%.1f\n",mean);        //alt+shift+방향키 누르면 줄바꿈 비추천
//        System.out.println("학점:"+grd);
















    }



}
