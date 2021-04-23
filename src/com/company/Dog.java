package com.company;

public class Dog extends Animal {
    final int MaxRunLength = 500;
    final int MaxSwimLength = 10;
    public static int dogCount = 0;

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    public static void dogInfo() {
        System.out.println("Вы создали " + dogCount + " собак");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MaxSwimLength))
            System.out.println(name + " проплыл " + length);
        else System.out.println(name + " не может столько проплыть");
    }


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MaxRunLength))
            System.out.println(name + " пробежал " + length);
        else System.out.println(name + " не может столько пробежать ");
    }
}
