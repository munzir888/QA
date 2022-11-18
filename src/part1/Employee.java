package part1;

public class Employee {
    String nameEmpoyee;

     double SALARY = 60000;

     private     String post ;

    public void setPost(String post) {
        this.post = post;
    }

    public Employee(String name, double SALARY, String post) {
        this.nameEmpoyee = name;
        this.SALARY = SALARY;
        this.post = post;
    }

    public String getNameEmpoyee() {
        return nameEmpoyee;
    }

    public void setNameEmpoyee(String nameEmpoyee) {
        this.nameEmpoyee = nameEmpoyee;
    }

    public double getSALARY() {
        return SALARY;
    }

    public String getPost() {
        return post;
    }
}
