package stillgood96;


//ax+bx+cx=(a+b+c)x

import java.util.Scanner;




public class Method {

    //메서드
    //특정 작업을 수행하기  위해 작성한 명령어들의 묶음
    //C언어의 함수와 비슷한 성격을 가지는 프로그래밍 요소
    //입력값을 통해 무언가를 하고 그 결과를 도출하는
    //수학의 함수(블랙박스)와 비슷한 개념

    //메서드의 목적
    //프로그램을 작성하다 보면 반복적으로 쓰인 코드를
    //종종 보는데, 효율적으로 작성하려면 반복문으로
    //처리하면 되지만, 반복문이 반복된다면?
    //메서드를 적용하면 기능별로 모듈화를 적용할 수 있기 때문에
    //프로그램의 가독성이 좋아지고, 협업시에도 유용하며
    //기능변경시 유지보수에도 좋음

    //메서드 정의
    //접근제한자 리턴값 메서드이름(타입 매개변수명)
    //     메서드 몸체
    //
    public static void main(String[] args) {
       /*
        //Hello, World!! 메세지 출력
        System.out.println("Hello, World!!");

        //Hello, World!! 메세지 3번 출력
        System.out.println("Hello, World!!");
        System.out.println("Hello, World!!");
        System.out.println("Hello, World!!");

        //Hello, World!! 메세지 3번 출력
        for(int i=0;i<3;i++){
            System.out.println("Hello,World!!");
        }

        //Hello, World!! 3번출력문을 3번 출력
//        for(int i=0;i<3;i++){
//            System.out.println("Hello,World!!");
//        }
//        for(int i=0;i<3;i++){
//            System.out.println("Hello,World!!");
//        }
//        for(int i=0;i<3;i++){
//            System.out.println("Hello,World!!");
//        }

        //Hello,World!! 메세지 3번출력을 3번 반복하는 코드에서 java로 바꿈
        //메세지를 변경함: Hello, Java!!
//        for(int i=0;i<3;i++){
//            System.out.println("Hello,java!!");
//        }
//        for(int i=0;i<3;i++){
//            System.out.println("Hello,java!!");
//        }
//        for(int i=0;i<3;i++){
//            System.out.println("Hello,java!!");
//        }
        */

        // 인사말 출력 메서드 호출(call)



        sayHello3("dmdmdmdm");  //여기서 msg: 는 매개변수를 자동으로 받아 작성이 되므로 써서 기입할 필요는 없다.

        String result=sayHello4("안녕하세요, 세상아");
        System.out.println(result);

        //사칙연산 메서드 호출 and 시험코드
        //시험코드

        computeNum(5,6);


        //computeAllSum 메서드 호출
            computeAllSum(1,5);
            computeAllSum(5,1);


            //시험코드

        //computeAllSum2 메서드 호출

        computeAllSum2(10);





    }
    //간단한 인사말 출력 메서드
    //public : 접근제한자, 외부 클래스의 메서드 사용허가 여부  ex) public 지하철 공중화장실 누구나 와서 사용 가능
    //static : 정적 메서드, 객체생성 없이 바로 사용가능 메서드 + 나중에 추가설명
    //void : 메서드(함수)가 반환하는 값이 없음 ex)상자(함수)라고 생각 하면 입출력 값이 없다. =박스안에서만 처리된다.

    public static void sayHello(){
        System.out.println("Hello, World!!");
    }

    //간단한 인사말을 3번 출력하는 메서드 : sayHello2;
    public static void sayHello2(){
        for(int i=0;i<3;i++) {
            System.out.println("Hello, World");
        }
    }



    //간단한 인사말을 출력하는 메서드 : sayHello3
    //단, 인사말은 언제든 변경하도록 재작성
    public static void sayHello3(String msg){
        System.out.println(msg);
    }

    //간단한 인사말을 출력하는 메서드 : sayHello4
    //단, 인사말은 언제든 변경하도록 재작성
    //단, 인삿말 출력을 메서드가 바로 하지않고
    //인삿말 생성후 호출한 대상에게 넘김
    //return : 메서드내에서 처리한 값을 외부로 보내려면
    //return이라는 명령문 사용
    //return시 값의 type과 return type은  반드시 일치해야 함.

    public static String sayHello4(String name){      //반환형 String의 값과

        return name;                                  //return을 이용해서 반화하는 값의 자료형이 같아야함
    }




    //두개의 정수를 매개변수로 선언하고
    //사칙연산한 결과를 출력하는 메서드: computeNum

    public static void computeNum(int a,int b) {
        String fmt1= "%d + %d = %d\n";
        String fmt2= "%d - %d = %d\n";
        String fmt3= "%d x %d = %d\n";
        String fmt4= "%d ÷ %d = %d\n";

        String result=
                String.format(fmt1,a,b,a+b)+
                String.format(fmt2,a,b,a-b)+
                String.format(fmt3,a,b,a*b)+
                String.format(fmt4,a,b,a/b);

        System.out.println(result);


    }


    //두개의 정수를 매개변수로 선언하고
    //두 정수를 범위로 설정해서 그것의 모든 합을 구하고
    //출력하는 메서드: computeAllSum
    //ex)5,1 -> 1+2+3+4+5 =>
    /* 내가작성한 메서드
   public static void computeAllSum(int a,int b){
        int i;
        int sum=0;




        for(i=a;i<=b;i++){
            if (a>b){
                for(i=b;i<=a;i++){
                    sum=sum+i;
                }
                break;
            }
            sum=sum+i;
        }


        System.out.println(sum);
    }
     */



    //선생님 ver.
    public static void computeAllSum(int x, int y){
        int min=x;
        int max=y;
        int sum=0;
        String fmt="%d ~ %d의 총합: %d\n";

        if(x>y){min=y;max=x;}
        for(int i=min; i<=max; i++){
            sum+=i;
        }
        System.out.printf(fmt,min,max,sum);
    }

    //가우스 덧셈방식
    public static void computeAllSum2(int s) {
        int sum = 0;
        /*
        if(s%2==0){
            sum=(s+1)*(s/2);
        }

        else{
            int b=s-1;
            sum=(b+1)*(s/2)+s;
        */
        sum = ((s + 1) * s)/2;

        System.out.println(sum);
    }
    }


