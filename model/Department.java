package model;

public class Department {

    private String Deptname;
    // private int DeptID;

    public Department(String deptname) {
        this.Deptname = deptname;
        // DeptID = deptID;
    }

    public String getDeptname() {
        return Deptname;
    }

    public void setDeptname(String deptname) {
        Deptname = deptname;
    }
}
