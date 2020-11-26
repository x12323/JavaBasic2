package semiprojects;

/**
 * 인사 정보 프로그램
 * 사번 : empno, 이름 : fname, 성 : lname, 이메일 : email,
 * 전화번호 : phone, 입사일 : hdate, 직책 : jobid,
 * 급여 : sal, 수당 : comm, 상사 : mgrid, 부서 : deptid
 */

public class EmployeeVO {
    private int empno;
    private String fname;
    private String lname;
    private String email;
    private int phone;
    private int hdate;
    private String jobid;
    private int sal;
    private double comm;
    private int mgrid;
    private int deptid;

    public EmployeeVO(int empno, String fname, String lname, String email, int phone, int hdate,
                      String jobid, int sal, double comm, int mgrid, int deptid) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public EmployeeVO() {

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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getHdate() {
        return hdate;
    }

    public void setHdate(int hdate) {
        this.hdate = hdate;
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


