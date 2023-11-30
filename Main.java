// Базовый класс Animal
class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное издаёт звук");
    }

    public void eat() {
        System.out.println("Животное ест " + food);
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}

// Подклассы Dog, Cat, Horse
class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }

    public void guardHouse() {
        System.out.println("Собака охраняет дом");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мурчит");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест " + food);
    }

    public void climbTree() {
        System.out.println("Кот лазает по деревьям");
    }
}

class Horse extends Animal {
    private String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    public void gallop() {
        System.out.println("Лошадь галопирует");
    }
}

// Класс Ветеринар
class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Ветеринар обследует животное:");
        System.out.println("Еда: " + animal.food);
        System.out.println("Местоположение: " + animal.location);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов различных классов
        Dog dog = new Dog("Кость", "Дом", "Дворняга");
        Cat cat = new Cat("Рыба", "Квартира", "Рыжий");
        Horse horse = new Horse("Сено", "Стойло", "Арабская");

        // Создание объекта ветеринара
        Veterinarian vet = new Veterinarian();

        // Обработка каждого животного ветеринаром
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
    }
}
