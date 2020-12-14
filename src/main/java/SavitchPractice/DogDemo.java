package SavitchPractice;

public class DogDemo {

    public static void main(String[] erich) {
        Dog fido = new Dog();
        fido.name = "sam";
        fido.age = 12;
        fido.breed = "sheltie";
        fido.writeOutput();

        Dog lassie = new Dog();
        lassie.name = "bill";
        lassie.age = 23;
        lassie.breed = "collie";
        System.out.println(lassie.name + " is a " + lassie.breed + ".");
        System.out.println("he is "+ lassie.age + " years old or ");
        int humanYears = lassie.getAgeInHumanYears111111111111111111111111111111111111();
        System.out.println(humanYears + " in human years. ");
    }
}
