package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Cat cat = new Cat(12);
        System.out.println(cat.getAge());

        Cat noCat = new Cat();
        noCat.setAge(15);
        System.out.println(noCat.getAge());

    }
}
