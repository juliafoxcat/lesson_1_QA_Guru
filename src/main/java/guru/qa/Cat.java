package guru.qa;

public class Cat {
    String name;
    int age;
    boolean fur;
    boolean hunger;

    public Cat(String name, int age, boolean fur, boolean hunger) {
        this.name = name;
        this.age = age;
        this.fur = fur;
        this.hunger = hunger;
    }

    void hungryMeow() {
        if (hunger = true) {
            System.out.println("Meow, ".repeat(age - 1) + "Meow.");
        } else {
            System.out.println("Urrr");
        }
    }
}

