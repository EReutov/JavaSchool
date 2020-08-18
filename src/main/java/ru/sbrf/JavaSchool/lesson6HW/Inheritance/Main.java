package ru.sbrf.JavaSchool.lesson6HW.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(12,1,false,true, "Овчарка",0);
        dog.introduce();

        Cat cat = new Cat(35,1,true,true, 5);
        cat.introduce();
    }
}
