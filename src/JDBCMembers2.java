import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers2 {
    // 공용의 의미의 메서드는 static으로 생성 하면된다
    // static으로 생성하면 new 생성자 없이도 만들 수 있다
    // 허나 개인의 정보를 각각 저장해야한다거나 그러면 new생성자로 만들어야한다.
    public static void main(String[] args) {
        /**
        Connection conn = null;
        PreparedStatement pstm = null;

        String sql = "insert into bookMembers Values (?,?,?,?)";

        Scanner sc = new Scanner(System.in);
        System.out.print("고객번호 입력 :");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.print("고객이름 입력 :");
        String name = sc.nextLine();
        System.out.print("고객주소 입력 :");
        String address = sc.nextLine();
        System.out.print("고객번호 입력 :");
        String phone = sc.nextLine();

        conn= JDBCUtil.makecConn();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,custid);
            pstm.setString(2,name);
            pstm.setString(3,address);
            pstm.setString(4,phone);
            int cnt = pstm.executeUpdate();
            if (cnt>0)
                System.out.println("데이터 추가 완료!");
        } catch (SQLException throwables) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destroyConn(conn,pstm);
         **/




        // 선생님ver
        // JDBC 관련변수
        Connection conn=null;
        PreparedStatement pstmt=null;
        String sql="insert into bookMembers values (?,?,?,?)";


        Scanner sc = new Scanner(System.in);

        System.out.print("고객번호 입력 :");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.print("고객이름 입력 :");
        String name = sc.nextLine();
        System.out.print("고객주소 입력 :");
        String address = sc.nextLine();
        System.out.print("고객번호 입력 :");
        String phone = sc.nextLine();

        // 입력받은 회원정보를 테이블에 저장
        conn = JDBCUtil.makecConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,custid);
            pstmt.setString(2,name);
            pstmt.setString(3,address);
            pstmt.setString(4,phone);
            int cnt = pstmt.executeUpdate();
            if (cnt>0)
                System.out.println("회원정보 추가 완료!");
        } catch (SQLException throwables) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destroyConn(conn,pstmt);

        // 오호 ~ 나랑 동일하다 앙 기모륑~~~~

    }

}
