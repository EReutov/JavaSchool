package ru.sbrf.JavaSchool.lesson6HW.Inheritance;

public abstract class Animal {

    private String animalType;
    private String voice;
    private int speed;
    private int foodType;
    private boolean canClimb;
    private boolean canSwim;

    public Animal(int speed, int foodType, boolean canClimb, boolean canSwim) {
        this.speed = speed;
        this.foodType = foodType;
        this.canClimb = canClimb;
        this.canSwim = canSwim;
    }


    // Методы поведения -------------------------------------------------------------------

    public void speak() {
        System.out.println("Всем привет! Я "+animalType+" и я говорю: " + voice+"!");
    }

    public void move() {
        System.out.println("Моя средняя скорость бега "+speed+" км/ч.");
    }

    public void eat() {
        switch (foodType) {
            case 1:
                System.out.println("Я всеядное животное");
                break;
            case 2:
                System.out.println("Я хищное животное");
                break;
            case 3:
                System.out.println("Я травоядное животное");
                break;
        }
    }

    public void climb() {
        System.out.println("Я "+ (canClimb ? "умею" : "не умею")+" лазить по деревьям" );
    }

    public void swim() {
        System.out.println("Я "+ (canSwim ? "умею" : "не умею")+" плавать" );
    }

    public void introduce() {
        speak();
        move();
        eat();
        climb();
        swim();
        System.out.println();
    }

    // Далее Сеттеры и Геттеры ----------------------------------------

    public String getAnimalType() {
        return animalType;
    }

    public String getVoice() {
        return voice;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFoodType() {
        return foodType;
    }

    public boolean isCanClimb() {
        return canClimb;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFoodType(int foodType) {
        this.foodType = foodType;
    }

    public void setCanClimb(boolean canClimb) {
        this.canClimb = canClimb;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
}
