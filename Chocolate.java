/**
 * @class: Chocolate
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: January 26, 2023
 * description: This program shows how many chocolate bags we have to start with
 * then it multiplies it by 2 for the 2 chocolates bars in the bag to begin with
 * it comes out with a total of chocolate bars that is divided by 3 so that there are 3 bars of
 * chocolate in each bag now instead of 2.
 */
public class Chocolate {
    public static void main(String[] args){
        int bagOfChocolate = 9;
        int totalBars = bagOfChocolate * 2;
        int newBags = totalBars / 3;
        System.out.print("You will need " + newBags + " bags.");

    }
}
