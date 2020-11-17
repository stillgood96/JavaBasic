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


        //배열변수선언
        //자료형 변수면[]=new 자료형[크기]

        String name[]=new String[3];
        int kor[]=new int[3];
        int eng[]=new int[3];
        int mat[]=new int[3];
        int sum[]=new int[3];
        double mean [] =new double[3] ;
        char grd []= new char[3];
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%1f\n학점:%c";




        //처리
        //성적 데이터를 키보드로 입력받기 위해
        //Scanner 클래스 초기화

        Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++) {
                System.out.println(i+1 + "번째 학생 성적 입력");
                System.out.print("이름을 입력하세요 :");
                name[i] = sc.nextLine();
                System.out.print("국어점수를 입력하세요 :");
                kor[i] = Integer.parseInt(sc.nextLine());
                System.out.print("영어점수를 입력하세요 :");
                eng[i] = Integer.parseInt(sc.nextLine());
                System.out.print("수학점수를 입력하세요 :");
                mat[i] = Integer.parseInt(sc.nextLine());
//                sc.skip("\r\n|[\n\r]");
                //수학성적 입력시 같이 입력된 enter키가
                //다음 데이터(이름) 입력시 입력값으로
                //자동으로 전달됨 그래서 두번째 학생부터 바로 국어점수로 넘어가는걸 확인된다.
                //그러한 상황을 해결하기 위해
                //미리 엔터키를 제거하는 코드를 마지막 부분에 삽입
                //sc.skip("\r\n");   or  sc.skip("\r\n|[\n\r]"); -모르는부분 구글링해봐야함
            }

            for(int i=0;i<3;i++) {
                sum[i] = kor[i] + mat[i] + eng[i];
                mean[i] = (double) sum[i] / 3;


                //학점계산은 switch문으로 처리
                switch ((int) (mean[i] / 10)) {
                    case 10:
                    case 9:
                        grd[i] = '수';
                        break;
                    case 8:
                        grd[i] = '우';
                        break;
                    case 7:
                        grd[i] = '미';
                        break;
                    case 6:
                        grd[i] = '양';
                        break;
                    default:
                        grd[i] = '가';
                        break;
                }
            }

            //결과출력
            for(int i=0;i<3;i++) {
                System.out.printf(fmt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);
            }





















    }



}
