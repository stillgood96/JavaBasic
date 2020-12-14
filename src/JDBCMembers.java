import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMembers {
    // playground 데이터베이스의 Members 테이블에
    // 새로운 회원정보를 입력하는 JDBC프로그램을 작성하세요
    // 컬럼정보 : custid, name, address, phone
    // 입력은 Scanner 이용

    public static void main(String[] args) {
        // db 추가정보를 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("고객번호는 ? :");
        int custid=Integer.parseInt(sc.nextLine());
        System.out.println("고객이름은 ? :");
        String name=sc.nextLine();
        System.out.println("고객주소는 ? :");
        String address=sc.nextLine();
        System.out.println("고객핸드폰 번호는 ? :");
        String phone=sc.nextLine();

        // db 접속 준비
        String data="insert into bookMembers values("
                +custid+",'"+name+"','"+address+"','"+phone+"');";

        String DRV="org.mariadb.jdbc.Driver";
        String URL="jdbc:mariadb://mariadb.cw2h1nljbpsk.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR="playground";
        String PWD="playground2020";

        // db 드라이버 초기화
        try {
            Class.forName(DRV);
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc 확인요망!");
        }
        // db 접속
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USR,PWD);
        } catch (SQLException throwables) {
            System.out.println("DB접속 실패");
        }

        // DB 값 넣기
        Statement stmt = null;
        try {
            stmt=conn.createStatement();
            stmt.execute(data);
            System.out.println("데이터 값 넣기 성공");
        } catch (SQLException throwables) {
            System.out.println("데이터 값 넣기 실패");
        }

        if(stmt !=null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
            }
        }
        if(conn !=null){
            try {
                conn.close();
            } catch (SQLException throwables) {

            }
        }


    }
}
