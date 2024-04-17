package pl.comarch.szkolenia.dziedziczenie;

public class Snake extends Pet {
    int length;

    @Override
    public void walk() {
        super.walk();
        System.out.println("Pelzam !!");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "length=" + length +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
