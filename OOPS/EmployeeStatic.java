class EmployeeStatic {
    private int id;
    private String name;
    private static String company = "KIET Groups";
    private static int count = 0;
    public EmployeeStatic(String name) {
        this.id = ++count;
        this.name = name;
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Institution: " + company);
    }
    public static void changeCompany(String newCompany) {
        company = newCompany;
    }
    public static void main(String[] args) {
        EmployeeStatic e1 = new EmployeeStatic("YASHASH");
        EmployeeStatic e2 = new EmployeeStatic("SAKSHAM");
        e1.display();
        e2.display();
        EmployeeStatic.changeCompany("ABES Engineering College");
        e1.display();
        e2.display();
    }
}