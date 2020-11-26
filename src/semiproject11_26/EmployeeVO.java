package semiproject11_26;

/**
 * 인사 정보 프로그램
 * 사번empno, 이름fname, 성lname, 이메일email, 전화번호phone, 입사일hdatd,
 * 직책jobid, 급여sal, 수당comm, 상사mgrid, 부서deptid
 */
public class EmployeeVO {
    //멤버 변수
   private int empno;
   private String fname;
   private String lname;
   private String email;
   private String phone;
   private String hdatd;
   private String jobid;
   private int sal;
   private double comm;
   private int mgrid;
   private int deptid;

    public EmployeeVO() {
    }

    public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdatd, String jobid, int sal, double comm, int mgrid, int deptid) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdatd = hdatd;
        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdatd() {
        return hdatd;
    }

    public void setHdatd(String hdatd) {
        this.hdatd = hdatd;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
