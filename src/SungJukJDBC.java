public class SungJukJDBC extends JDBCUtil{

    // public static을 적용하여 어디서든 사용할수있는 공용변수가 된다.
    public static String insertSungJuk =
            "insert into sungjuk2 (name,kor,eng,mat,tot,mean,grd)\n" +
                    "values (?,?,?,?,?,?,?);";
    public static String selectSungJuk =
            "select sjno,name,kor,eng,mat from sungjuk2 order by sjno desc";
    public static String selectOneSungJuk =
            "select * from sungjuk where sjno =?";
    public static String updateSungJuk =
            "update sungjuk2"+ "set kor =?,eng=?,mat=?,tot=?,mean=?,grd=? where sjno=?";
    public static String deleteSungJuk =
            "delete sungjuk2 where sjno =?";
}
