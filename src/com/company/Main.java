package com.company;

public class Main {

    public static void main(String[] args) {
        //1. Создать классы Собака и Кот с наследованием от класса Животное.
        //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        //4. * Добавить подсчет созданных котов, собак и животных.
        //test

        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("Борзый");
        Cat cat2 = new Cat("Фифрик");

        Cat.catInfo();

        Dog dog = new Dog("Bobik");
        Dog dog1 = new Dog("Warik");
        Dog dog2  =  new Dog("Лейси");

        Dog.dogInfo();

        cat1.run(150);
        cat.run(201);
        cat1.swim(100);
        cat2.run(2);

        dog.run(100);
        dog.swim(10);
        dog1.run(600);
        dog1.swim(20);
        dog2.run(124);

        Animal.animalCount();
    }
}
