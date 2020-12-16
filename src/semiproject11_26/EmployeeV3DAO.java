package semiproject11_26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeV3DAO {
    // employees 테이블에서 사원번호 , 성 , 이메일 ,직책, 상사 부서번호들을
    // 조회해서 ArrayList로 구성한 후 EmployeeV3Service 로 넘김
    public static ArrayList<EmployeeVO> selectEmp() {
            Connection conn = null;
            PreparedStatement pstmt = null;
            ArrayList<EmployeeVO> emps = new ArrayList<>();
            ResultSet rs  = null;

            conn = EmployeeJDBC.makecConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.selectEmp);
            rs=pstmt.executeQuery();
            while(rs.next()){
                EmployeeVO e = new EmployeeVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)
                        );
                emps.add(e);
            }
        } catch (SQLException throwables) {
            System.out.println("selectEmp에서 오류발생!!");
        }
        EmployeeJDBC.destroyConn(conn,pstmt,rs);

        return emps;


    }
}
