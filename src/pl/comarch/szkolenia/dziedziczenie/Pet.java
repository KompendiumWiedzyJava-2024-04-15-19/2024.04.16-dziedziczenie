package pl.comarch.szkolenia.dziedziczenie;

public class Pet {
    int age;
    String name;
    String race;

    public Pet() {
        System.out.println("Konstruktor pet !!!");
    }

    public Pet(int age, String name, String race) {
        this(age, name);
        this.race = race;
    }

    public Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void walk() {
        System.out.println("Ide na czterech lapach !!");
    }
}
