package ru.sbrf.JavaSchool.lesson6HW.Inheritance;

public class Cat extends Animal{

    private final String animalType = "Кошка";
    private final String voice = "Мяу";
    private int catchMouseCount;

    public Cat(int speed, int foodType, boolean canClimb, boolean canSwim, int catchMouseCount) {
        super(speed, foodType, canClimb, canSwim);
        this.setAnimalType(animalType);
        this.setVoice(voice);
        this.catchMouseCount = catchMouseCount;
    }

    @Override
    public void move() {
        super.move();
        switch (catchMouseCount) {
            case 0:
                System.out.println("Я домашнее животное и не видела ни одной мыши");
                break;
            default:
                System.out.println("Кол-во мышей которое я поймала за свою жизнь: "+catchMouseCount);
        }
    }

    public int getCatchMouseCount() {
        return catchMouseCount;
    }

    public void setCatchMouseCount(int catchMouseCount) {
        this.catchMouseCount = catchMouseCount;
    }
}
