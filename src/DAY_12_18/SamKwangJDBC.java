package DAY_12_18;

import stillgood96.JDBCUtil;

public class SamKwangJDBC extends JDBCUtil {

    public static String selectCODP =
            " select 고객번호,고객이름,주문번호,주문일,제품번호,수량,제품이름,단가 from CODP order by 주문번호 desc ";
    public static String selectOneCODP =
            " select * from CODP where 주문번호 = ? ";
    public static String selectSOE=
            "select 인사번호,주문번호,운송ID,운송이름,주문일,직책 from SOE order by 운송ID desc ";
    public static String selectOneSOE=
            "select * from SOE where 운송ID = ?";
}
