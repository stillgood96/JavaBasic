package stillgood96;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

// 2020-12-14
public class Exceotions {
    // 예외 exception와 오류
    // 자바프로그램 작성시 문법에 맞지 않게 코드를 작성하면
    // 컴파일 오류가 발생함
    // 또한, 코드가 제대로 작성되었다 하더라도 실행중에
    // 예상치 못한 상황으로 실행 오류가 발생할 수 있음
    // 이처럼 프로그램 실행중에 예상치 못한 상황으로
    // 프로그램이 영향을 받는 것을 오류와 예외로 구분

    // 일반적으로 오류error는 시스템 단계에서 프로그램 에 심각한 문제를
    // 야기해서 실행중인 프로그램을 강제 중단시킴
    // -> 네트워크 상 접속,오류, 메모리 부족
    //이러한 오류는 개발자가 처리할 수 없음

    // 반면, 예외는 오류와 마찬가지로 실행중인 프로그램을 중단시키지만
    // 발생할 수 있는 상황을 미리 예측하여 코드를 통해
    // 프로그램 실행 중단을 방지할수 있음.

    public static void main(String[] args) {
        // 예외처리전1
        /**
         System.out.println("프로그램시작1");

         System.out.println("프로그램 끝1");

         // 예외처리전2
         System.out.println("프로그램 시작2");
         int a=10, b=20;
         int c=a+b;
         System.out.println(c);
         System.out.println("프로그램 끝2");
         **/

        // 예외처리전3
//        System.out.println("프로그램 시작3");
//        int d=10, e=0;
//        int f=d/e;
//        System.out.println(c);   // 위에 식이 오류가 나오니 여기서부터 출력이 안된다 오류발생! - 실행중단
//                                 // ArithmeticException 이 나오는데 0 연산에서 오류나왔다는 뜻
//       System.out.println("프로그램 끝3");

        // 예외처리 구문
        // try ~ catch ~ exception ~ finally
        // try
        //      예외발생 가능성이 있는 코드
        // catch (예외종류)
        //      예외처리 핸들러
        /**
         System.out.println("프로그램시작4");
         int d=10,e=0;
         int f=0;
         try{
         f= d/e;
         // }catch (Exception ex){    예외클래스들중 EXCEPTION이 가장 조상 우리가 예외를 적용할때는 상황에 맞는 구체적인 예외클래스를 가져오는게 좋다.
         }catch (ArithmeticException ex){ // 상황에 맞는 클래스 상황에 맞는 클래스를 써줘야 성능에 좋다.
         // 예외처리 핸들러
         System.out.println(">>연산오류가 발생 했습니다 ~~");
         System.out.println(ex.getMessage()); // 오류 구체적인 내용을 말해주는 메서드

         }
         System.out.println(f);
         System.out.println("프로그램 끝4"); // 예외처리 설정하니 오류는 발생하지만 프로그램 끝을 맺기는한다.
         **/

        // ex) 1~9사이 정수만 입력받아 화면에 출력하는 코드를 작성하세요
        // 단, 예외처리코드를 이용해서 문자를 입력했을때에도
        // 프로그램 실행이 중단되지 않도록 합니다.


        // 내가작성한ver
        /*
        while (true) {
                    int num=9999;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("1~9까지 임의의 정수를 입력하세요(0입력시 종료) :");
                num = sc.nextInt();
                if (num<1 || num>9){
                    System.out.println("1부터 ~9까지만 입력하라거~");
                }else{
                    System.out.println("입력하신 번호는 :"+num);
                }
            } catch (Exception ex) {
                System.out.println("숫자입력하라거 ~ 문자말고 ");
            }
            if (num==0){
                break;
            }
        }

         */


        // 선생님ver
        /**
         Scanner sc = new Scanner(System.in);
         System.out.println("1~9사이 정수만 입력!");
         int num=0;
         try{
         num = sc.nextInt();
         System.out.println(num);
         }catch(InputMismatchException ime) {
         System.out.println("~9사이 정수만 입력가능합니다.");
         }
         **/


        // ex) 학생3명의 이름을 입력받아 화면에 출력하는 코드를 작성하세요
        // 단, 배열과 예외처리를 이용해서 코드를 작성하세요
        String[] names = new String[3];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i <= names.length; ++i) {
                System.out.println("이름" + i + " 은?");
                names[i] = sc.next();
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("배열의 크기를 초과했어요!");
        }

        // 예외종류
        // 검사형 예외 : checked exception
        // 비검사형 예외 : unchecked exception

        // 비검사형 예외
        // 명시적인 예외 처리를 강제하지 않음
        // 예이발생 확인 시점은 실행시임
        // ArithmeticException
        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        // 검사형 예외
        // 명시적인 예외처리를 강제함 (반드시 ! 안쓰면 코드진행이 안됨)
        // 예외발생 확인 시점은 컴파일시임
        // IOException
        // ClassNotFoundException

        // ex)SungJuk.dat 파일을 읽어서 화면에 출력하세요
        String fname = "c:/java/sungjuk.dat";
        try {
            FileReader fr = new FileReader(fname);// 초반에 작성시 예외처리가 안되었다고 오류가 나올 것
            while (fr.ready()) {
                System.out.print((char) fr.read());
            }
            fr.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("성적파일은 c:/java/SungJuK.DAT 입니다.");
        } catch (IOException io) {
            System.out.println("파일을 읽어올때 오류 발생");
        }

        // finally 블럭
        // 예외발생 여부와 상관없이 무조건 실행되는 코드는
        // finally절에 작성함
        /*FileReader fr= null;
        BufferedReader br=null;
        try {
             fr = new FileReader(fname);
             br = new BufferedReader(fr);
            while(br.ready()){
                System.out.println(br.readLine());
            }

        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }finally {
            if (br != null)
                try { br.close(); } catch (IOException ie) {} //여기서의 오류코드는 확인할 필요 없다고한다.
            if (fr != null)
                try { fr.close(); } catch (IOException ie) {}
        }*/


        // try - with - resource
        // JDK7부터는 데이터베이스를 이용하는 자바코드의 경우
        // 자원을 반납하는 코드가 반드시 작성되어야 하는데,
        //      try-with-resource 구문을 사용하면
        //      명시적으로 자원 반납코드를 작성하지 않아도 됨

        // finally 절 써서 만든 코드를 try-with-resource로 해서 만들기
        try (FileReader fr = new FileReader(fname);
             BufferedReader br = new BufferedReader(fr);) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }


        // try-with-resource 예제
        try (FileWriter fw = new FileWriter(fname);
             BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write("이글이 보이나요??");
        } catch (IOException ie) {
            ie.printStackTrace();
        }


        // 예외 회피/양도/떠넘기기
        // 메서드 선언부에 throws를 사용해서
        // 해당 메서드에서 발생한 예외를 미리 명시하고
        // 메서드를 호출한 사위 메서드에서 이것을 처리하도록 할 수 있음
        // 이를 통해 각 하위메서드에서 발생하는 예외들을
        // 한곳에 모아서 처리할 수 있음
        // 메서드서명 throws 예외종류








    }
}

