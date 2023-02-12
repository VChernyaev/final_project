package final_project;

import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class final_project {
    public static void main(String[] args) {
        ArrayDeque<String> myLinkedList = new ArrayDeque<String>();
        System.out.println("");
        System.out.println(
                "Введите критерий отбора: \n1 - Название марки\n2 - Название операционной системы\n3 - Оперативная память\n4 - Стоимомть \n5 - Вывести на экран весь каталог");
        System.out.println("");
        Scanner iScanner = new Scanner(System.in, "cp866");
        int userInput = iScanner.nextInt();
        HashSet<laptop> laptopSet = new HashSet<laptop>();

        laptop lap_1 = new laptop(101, "Asus", "Linux", 1024, 40000);
        laptop lap_2 = new laptop(102, "Honor", "Windows", 512, 30000);
        laptop lap_3 = new laptop(103, "Apple", "Mac", 1024, 10000);
        // System.out.println(lap_2.printLaptop());

        laptopSet.add(lap_1);
        laptopSet.add(lap_2);
        laptopSet.add(lap_3);

        switch (userInput) {
            case 1:
                System.out.println("Введите марку: ");
                String trademarkInput = iScanner.next();
                List<laptop> queryLaptop = lap_3.findTrademark(laptopSet, trademarkInput);
                for (laptop laptop : queryLaptop) {
                    System.out.println(laptop.printLaptop());
                }
                break;
            case 2:
                System.out.println("Введите операционную систему: ");
                String osInput = iScanner.next();
                List<laptop> queryTrademark = lap_3.findLaptop(laptopSet, osInput);
                for (laptop laptop : queryTrademark) {
                    System.out.println(laptop.printLaptop());
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("В наличии: ");
                System.out.println(lap_1.printLaptop());
                System.out.println(lap_2.printLaptop());
                System.out.println(lap_3.printLaptop());
                break;
            default:
                System.out.println("Введите число от 1 до 5. ");
        }
        iScanner.close();
    }

}
