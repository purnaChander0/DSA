package src.Recursion;

public class NQueens {
          public static void main(String[] args) {
                    int n = 4;
                    boolean[][] arr = new boolean[n][n];
                    System.out.println(SolveNQueens(0, arr));
          }

          public static int SolveNQueens(int row, boolean[][] arr) {
                    if (row == arr.length) {
                              display(arr);
                              return 1;
                    }

                    int count = 0;

                    for (int col = 0; col < arr.length; col++) {
                              if (isSafe(arr, row, col)) {
                                        arr[row][col] = true;
                                        count += SolveNQueens(row + 1, arr);
                                        arr[row][col] = false;
                              }
                    }

                    return count;
          }

          public static boolean isSafe(boolean[][] arr, int row, int col) {
                    // checking the present row
                    for (int i = 0; i < arr[row].length; i++) {
                              if (arr[row][i]) {
                                        return false;
                              }
                    }

                    // checking the present column
                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i][col]) {
                                        return false;
                              }
                    }

                    // checking left side
                    int minL = Math.min(row, col);
                    for (int i = 0; i <= minL; i++) {
                              if (arr[row - i][col - i]) {
                                        return false;
                              }
                    }

                    // checking right side
                    int minR = Math.min(row, arr.length - col - 1);
                    for (int i = 0; i <= minR; i++) {
                              if (arr[row - i][col + i]) {
                                        return false;
                              }
                    }
                    return true;
          }

          public static void display(boolean[][] arr) {
                    for (boolean b[] : arr) {
                              for (boolean e : b) {
                                        if (e) {
                                                  System.out.print("Q ");
                                        } else {
                                                  System.out.print("X ");
                                        }
                              }
                              System.out.println();
                    }

                    System.out.println();
          }
}
