/**
 * @class: Cycle
 * @author: Kevin Vergara
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: January 26, 2023
 * description: This program computes the amount of tricycles the shop has
 * by subtracting the known amount of bicycles wheels from the total wheels
 * in the shop and grouping the remainder by 3s to find the amount of tricycles.
 */
public class Cycle {
    public static void main(String[] args){
        int totalBicycles = 10;
        int totalWheels = 47;
        int totalTricycles = (47 - totalBicycles * 2) /3;
        System.out.print("There are " + totalTricycles + " tricycles in the shop.");

    }
}
