import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {

        System.out.println("Cfare doni te pororisni: pizza apo cake?");
        Scanner sc = new Scanner(System.in);

        //Krijojme nje objekt nga klasa Foodfactory per te kapur metodat qe jane ne te

        switch (sc.nextLine()) {
            case "pizza":
                new Pizza().getType();
            case "cake":
                new Cake().getType();
            default:
        }

        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());

        System.out.println("Unsuccessful Termination!!");

    }

}
