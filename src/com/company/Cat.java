package com.company;

public class Cat extends Animal {
    final int  MaxRunLength=200;
   public static int catCount = 0;

    public Cat(String name) {
        this.name = name;
       catCount++;

    }

   public static void catInfo() {
        System.out.println("Вы создали "+ catCount+" котов");
    }

    @Override
    void  swim(int length) {
        System.out.println(name+"  не плавает! Коты жидость");
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MaxRunLength))
            System.out.println(name+" пробежал " +length);
        else System.out.println(name+" не может столько пробежать!");
    }
}
