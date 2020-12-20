package DAY_12_18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SamKwangFinalV1DAO {
    // CODP 테이블에서 기본정보만 조회한후 넘김
    public static ArrayList<SamKwangCODP_VO> selectCODP() {
        ArrayList<SamKwangCODP_VO> codps = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = SamKwangJDBC.makecConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.selectCODP);
            rs= pstmt.executeQuery();
            while(rs.next()){
                SamKwangCODP_VO codp = new SamKwangCODP_VO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getInt(8) );
                codps.add(codp);
            }

        } catch (SQLException sc) {
            System.out.println("selectCODP에서 오류발생 !");
            sc.printStackTrace();
        }


        SamKwangJDBC.destroyConn(conn,pstmt,rs);

        return codps;
    }

    // 넘겨준 주문번호를 이용해서 CODP에서 주문정보를 조회하고  결과를 넘겨줌
    public static ArrayList<SamKwangCODP_VO> selectOneCodp(int 주문번호) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<SamKwangCODP_VO> codps = new ArrayList<>();

        conn = SamKwangJDBC.makecConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.selectOneCODP);
            pstmt.setInt(1,주문번호);
            rs = pstmt.executeQuery();
            while(rs.next()){
                SamKwangCODP_VO codp = new SamKwangCODP_VO(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getInt(12),
                        rs.getString(13),
                        rs.getString(14),
                        rs.getInt(15),
                        rs.getInt(16)
                );
                codps.add(codp);
            }
        } catch (SQLException se) {
            System.out.println("selectOneCODP 에서 오류 발생! ");
            se.printStackTrace();
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);

        return codps;
    }

    // SOE  테이블에서 기본정보만 조회후 넘김
    public static ArrayList<SamKwangSOE_VO> selectSOE() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<SamKwangSOE_VO> soes = new ArrayList<>();

        conn = SamKwangJDBC.makecConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.selectSOE);
            rs= pstmt.executeQuery();
            while(rs.next()){
             SamKwangSOE_VO    soe = new SamKwangSOE_VO(
                         rs.getInt(1),
                         rs.getInt(2),
                         rs.getInt(3),
                         rs.getString(4),
                         rs.getString(5),
                         rs.getString(6)
                 );
             soes.add(soe);
            }
        } catch (SQLException se) {
            System.out.println("selectSOE에서 오류발생 !");
            se.printStackTrace();
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);
        return soes;
    }
    // 넘겨준 운송 ID를 이용해서 SOE에서 배성정보를 조회하고 결과를 넘겨줌
    public static SamKwangSOE_VO selectOneSOE(int 운송ID) {
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            SamKwangSOE_VO soe = null;

            conn = SamKwangJDBC.makecConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.selectOneSOE);
            pstmt.setInt(1,운송ID);
            rs= pstmt.executeQuery();
            if(rs.next()){
                soe = new SamKwangSOE_VO(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13)

                );

            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);

        return soe;
    }

    public static ArrayList<SamKwangCOE_VO> readCOE() {
        Connection conn= null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;
        ArrayList<SamKwangCOE_VO> coes = new ArrayList<>();


        conn = SamKwangJDBC.makecConn();
        try {
            pstmt =conn.prepareStatement(SamKwangJDBC.selectCOE);
            rs = pstmt.executeQuery();
            while(rs.next()){
                SamKwangCOE_VO coe = new SamKwangCOE_VO(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
                coes.add(coe);

            }

        } catch (SQLException se) {
            System.out.println("selectCOE");
            se.printStackTrace();
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);

        return coes;
    }


    public static ArrayList<SamKwangCOE_VO> selectOneCOE(int 인사번호) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<SamKwangCOE_VO> coes = new ArrayList<>();

        conn = SamKwangJDBC.makecConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.selectOneCoe);
            pstmt.setInt(1,인사번호);
            rs= pstmt.executeQuery();
            while(rs.next()){
               SamKwangCOE_VO coe =new SamKwangCOE_VO(
                       rs.getInt(1),
                       rs.getInt(2),
                       rs.getString(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6),
                       rs.getString(7),
                       rs.getInt(8),
                       rs.getString(9),
                       rs.getString(10),
                       rs.getString(11),
                       rs.getString(12),
                       rs.getString(13),
                       rs.getString(14),
                       rs.getString(15)
                       );
               coes.add(coe);
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }

        return coes;
    }
}
