package org.example.lec_15.practice.task_7;

import java.util.HashSet;
import java.util.Set;

public class ShopMain {
    public static void main(String[] args) {
        Set<Shop> shops = new HashSet<>();
        Shop singleShop = new Shop(1);
        shops.add(singleShop);
        shops.add(singleShop);
        shops.add(singleShop);
        shops.add(new Shop(1));
        shops.add(new Shop(1));
        shops.add(new Shop(2));

        for (Shop shop : shops) {
            System.out.println(shop);
        }
    }
}
