package lab;

import java.io.IOException;

public class Q29_Low2upr {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("알파벳 소문자입력시 대문자로 변형됩니다(0입력시 종료) :");
            int num = System.in.read(); //아스키코드로 입력하는 것 같다.
            System.in.read(); //아스키코드에서는 입력할때 치는 enter도 값으로 인식해서 빈공간을 만들어 날려줘야한다.
            if (num < 97 || num > 122) {
                if (num==48) {break;}  //아스키코드에선 0= 48
                System.out.print("소문자만 입력하세요 다시 입력해주세요:");
                System.in.read();
                num = System.in.read();
                System.in.read();
                System.in.read();
            } else {
                System.out.println((char) (num - 32));
            }
        }
    }
}
