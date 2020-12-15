import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers3C {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement pstmt = null;
        ResultSet rs =null;

        String sql = "select * from bookMembers where name = ?";
        Scanner sc = new Scanner(System.in);
        System.out.print("조회하려는  사람이름은 ? :");
        String name=sc.nextLine();


        conn =JDBCUtil.makecConn();
        StringBuilder sb = new StringBuilder();
        String fmt = "%s,%s,%s,%s\n";
        try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,name);
            rs= pstmt.executeQuery();
            while(rs.next()) {
                String custid = rs.getString(1);
                String name2 = rs.getString(2);
                String address = rs.getString(3);
                String phone = rs.getString(4);
                String result = String.format(fmt, custid, name2, address, phone);
                sb.append(result);
            }
        } catch (SQLException throwables) {
            System.out.println("데이터가져오기 실패쓰");
        }
        JDBCUtil.destroyConn(conn,pstmt,rs);

        System.out.println(sb.toString());

    }
}
