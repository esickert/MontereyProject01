package SavitchPractice;

import java.util.Scanner;

public class Species {
    public String name = "tom";
    public int population;
    public double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the population of the new species: ");
        this.population = keyboard.nextInt();  //variable used inside class definition
        System.out.println("Enter growth rate " +
                          "(% increase per year):  ");
        this.growthRate = keyboard.nextDouble();
    }

    public void printOutput()   {
        System.out.println(this.name);
    }

}
