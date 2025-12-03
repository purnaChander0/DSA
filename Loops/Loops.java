import java.util.Scanner;

public class Loops {
          public static void main(String[] args) {

                    System.out.println("Enter any number 'n' to Loop n times");
                    // here we are just creating object of scanner class that have constructor type
                    // so we are sending system class 'in ' variable of InputSteam Class

                    Scanner sc = new Scanner(System.in);

                    // here we are taking number from the console and storing in n variable
                    int n = sc.nextInt();

                    // this is forloop Here we are printing from 0 to n
                    // i++ means in each operation i is incremented to 1

                    /*
                     * i=0 means it only execute one time it is 0 for the starting and then it will
                     * increase if we update
                     */

                    /*
                     * i<=n means it will execute in each operation if condiion fails the loop will
                     * terminate if true the loop runs
                     */

                    /*
                     * System is a class in the out is a variable of type PrintStream class in tha
                     * printlin is a method
                     */

                    System.out.print("Using for loop: ");
                    for (int i = 0; i <= n; i++) {
                              System.out.print(i + " ");
                    }

                    System.out.println();
                    int i = 0;
                    System.out.print("Using While Loop: ");
                    while (i <= n) {
                              System.out.print(i++ + " ");
                    }

                    System.out.println();
                    /* the main difference while and do while it will runs atleast once */
                    i = 0;
                    System.out.print("Using Do While Loop : ");
                    do {
                              System.out.print(i++ + " ");
                    } while (i <= n);

                    // when we are opening any resources we have to close it
                    sc.close();
          }
}