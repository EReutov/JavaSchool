package ru.sbrf.JavaSchool.lesson6HW.Aggregation;

public class CatA implements eat, move, speak, swim, climb {

    private AnimalA animalA;
    private int catchMouseCount;

    public CatA(int speed, int foodType, boolean canClimb, boolean canSwim, int knowCommand) {
        this.animalA = new AnimalA();
        animalA.setAnimalType("Кошка");
        animalA.setVoice("Мяу");
        animalA.setSpeed(speed);
        animalA.setFoodType(foodType);
        animalA.setCanClimb(canClimb);
        animalA.setCanSwim(canSwim);
        this.catchMouseCount = knowCommand;
    }


    public void climb() {
        System.out.println("Я "+ (animalA.isCanClimb() ? "умею" : "не умею")+" лазить по деревьям" );
    }

    public void eat() {
        switch (animalA.getFoodType()) {
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

    public void move() {
        System.out.println("Моя средняя скорость бега "+animalA.getSpeed() +" км/ч.");
        switch (catchMouseCount) {
            case 0:
                System.out.println("Я домашнее животное и не видел ни одной мыши");
                break;
            default:
                System.out.println("Кол-во мышей которое я поймала за свою жизнь: "+catchMouseCount);
        }
    }

    public void speak() {
        System.out.println("Всем привет! Я "+animalA.getAnimalType()+" и я говорю: " + animalA.getVoice()+"!");
    }

    public void introduce() {
        speak();
        move();
        eat();
        climb();
        swim();
        System.out.println();
    }

    public void swim() {
        System.out.println("Я "+ (animalA.isCanSwim() ? "умею" : "не умею")+" плавать" );
    }

    public AnimalA getAnimalA() {
        return animalA;
    }

    public void setAnimalA(AnimalA animalA) {
        this.animalA = animalA;
    }

    public int getCatchMouseCount() {
        return catchMouseCount;
    }

    public void setCatchMouseCount(int catchMouseCount) {
        this.catchMouseCount = catchMouseCount;
    }
}
