package part1;

public class Company {
     Employee[] employees ;
     String nameCompany ;
    private double budget;
    private String Boss ;

    public Employee[] getEmployees() {
        return employees;
    }



    public String getNameCompany() {
        return nameCompany;
    }

    public String getBoss() {
        return Boss;
    }

    public Company(Employee[] employees, String nameCompany,String boss, double budget) {
        this.employees = employees;
        this.nameCompany = nameCompany;
        this.budget = budget;
      this.Boss = boss ;
    }

    // ----------------------


    // -------------------------------------------


    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
//-----------------------------------------------




    public void employeeSalaries() {
        int count = 0;
        //Employee [] employees ;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count = (int) (count + employees[i].getSALARY());

            }

        }
        System.out.println(count);

    }

    public void lisrSootrudnikov() {
        Employee[] employees = this.employees;
        System.out.println("Список соотрудников:");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println((i + 1) + "-" + employees[i].getNameEmpoyee());
        }
    }

    public void addEmployee(Employee person ) {
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null){
                employees[i]= person;
                System.out.println("соотрудник : "+employees[i].getNameEmpoyee() +" Добавлен в компанию !");
                return;
            }
        }
        System.out.println(person +" не добавлен в компанию ! ");
    }
    public  void  deleteEmployee (Employee person){
        for (int i = 0; i < employees.length; i++){
        if( employees[i].equals(person)){
                employees[i]=null ;
                System.out.println("соотрудник  "+person.getNameEmpoyee()+" удалено из компани  !");
            }
        }}

    public  void changeBoss (Employee newBoss){
        Employee[] employees = this.employees ;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getNameEmpoyee().equals(newBoss)){
               employees[i]=newBoss ;
            }
        }
        System.out.println("new boss :"+ newBoss.getNameEmpoyee());
    }

    public Employee getEmployeeByName(String name) {

        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getNameEmpoyee().equals(name)&&employees[i]!=null){
         return employees[i];
            }
        }
        return  null;
    }
}
