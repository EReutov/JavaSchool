package ru.sbrf.JavaSchool.lesson6HW.Inheritance;

public class Dog extends Animal {

    private final String animalType = "Собака";
    private final String voice = "Гав-Гав";
    private String breed;
    private int knowCommand;

    public Dog(int speed, int foodType, boolean canClimb, boolean canSwim, String breed, int knowCommand) {
        super(speed, foodType, canClimb, canSwim);
        this.setAnimalType(animalType);
        this.setVoice(voice);
        this.breed = breed;
        this.knowCommand = knowCommand;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Моя порода "+ breed);
    }

    @Override
    public void move() {
        super.move();
        switch (knowCommand) {
            case 0:
                System.out.println("Я не очень умная собака и не знаю ни одной команды");
                break;
            default:
                System.out.println("А еще я знаю "+knowCommand+" команд");
        }
    }


    public String getBreed() {
        return breed;
    }

    public int getKnowCommand() {
        return knowCommand;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setKnowCommand(int knowCommand) {
        this.knowCommand = knowCommand;
    }
}
