
package KIET;

public class EmployeeKIET {
    public String Emp_name;
    private int Salary;
    protected int Emp_id;
    String organization;
    void employeeDetails(){
        System.out.println("Details of the employee : "+"\n"+Emp_id+" "+Emp_name+" "+organization+" "+Salary);
    }
    public static void main(String[] args) {
        EmployeeKIET ek=new EmployeeKIET();
        ek.Emp_name="YASHASH";
        ek.Emp_id=1;
        ek.Salary=100000;
        ek.organization="KIET GROUPS";
        ek.employeeDetails();
    }
}
