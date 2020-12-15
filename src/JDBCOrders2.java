import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders2 {

    public static void main(String[] args) {
        /**
        Connection conn = null;
        PreparedStatement pstm = null;

        String sql ="insert into bookOrders values(?,?,?,?,?)";

        Scanner sc = new Scanner(System.in);
        System.out.print("주문번호 입력 :");
        int orderid=Integer.parseInt(sc.nextLine());
        System.out.print("고객번호 입력 :");
        int custid=Integer.parseInt(sc.nextLine());
        System.out.print("책번호 입력 :");
        int bookid=Integer.parseInt(sc.nextLine());
        System.out.print("책가격 입력 :");
        int saleprice=Integer.parseInt(sc.nextLine());
        System.out.print("주문날짜 입력 :");
        String orderdate=sc.nextLine();

        conn = JDBCUtil.makecConn();

        try{
            pstm=conn.prepareStatement(sql);
            pstm.setInt(1,orderid);
            pstm.setInt(2,custid);
            pstm.setInt(3,bookid);
            pstm.setInt(4,saleprice);
            pstm.setString(5,orderdate);
            int cnt = pstm.executeUpdate();
            if(cnt>0)
                System.out.println("데이터 추가완료");
        } catch (SQLException throwables) {
            System.out.println("데이터 추가오류가 나왔따");
        }
        JDBCUtil.destroyConn(conn,pstm);
         **/

        // 선생님ver
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into bookOrders values(?,?,?,?,?)";

        Scanner sc = new Scanner(System.in);
        System.out.print("주문번호 입력 :");
        int orderid=Integer.parseInt(sc.nextLine());
        System.out.print("고객번호 입력 :");
        int custid=Integer.parseInt(sc.nextLine());
        System.out.print("책번호 입력 :");
        int bookid=Integer.parseInt(sc.nextLine());
        System.out.print("책가격 입력 :");
        int saleprice=Integer.parseInt(sc.nextLine());
        System.out.print("주문날짜 입력 :");
        String orderdate=sc.nextLine();

        // 입력받은 데이터를 테이블에 저장
        conn = JDBCUtil.makecConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,orderid);
            pstmt.setInt(2,custid);
            pstmt.setInt(3,bookid);
            pstmt.setInt(4,saleprice);
            pstmt.setString(5,orderdate);
            int cnt = pstmt.executeUpdate();
            if (cnt>0)
                System.out.println("데이터 추가 완료!");
        } catch (SQLException throwables) {
            System.out.println("JDBC 질의문 오류 발생!");
        }

        // 리소스와 접촉이 끝나면 닫아줘야함
        JDBCUtil.destroyConn(conn,pstmt);

        // 하하 이것도 선생님과 동일하다 하하하하ㅏ하하하하하하하하하하

    }
}
