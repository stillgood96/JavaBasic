import java.sql.*;
import java.util.Scanner;

public class JDBCBooks3 {
    // statement vs preparedStatement
    // 정적쿼리문과 동적쿼리문
    // 정적쿼리문은 사용하기전에 변수들을 이용해서
    // 온전한 형태의 문장을 미리 만들어둬야함
    // 또한 , 쿼리문이 실행될때 매번 1)쿼리 문장 분석 2)컴파일
    // 3) 실행의 과정을 거쳐야함 -> 성능저하

    // 반면, 동적쿼리문은 미리 불완전한 형태의 문장을 먼저 만들어두고
    // 실행전에 매개변수에 실제로 전달할 값을 지정할 수 있음
    // 또한, 캐쉬기능을 지원하기 때문에 반복적으로 실행하는 문장의 경우
    // 1),2) 과정을 건너뛰고 3)으로 바로 갈수있음

    // PreparedStatement 의 IN/OUT 매개변수
    // placeholder 매개변수,binding 매개변수라고 함
    // sql 질의문 객체 생성시 사용하는 매개변수는 ? 로 표기
    // IN 매개변수는 질의문 생성시 입력값 대용으로 사용
    // OUT 매개변수는 질의문을 실행하고 넘겨주는 결과값을 받을때 사용
    // java => ?,?
    // python : %s, %d
    // c# : @name, @passwd
    // orcle => : 1, :



    // JDBC 드라이버 초기화 및 Connection 객체 생성
    public static Connection makecConn() {
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cw2h1nljbpsk.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";
        Connection conn = null;
        try {
            Class.forName(DRV);
            conn=DriverManager.getConnection(URL,USR,PWD);

        } catch (ClassNotFoundException e) {
            System.out.println("너 드라이버에 문제있어?!");
        } catch (SQLException e) {
            System.out.println("JDBC 연결실패!");
        }
        return conn;
    }

    // JDBC 관련 객체 해제
    public static void destroyConn(Connection conn, PreparedStatement pstmt) {
        if (pstmt != null)
            try { pstmt.close(); }
            catch (SQLException throwables){ }

        if (conn != null)
            try { conn.close(); }
            catch (SQLException throwables) { }

    }


    public static void main(String[] args) {
        // 데이터베이스 관련 변수
        Connection conn;
        PreparedStatement pstmt = null;
        String sql = "insert into books Values (?,?,?,?)";


        // 도서정보 입력변수
        Scanner sc = new Scanner(System.in);
        System.out.print("도서 번호는? :");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.print("도서 제목은? :");
        String bookname = sc.nextLine();
        System.out.print("도서출판사는? :");
        String publisher = sc.nextLine();
        System.out.print("도서가격은? :");
        int price = Integer.parseInt(sc.nextLine());

        // 입력받은 도서정보를 테이블에 저장
        conn = makecConn();

        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,bookid);
            pstmt.setString(2,bookname);
            pstmt.setString(3,publisher);
            pstmt.setInt(4,price);

            int cnt = pstmt.executeUpdate();
            if (cnt>0)
                System.out.println("도서정보 추가완료!");
        } catch (SQLException e) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        destroyConn(conn,pstmt);

    }
}
