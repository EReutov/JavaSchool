package ru.sbrf.JavaSchool.lesson6HW.Aggregation;

public class MainA {

    public static void main(String[] args) {
        DogA dog = new DogA(12,1,false,true, 0);
        dog.introduce();

        CatA cat = new CatA(35,1,true,true, 5);
        cat.introduce();
    }
}
