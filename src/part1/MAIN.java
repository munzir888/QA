package part1;

import part1.Main.MainMenu;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        // Арзыкул уулу Мунзир JAVA-F22

        Scanner in = new Scanner(System.in);
        Employee employee1 = new Employee("Munza",120000,"manager");
        Employee employee2 = new Employee("isa",100000,"accountant");
        Employee employee3 = new Employee("sasha ",240000,"officeWork");

        Company company1 = new Company(new Employee[]{employee1,employee2}, "Coco-cola","musa",2323);
        Company company2 = new Company(new Employee[]{employee1,employee2}, "Bugatti","musa",9923);

        Holding holding = new Holding(new Company[]{company1,company2});
        MainMenu.start(holding);
    }
}
