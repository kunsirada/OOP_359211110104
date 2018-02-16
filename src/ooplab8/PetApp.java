package ooplab8;

public class PetApp {
    public static void main(String[] args) {

        Dog dog = new Dog("meow", 2);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.makeNoise();

        Pet dog2 = new Dog("owantin", 3);
        System.out.println(dog2.getName());
        dog2.makeNoise();





    }
}//class
