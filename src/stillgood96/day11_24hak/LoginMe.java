package stillgood96.day11_24hak;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.rmi.runtime.Log;

import java.util.Scanner;

/**
 *  LoginMe
 *
 *
 *  로그인 확인 프로그램
 *  0. 인증용 아이디와 비밀번호를 하나 생성해둠
 *  =>abc123, 987xyz
 *  1. Scanner로 아이디, 비밀번호를 입력받음
 *  2a. 아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
 *  2b. 아이디만 맞으면 "비밀번호가 틀렸음!"
 *  2c. 아이디와 비밀번호가 맞으면 "로그인 성공!"
 *
 *
 */
public class LoginMe {
    public static void main(String[] args) {

        String userID="abc123";
        String userPS="987xyz";
        String ps="";
        String id="";

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("아이디를 입력해주세요:");
            id = sc.nextLine();
            System.out.print("비밀번호를 입력해주세요:");
            ps = sc.nextLine();

            if (userID.equals(id) && userPS.equals(ps)) {
                System.out.println("로그인 성공!");
                break;
            } else if (userID.equals(id) && !userPS.equals(ps)) {
                System.out.println("비밀번호가 틀렸음");
            }else System.out.println("가입되지 않은 아이디");
        }





    }
}

