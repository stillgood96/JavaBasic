import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders3C {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("조회하고자하는  날짜는??");
        String orderdate=sc.nextLine();

        String sql = "select * from bookOrders where orderdate like  ?";
        StringBuilder sb = new StringBuilder();
        String fmt= "%s %s %s %s %s\n";
        conn=JDBCUtil.makecConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,orderdate+'%');
            rs=pstmt.executeQuery();
            while(rs.next()){
                String orderid = rs.getString(1);
                String custid2 = rs.getString(2);
                String bookid = rs.getString(3);
                String saleprice = rs.getString(4);
                String orderdate2 = rs.getString(5);
                String result = String.format(fmt,orderid,custid2,bookid,saleprice,orderdate);
                sb.append(result);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        JDBCUtil.destroyConn(conn,pstmt,rs);

        System.out.println(sb.toString());

    }
}
