package src.Arrays;

import java.util.Arrays;

public class Q1 {
          public static void main(String[] args) {
                    // Q : store a roll number
                    int a = 139;

                    // Q store a person's name
                    String name = "Purna Chander";

                    // Q : store 5 roll numbers
                    int rno1 = 33;
                    int rno2 = 233;
                    int rno3 = 233;
                    int rno4 = 233;
                    int rno5 = 233;

                    /*
                     * for this we are declaring 5 ref variables for 5 values if we have 100 values
                     * we have to declare 100 times to overcome this problem we invented arrays
                     */

                    // syntax
                    // datatype[] variable_name = new datatype[size];

                    int[] num1 = new int[34];
                    // in the above we created int array having 0.... of 34 times

                    // we can also intialize like this it is creating of 3 size
                    int[] num2 = { 22, 33, 44 };

                    // we can't do like this it will make compile time error
                    // we only declare integers here
                    /*
                     * int[] nums = {3,4,"4"}
                     */

                    System.out.println(Arrays.toString(num2));
                    System.out.println(num2[1]);

          }
}
