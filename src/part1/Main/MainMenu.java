package part1.Main;

import part1.Company;
import part1.Employee;
import part1.Holding;

import java.util.Scanner;

public class MainMenu {
    public static void start(Holding holding) {


        Scanner in = new Scanner(System.in);
        Employee employee1 = new Employee("Munza",120000,"manager");
        Employee employee2 = new Employee("isa",100000,"accountant");
        Employee employee3 = new Employee("sasha ",240000,"officeWork");

        Company company1 = new Company(new Employee[]{employee1,employee2}, "Coco-cola","musa",2323);
        Company company2 = new Company(new Employee[]{employee1,employee2}, "Bugatti","musa",9923);

        while (true) {
            System.out.println("Главне меню для работы с холдингом: ");
            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже"+
                    "работающих сотрудников");
                    System.out.println("4) Добавление компании в холдинг");
            System.out.println("5) Удаление компании из холдинга");
            System.out.println("6) Меню для работы с компанией");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();

            if (command == 1) {
                holding.showCompanies();
            } else if (command == 2) {
         holding.sumBudgetCompany();
            } else if (command == 3) {

                holding.countEmployee(company1.getEmployees());

            } else if (command == 4) {

             holding.addCompany(company1);


            } else if (command == 5) {

                holding.deleteCompany(company1);
            } else if (command == 6) {
                System.out.println("напешите что угодно ! ");
                String companyName = in.next();
                Company foundedCompany =  holding.getCompanyByName(companyName);
                CopanyMenu.start(foundedCompany);


            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
