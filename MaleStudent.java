/**
 * @class: MaleStudent
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: January 26, 2023
 * description: This program computes how many male students there are
 * by subtracting the known total students from the known female students.
 */
public class MaleStudent {
    public static void main(String[] args){
        int totalStudents = 389;
        int totalFemaleStudents = 175;
        int totalMaleStudents = totalStudents - totalFemaleStudents;
        System.out.print("There are " + totalMaleStudents + " male students.");

    }
}
