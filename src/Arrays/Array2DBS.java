package src.Arrays;

import java.util.Arrays;

public class Array2DBS {

          public static void main(String[] args) {

                    int[][] arr = { { 1, 2, 3 },
                                        { 4, 5, 6 },
                                        { 7, 8, 9 }
                    };

                    int target = 9;

                    int[] ans = bs(arr, target);
                    System.out.println(Arrays.toString(ans));

          }

          static int[] bs(int[][] arr, int target) {
                    int[] ans = { -1, -1 };

                    int rStart = 0;
                    int rEnd = arr.length - 1;
                    int colMid = arr.length / 2;
                    while (rStart < rEnd - 1) {
                              int rmid = (rStart + rEnd) / 2;

                              if (arr[rmid][colMid] == target) {
                                        return new int[] { rmid, colMid };
                              } else if (arr[rmid][colMid] > target) {
                                        rEnd = rmid;
                              } else {
                                        rStart = rmid;
                              }
                    }

                    if (arr[rStart][colMid] == target)
                              return new int[] { rStart, colMid };
                    if (arr[rEnd][colMid] == target)
                              return new int[] { rEnd, colMid };

                    int cols = arr[0].length;
                    if (target < arr[rStart][colMid]) {
                              int k = search(arr[rStart], target, 0, colMid - 1);
                              if (k != -1)
                                        return new int[] { rStart, k };
                    }

                    int k = search(arr[rStart], target, colMid, cols - 1);
                    if (k != -1)
                              return new int[] { rStart, k };

                    // Try rEnd row
                    if (target < arr[rEnd][colMid]) {
                              k = search(arr[rEnd], target, 0, colMid - 1);
                    } else {
                              k = search(arr[rEnd], target, colMid, cols - 1);
                    }
                    if (k != -1)
                              return new int[] { rEnd, k };

                    return ans; // Not found

          }

          static int search(int[] arr, int target, int start, int end) {
                    while (start <= end) {
                              int mid = start + (end - start) / 2;
                              if (arr[mid] == target) {
                                        return mid;
                              } else if (arr[mid] > target) {
                                        end = mid - 1;
                              } else {
                                        start = mid + 1;
                              }
                    }
                    return -1;
          }
}
