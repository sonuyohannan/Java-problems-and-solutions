//1. Write a Java program to get a number from the user and print whether it is positive or negative.


import java.util.Scanner;  // Import the Scanner class

class NegativeorPositive{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         
        if(sc.nextInt() > 0){
         System.out.print("The number is positive");
 
        }
        else{
            System.out.println("The number is negative");
        }
    }
}