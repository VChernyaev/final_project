package final_project;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class laptop {
    int id;
    String trademark;
    String os;
    int ram;
    int price;

    public laptop(int id, String trademark, String os, int ram, int price) {
        this.id = id;
        this.trademark = trademark;
        this.os = os;
        this.ram = ram;
        this.price = price;
    }

    public String printLaptop() {
        return " Марка ноутбука: " + trademark + " Операционная система: " + os + " Оперативная память:" + ram
                + " Цена: "
                + price;
    }

    public List<laptop> findLaptop(HashSet<laptop> hashLaptop, String os) {
        List<laptop> laptopList = new ArrayList<laptop>();
        for (laptop laptop : hashLaptop) {
            if (laptop.os.equals(os)) {
                laptopList.add(laptop);
            }
        }
        return laptopList;
    }

    public List<laptop> findTrademark(HashSet<laptop> hashLaptop, String trademark) {
        List<laptop> TradeList = new ArrayList<laptop>();
        for (laptop laptop : hashLaptop) {
            if (laptop.trademark.equals(trademark)) {
                TradeList.add(laptop);
            }
        }
        return TradeList;
    }
}
