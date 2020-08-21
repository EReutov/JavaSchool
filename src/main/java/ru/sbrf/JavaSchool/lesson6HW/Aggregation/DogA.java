package ru.sbrf.JavaSchool.lesson6HW.Aggregation;

public class DogA implements eat, move, speak, swim, climb {

    private AnimalA animalA;
    private int knowCommand;

    public DogA(int speed, int foodType, boolean canClimb, boolean canSwim, int knowCommand) {
        this.animalA = new AnimalA();
        animalA.setAnimalType("Собака");
        animalA.setVoice("Гав-Гав");
        animalA.setSpeed(speed);
        animalA.setFoodType(foodType);
        animalA.setCanClimb(canClimb);
        animalA.setCanSwim(canSwim);
        this.knowCommand = knowCommand;
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
        switch (knowCommand) {
            case 0:
                System.out.println("Я не очень умная собака и не знаю ни одной команды");
                break;
            default:
                System.out.println("А еще я знаю "+knowCommand+" команд");
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

    public int getKnowCommand() {
        return knowCommand;
    }

    public void setKnowCommand(int knowCommand) {
        this.knowCommand = knowCommand;
    }
}
