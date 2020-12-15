import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBooks3C {
    public static void main(String[] args) {
        // 도서제목으로 도서제목을 포함하는 도서정보 조회 (LIKE 절이용)
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // select * from Books where bookname like '%축구%'
        String sql = "select * from books where bookname like ?";
        String fmt = "%s %s %s %s\n";
        StringBuilder sb = new StringBuilder();

        // 조회할 도서제목을 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("책제목에 포함되어있는 단어 입력 ?! :");
        String name = sc.nextLine();

        //
        conn = JDBCUtil.makecConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,'%'+name+'%');
            rs = pstmt.executeQuery();

            while(rs.next()){
                String bkid = rs.getString(1);
                String bkname = rs.getString(2);
                String bkmaker = rs.getString(3);
                String price = rs.getString(4);

                String result = String.format(fmt,bkid,bkname,bkmaker,price);
                sb.append(result);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        JDBCUtil.destroyConn(conn,pstmt,rs);

        System.out.println(sb.toString());
    }
}
