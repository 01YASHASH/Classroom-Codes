public class Practice {

    int Emp_id;
    String Emp_name;
    Practice(int i,String name){
        Emp_id=i;
        Emp_name=name;
    }
    void printInfo(){
        System.out.print("Details of Employee are: "+Emp_id+" "+Emp_name);
    }
    public static void main(String[] args) {
        
    }
}