package pl.comarch.szkolenia.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = " Imie";
        cat.race = "Brytyjski";
        cat.age = 10;

        cat.walk();

        Dog dog = new Dog();
        dog.walk();

        Snake snake = new Snake();
        snake.walk();

       String snakeJakoString = snake.toString();
        System.out.println(snakeJakoString);

        System.out.println(snake.toString());

        Dog dog1 = new Dog();
        Pet pet = new Pet();
        Pet pet2 = new Dog();
        //Dog dog2 = new Pet();

        Pet[] tab = new Pet[10];
        tab[0] = new Dog();
        tab[1] = new Cat();
        tab[2] = new Snake();

        if(pet2 instanceof Dog) {
            Dog dog3 = (Dog) pet2;
            dog3.bark();
        }

        int a = 5;
        double b = a;
        //Mammal m = (Mammal) dog3;

        Owczarek owczarek = new Owczarek();
    }
}
