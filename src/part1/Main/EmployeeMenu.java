package part1.Main;

import part1.Company;
import part1.Employee;

import java.util.Scanner;

public class EmployeeMenu {

    public static void start(Employee employee) {
        Employee employee1 = new Employee("Munza",120000,"manager");
        Employee employee2 = new Employee("isa",100000,"accountant");
        Employee employee3 = new Employee("sasha ",240000,"officeWork");


        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) Вывод информации о сотруднике");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {


                System.out.println( employee1.getNameEmpoyee());
                System.out.println(employee1.getSALARY());
                System.out.println(employee1.getPost());

            } else if (command == 0) {

                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }}
