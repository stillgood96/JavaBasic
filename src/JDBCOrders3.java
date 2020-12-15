import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCOrders3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from bookOrders";
        StringBuilder sb = new StringBuilder();
        String fmt= "%s %s %s %s %s\n";
        conn=JDBCUtil.makecConn();
        try {
            pstmt = conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while(rs.next()){
                String orderid = rs.getString(1);
                String custid = rs.getString(2);
                String bookid = rs.getString(3);
                String saleprice = rs.getString(4);
                String orderdate = rs.getString(5);
                String result = String.format(fmt,orderid,custid,bookid,saleprice,orderdate);
                sb.append(result);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        JDBCUtil.destroyConn(conn,pstmt,rs);

        System.out.println(sb.toString());

    }
}
