import java.sql.*;
import java.util.Scanner;

public class JDBCBooks2 {
    // 2020-12-15 선생님ver

    // playground 데이터베이스의 Members 테이블에
    // 새로운 회원정보를 입력하는 JDBC프로그램을 작성하세요
    // 컬럼정보 : custid, name, address, phone
    // 입력은 Scanner 이용
    public static void main(String[] args) {
        // 데이터베이스 연결정보
        String DRV="org.mariadb.jdbc.Driver";
        String URL="jdbc:mariadb://mariadb.cw2h1nljbpsk.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR="playground";
        String PWD="playground2020";

        // 회원정보 입력
        //custid, name, address, phone
        Scanner sc = new Scanner(System.in);
        System.out.print("회원번호는 ? :");
        int custid= Integer.parseInt(sc.nextLine());
        System.out.print("회원이름은 ? :");
        String name= sc.nextLine();
        System.out.print("회원주소는? ? :");
        String address= sc.nextLine();
        System.out.print("회원전화번호는? ? :");
        String phone=sc.nextLine();

        // 질의문 작성
        String sql ="insert into bookMembers values "+
                "(" +custid+ ",'" +name+ "','" +address+ "','" +phone+ "')";
        // 질의문 테스트
        System.out.println(sql);

        // JDBC 드라이버 초기화(연결)
        // JDBC Connection 객체 생성
        // JDBC Statement 객체 생성
        // SQL문 실행 및 결과 확인
        // JDBC 관련 객체 제거

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);
            stmt = conn.createStatement();
            int cnt = stmt.executeUpdate(sql);
            if (cnt>0)
                System.out.println("데이터 추가완료!");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버가 없어요!");
        } catch (SQLException throwables) {
            System.out.println("JDBC 연결 실패!");
        }finally {
            if (stmt != null)
                try { stmt.close(); }
                catch (SQLException throwables){ }

            if (conn != null)
                try { conn.close(); }
                catch (SQLException throwables) { }

        }







    }
}
