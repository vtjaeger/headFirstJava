public class DogTestDrive {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.size = 40;
        dog.breed = "Vira lata";
        dog.name = "Luna";
        dog.bark();
    }
}

class Dog{
    // variaveis de instancia
    int size;
    String breed;
    String name;

    // metodos
    void bark(){
        System.out.println("Au Au!");
    }
}
