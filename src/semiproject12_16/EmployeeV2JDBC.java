package semiproject12_16;

public class EmployeeV2JDBC  extends EmployeeV2Util{
    public static String insertEmployee =
            "insert into EmployeeManage  (empno,fname,lname,email,phone,hdate,jobid,sal,comm,mgrid,deptid) values" +
                    "(?,?,?,?,?,?,?,?,?,?,?)";
    public static String selectEmployee  =
            "select * from EmployeeManage";
    public static String selectOneEmployee =
            "select * from EmployeeManage where empno = ?";
    public static String modifyEmployee =
            "update EmployeManage";

}
