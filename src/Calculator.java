package src;

import java.util.Scanner;

public class Calculator {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    while (true) {
                              System.out.println("Enter two nummbers");
                              int a = sc.nextInt();
                              int b = sc.nextInt();
                              System.out.println("Please select an operator like + ,-,%,/,*");
                              char ch = sc.next().charAt(0);
                              if (ch == '*') {
                                        System.out.println(a * b);
                              } else if (ch == '+') {
                                        System.out.println(a + b);
                              } else if (ch == '-') {
                                        System.out.println(a - b);
                              } else if (ch == '/') {
                                        if (b != 0)
                                                  System.out.println(a / b);

                              } else if (ch == '%') {
                                        System.out.println(a % b);
                              } else if (ch == 'X' || ch == 'x') {
                                        break;
                              } else {
                                        System.out.println("Please select valid operator");
                              }

                    }
          }

}
