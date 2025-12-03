package src;

import java.util.Arrays;

public class Test {
          public static void main(String[] args) {

                    add(2, 3, 4);
                    for (int i = 0; i < 20; i++) {
                              if (isPrime(i)) {
                                        System.out.println(i);
                              }

                    }
          }

          static void add(int a, int b) {
                    System.out.println(a + b);
          }

          static void add(int... v) {
                    System.out.println(Arrays.toString(v));
          }

          static boolean isPrime(int n) {
                    if (n < 2) {
                              return false;
                    }
                    int k = 2;
                    int count = 0;
                    while (k * k <= n) {
                              if (n % k == 0) {
                                        count++;
                              }
                              k++;
                    }
                    return count == 0;
          }
}