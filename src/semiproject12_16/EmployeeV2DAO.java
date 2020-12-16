package semiproject12_16;

import stillgood96.SungJukJDBC;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeV2DAO {
    public static String insertEmployee(EmployeeV2VO emp) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = null;

        conn = EmployeeV2JDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeV2JDBC.insertEmployee);
            pstmt.setInt(1,emp.getEmpno());
            pstmt.setString(2,emp.getFname());
            pstmt.setString(3,emp.getLname());
            pstmt.setString(4,emp.getEmail());
            pstmt.setString(5,emp.getPhone());
            pstmt.setString(6,emp.getHdatd());
            pstmt.setString(7,emp.getJobid());
            pstmt.setInt(8,emp.getSal());
            pstmt.setDouble(9,emp.getComm());
            pstmt.setInt(10,emp.getMgrid());
            pstmt.setInt(11,emp.getDeptid());
            int cnt = pstmt.executeUpdate();
            if (cnt>0)
                result = "성적데이터 저장완료!";
        } catch (SQLException throwables) {
            System.out.println("DB 데이터 추가완료!");
        }
        EmployeeV2JDBC.destroyConn(conn,pstmt);
        return result;
    }

    // 사원정보들을 동적배열ㅇ ㅔ저장해서 넘긴다.
    public static ArrayList<EmployeeV2VO> selectEmployee() {
        ArrayList<EmployeeV2VO> emps = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = EmployeeV2JDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeV2JDBC.selectEmployee);
            rs = pstmt.executeQuery();
            while(rs.next()){
                EmployeeV2VO emp= new EmployeeV2VO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getInt(10),
                        rs.getInt(11),
                        rs.getString(12) );
                emps.add(emp);
            }
        } catch (SQLException throwables) {
            System.out.println("selectEmployee 에서 오류 발생");
        }
        EmployeeV2JDBC.destroyConn(conn,pstmt,rs);

        return emps;
    }

    public static EmployeeV2VO selectOneEmployee(String empno) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        EmployeeV2VO emp = null;
        ResultSet rs = null;

        conn = EmployeeV2JDBC.makeConn();

        try {
            pstmt = conn.prepareStatement(EmployeeV2JDBC.selectOneEmployee);
            pstmt.setString(1,empno);
            rs= pstmt.executeQuery();
            if(rs.next()){
                emp = new EmployeeV2VO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getInt(10),
                        rs.getInt(11),
                        rs.getString(12)
                );
            }
        } catch (SQLException throwables) {
            System.out.println("selectOneSungJuk 에서 오류발생!");
            throwables.printStackTrace();
        }
        SungJukJDBC.destroyConn(conn,pstmt,rs);

        return emp;
    }
}
