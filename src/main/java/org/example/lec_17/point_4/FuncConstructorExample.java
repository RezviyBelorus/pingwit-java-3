package org.example.lec_17.point_4;

import java.util.function.BiFunction;

public class FuncConstructorExample {
    public static void main(String[] args) {
//        NetflixUser netflixUser = new NetflixUser();

//        FuncUser netflixUser = (name, age) -> new NetflixUser(name, age);
        FuncUser netflixUser = NetflixUser::new;

        NetflixUser egorka = netflixUser.supply("Egorka", 20);
        System.out.println(egorka);

        BiFunction<String, Integer, NetflixUser> biFunction = NetflixUser::new;
    }
}

interface FuncUser {
    NetflixUser supply(String name, Integer age);
}

record NetflixUser(String name, Integer age) {

    NetflixUser() {
        this("Default user name", 45);
    }

    NetflixUser(String name, Integer age) {
        System.out.println("Hello from 2 args constructor");
        this.name = name;
        this.age = age;
    }

}
