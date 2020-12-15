import java.sql.*;
import java.util.Scanner;

public class JDBCOrders {
    // playground 데이터베이스의 bookOrders 테이블에
    // 새로운 회원정보를 입력하는 JDBC프로그램을 작성하세요
    // 컬럼정보 : orderid, custid, bookid, saleprice, orderdate
    // 입력은 Scanner 이용


    public static void main(String[] args) {
        // 선생님 ver
        // 데이터베이스 연결정보
        String DRV="org.mariadb.jdbc.Driver";
        String URL="jdbc:mariadb://mariadb.cw2h1nljbpsk.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR="playground";
        String PWD="playground2020";

        // JDBC 관련 객체 변수
        Connection conn = null;
        Statement stmt = null;

        // 기타 객체 변수
        Scanner sc = new Scanner(System.in);

        // 주문정보 입력받기
        System.out.print("주문번호는 ? :");
        int orderid = Integer.parseInt(sc.nextLine());
        System.out.print("회원번호는 ? :");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.print("도서번호는 ? :");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.print("도서가격은 ? :");
        int saleprice = Integer.parseInt(sc.nextLine());
        System.out.print("주문날짜는 ? :");
        String orderdate = sc.nextLine();

        // 쿼리문 작성
        String sql = "insert into bookOrders values("+orderid+
                ","+custid+","+bookid+","+saleprice+",'"+orderdate+"')";


        System.out.println(sql);

        // JDBC 드라이버 초기화(연결)
        // JDBC Connection 객체 생성
        // JDBC Statement 객체 생성
        // SQL문 실행 및 결과 확인
        // JDBC 관련 객체 제거

        try {
            Class.forName(DRV);
            conn=DriverManager.getConnection(URL,USR,PWD);
            stmt=conn.createStatement();
            int cnt = stmt.executeUpdate(sql);
            if(cnt>0) System.out.println("주문정보 추가완료");
        } catch (ClassNotFoundException e) {
            System.out.println("너 드라이버에 문제있어?");
        } catch (SQLException throwables) {
            System.out.println("JDBC 연결실패!");
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
