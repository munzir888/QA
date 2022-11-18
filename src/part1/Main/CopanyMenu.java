package part1.Main;

import part1.Company;
import part1.Employee;

import java.util.Scanner;

public class CopanyMenu {
    public static void start(Company company) {
        Employee employee1 = new Employee("Munza",120000,"manager");
        Employee employee2 = new Employee("isa",100000,"accountant");
        Employee employee3 = new Employee("sasha ",240000,"officeWork");

        Company company1 = new Company(new Employee[]{employee1,employee2}, "Coco-cola","musa",2323);
        Company company2 = new Company(new Employee[]{employee1,employee2}, "Bugatti","musa",9923);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информацию о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("6) Поменять руководителя компании");
            System.out.println("7) Меню для работы с сотрудниками");
            System.out.println("0) Выход из главного меню");
            int command = sc.nextInt();
            if (command == 1) {

                System.out.println("имя компании :"+  company1.getNameCompany());
                System.out.println("бюджет : "+ company1.getBudget());
                System.out.println(  "Руководитель : "+ company1.getBoss());
            } else if (command == 2) {

                company1.lisrSootrudnikov();
            } else  if (command == 3){

                company1.employeeSalaries();
            }
                else if (command == 4) {

                company1.addEmployee(employee1);
            } else if (command == 5) {

                company1.deleteEmployee(employee1);
            } else if (command == 6) {


        company1.changeBoss(employee2);

            } else if (command == 7) {
                String employeeName = sc.nextLine();

                Employee foundedEmployee =  company1.getEmployeeByName(employeeName);

               EmployeeMenu.start(foundedEmployee);

            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }


}
