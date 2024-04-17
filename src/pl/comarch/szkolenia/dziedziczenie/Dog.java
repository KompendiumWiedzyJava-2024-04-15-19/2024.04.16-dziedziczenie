package pl.comarch.szkolenia.dziedziczenie;

public class Dog extends Pet {

    public Dog() {
        super(12, "Reksio", "Kundel");
        System.out.println("Konstruktor dog !!!");
    }
    public void bark() {
        System.out.println("hau hau !!!");
    }
}
