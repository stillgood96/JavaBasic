package semiproject11_26;

public class EmployeeVO {
    protected int empno; //사원번호
    protected String fname; // 성
    protected String lname; // 이름
    protected String email; //이메일
    protected String phone; //핸드폰번호
    protected String hdate; // 입사일
    protected String jobid; // 직책
    protected int salary; // 연봉
    protected String comm; //??모름
    protected int mgrid; // 사수번호
    protected int deptid; // 부서번호

    public EmployeeVO() {
    }

    public EmployeeVO(int empno, String fname, String email, String jobid, int mgrid, int deptid) {
        this.empno = empno;
        this.fname = fname;
        this.email = email;
        this.jobid = jobid;
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

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
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
