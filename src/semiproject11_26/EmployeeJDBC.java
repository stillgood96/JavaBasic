package semiproject11_26;

import stillgood96.JDBCUtil;

public class EmployeeJDBC extends JDBCUtil {

    public static String insertEmp = "";
    public static String selectEmp  =
            "select employee_id,last_name,email,job_id,manager_id,department_id from EMPLOYEES;";
    public static String selectOneEmp =
            "select * from EMPLOYEES where employee_id = ?";

}
