package SavitchPractice;

import java.util.Scanner;

public class Species {
    public String name;
    public int population;
    public double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the population of the new species: ");
        population = keyboard.nextInt();
        System.out.println("Enter growth rate " +
                          "(% increase per year): ");
        growthRate = keyboard.nextDouble();
    }

}
