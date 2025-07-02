package generic.ex3;

import generic.Cat;
import generic.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1<Dog> dogHospital = new AnimalHospitalV1<>();
        AnimalHospitalV1<Cat> catHospital = new AnimalHospitalV1<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

        catHospital.set(cat);
        catHospital.checkup();


    }

}
