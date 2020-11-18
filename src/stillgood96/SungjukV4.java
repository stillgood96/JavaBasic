package stillgood96;


//ax+bx+cx=(a+b+c)x

import java.util.Scanner;

/**
 * 파일명: SungjukV4
 * 작성일: 2020.11.18
 * 프로그램 설명: 성적처리프로그램 v4
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
 *성적처리 기능을 구현함으로써 코드가 길어지고
 *  *내용파악이 어려워 지는 것을 방지하기 위해
 *  * 함수(메서드)로 재정의해서 코드를 개선함
 *
 */


public class SungjukV4 {
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



        //처리
        readSungJuk(name,kor,eng,mat);
        computeSungJuk(kor,eng,mat,sum,mean,grd);

        //결과출력
        printSungJuk(name,kor,eng,mat,sum,mean,grd);





















    } //main

    //성적데이터 입력받기 : readSungJuk
    public static void readSungJuk(String[] name,int[] kor, int[] eng, int[] mat){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.println(i + 1 + "번째 학생 성적 입력");
            System.out.print("이름을 입력하세요 :");
            name[i] = sc.nextLine();
            System.out.print("국어점수를 입력하세요 :");
            kor[i] = sc.nextInt();
            System.out.print("영어점수를 입력하세요 :");
            eng[i] = sc.nextInt();
            System.out.print("수학점수를 입력하세요 :");
            mat[i] = sc.nextInt();
            sc.skip("\r\n|[\n\r]");
        }
    } //readSungJuk


    //성적데이터 총점,평균,학점 처리 : computeSungJuk
    public static void computeSungJuk(int[] kor,int[] eng,int[] mat,int[] sum,double[] mean,char[] grd){
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

        }//computeSungJuk

    //처리, 결과 출력 : printSungJuk
    public static void printSungJuk(String[] name,int[] kor,int[] eng,int[] mat,int[] sum,double[] mean,char[] grd){
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%1f\n학점:%c";
        for(int i=0;i<3;i++) {
                System.out.printf(fmt,name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);
            }

        } //printSungJuk

} //class