class Employee{
    String empname;
    int empid;
}
class Faculty extends Employee{
    String department;
    void details(){
        System.out.println("Details of employee: "+empid+" "+empname+" "+department);
    }
}
public class InnerEmployee {
    public static void main(String[] args) {
        Faculty f=new Faculty();
        f.empname="Yashash";
        f.empid=101;
        f.department="Computer Science";
        f.details();
    }
    
}
