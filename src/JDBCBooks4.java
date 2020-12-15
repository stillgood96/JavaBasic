import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCBooks4 {



    public static void main(String[] args) {
        // Books테이블의 저장된 모든 내용을 출력함
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;  // 조회를 위한


        // sql문
        String sql = "select * from books";

        StringBuilder sb = new StringBuilder();
        String fmt = "%s %s %s %s\n";
        conn = JDBCUtil.makecConn();
        try {
            pstmt= conn.prepareStatement(sql);
            rs=pstmt.executeQuery();           //쿼리를 가져온다.
            while(rs.next()){ // collection 수업때의 hasnext는 열단위로 가져온다 next는 행단위
                String bookid = rs.getString(1);
                String bookname = rs.getString(2);
                String publisher = rs.getString(3);
                String price = rs.getString(4);
                String result = String.format(fmt,bookid,bookname,
                        publisher,price);
                sb.append(result);
            }
        } catch (SQLException throwables) {
            System.out.println("JDBC 질의문 오류");
        }

        JDBCUtil.destroyConn(conn,pstmt,rs);


        // 결과 출력
        System.out.println(sb.toString());


    }

}
