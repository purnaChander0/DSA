package src.Conditions;

import java.util.Scanner;

public class AllConditions {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    /*
                     * System.out.println("Enter your age To Vote: ");
                     * int n = sc.nextInt();
                     * 
                     * if (n > 18) {
                     * System.out.println("Vote Successfully");
                     * } else {
                     * System.out.println("You are not elgible to vote :Please  come '" + (18 - n)
                     * + "' years later");
                     * 
                     * }
                     */

                    /*
                     * if else if is
                     * if one condtion satisfy then it will won't go to next condition
                     * if(condion1)
                     * {
                     * }else(condition2)
                     * {
                     * 
                     * }else
                     * {
                     * this prints if any of the above contions will not satisfy
                     * }
                     * 
                     * 
                     * 
                     */

                    System.out.println("Enter a day in 1 to 7 => I will print what's the  day it is ");

                    int day = sc.nextInt();

                    switch (day) {
                              case 1:
                                        System.out.println("It is Sunday");
                                        break;
                              case 2:
                                        System.out.println("It is Monday");
                                        break;
                              case 3:
                                        System.out.println("It is Tuesday");
                                        break;
                              case 4:
                                        System.out.println("It is Wednesday");
                                        break;
                              case 5:
                                        System.out.println("It is Thursday");
                                        break;
                              case 6:
                                        System.out.println("It is Friday");
                                        break;
                              case 7:
                                        System.out.println("It is Saturday");
                                        break;
                              default:
                                        System.out.println("Please Enter Valid No");

                    }
                    sc.close();
          }
}
