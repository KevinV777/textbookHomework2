/**
 * @class: SpeedLight
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: January 26, 2023
 * description:This program calculates the distance of how far away a thunder strike was after 5 seconds have passed
 */
public class SpeedLight {
    public static void main(String[] args){
        int SPEED_OF_SOUND = 340;
        int timeElapsed = 5;
        int distance = SPEED_OF_SOUND * timeElapsed;
        System.out.println("Time Elapsed: " + timeElapsed + " seconds");
        System.out.println("Distance: " + distance + " meters");

    }
}
