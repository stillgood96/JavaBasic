package stillgood96;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SungJukV10DAO {
    // 넘겨받은 성적데이터를 sungjuk테이블에 저장합니다.
    public static String insertSungJuk(SungJukV0 sj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result="성적데이터 처리중...?!";

        conn = SungJukJDBC.makecConn();
        try {
            pstmt = conn.prepareStatement(SungJukJDBC.insertSungJuk);
            pstmt.setString(1,sj.getName());
            pstmt.setInt(2,sj.getKor());
            pstmt.setInt(3,sj.getEng());
            pstmt.setInt(4,sj.getMath());
            pstmt.setInt(5,sj.getSum());
            pstmt.setString(6,String.format("%.2f",sj.getMean()));
            pstmt.setString(7,String.valueOf(sj.getGrd()));
            int cnt = pstmt.executeUpdate();
            if(cnt>0) {
                result = "성적데이터 저장완료!";
            }
        } catch (SQLException throwables) {
            System.out.println("insertSQL에서 오류발생!");
        }
        SungJukJDBC.destroyConn(conn,pstmt);
        return result;
    }

    // 번호,이름,국어,영어,수학,등록일을 조회해서
    // 그 결과들을 ArrayList에 담아서 넘김
   public static ArrayList<SungJukV0> selectSungJuk() {
       ArrayList<SungJukV0> sjs = new ArrayList<>();
        Connection conn = null;
       PreparedStatement pstmt = null;
       ResultSet rs = null;

       conn = SungJukJDBC.makecConn();
       try {
           pstmt = conn.prepareStatement(SungJukJDBC.selectSungJuk);
           rs = pstmt.executeQuery();
           while(rs.next()){
               SungJukV0 sj = new SungJukV0(
                       rs.getInt(1),    //sjno
                       rs.getString(2), //name
                       rs.getInt(3),    //kor
                       rs.getInt(4),    //eng
                       rs.getInt(5),    //math
                       0, 0.0,' ',rs.getString(6)); //regdate
               sjs.add(sj);
           }
       } catch (SQLException throwables) {
           System.out.println("selectSungJuk에서 오류발생!");
       }
       SungJukJDBC.destroyConn(conn,pstmt,rs);

       return sjs;
    }

    // 성적번호로 성적데이터를 조회하고
    // 그 결과를 SungJukV0에 담아서 넘김
    public static SungJukV0 selectOneSungJuk(String sjno) {
        SungJukV0 sj = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs =null;

        conn = SungJukJDBC.makecConn();

        try {
            pstmt=conn.prepareStatement(SungJukJDBC.selectOneSungJuk);
            pstmt.setString(1,sjno);
            rs = pstmt.executeQuery();
            if (rs.next()) {  //한개의 값만 가져오니까 if
                sj = new SungJukV0(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getDouble(7),
                        rs.getString(8).charAt(0), // char라 문자1개만가져오니까
                        rs.getString(9));
            }
        } catch (SQLException throwables) {
            System.out.println("selectOneSungJuk 에서 오류 발생!!");
            throwables.printStackTrace();
        }
        SungJukJDBC.destroyConn(conn,pstmt,rs);


        return sj;
    }
}
