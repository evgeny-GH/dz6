package com.company;

public abstract class Animal {
    public String name;
    public int run;
    public int swim;
    private final int MaxRunLength = 0;
    private final int MaxSwimLength = 0;

    abstract void swim(int length);

    abstract void run(int length);

    public static void animalCount() {
        int countCat = Cat.catCount+Dog.dogCount;

        System.out.println("Созданное количество животных: "+countCat);
    }


}
