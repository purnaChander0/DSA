package src.MountainArr;

public class Q1 {

          public static void main(String[] args) {

                    int[] arr = { 1, 2, 4, 5, 3, 1 };
                    int target = 3;

                    int ans = findEle(arr, target);
                    System.out.println(ans);
          }

          static int findEle(int[] arr, int target) {
                    int ans = -1;
                    int peakedIndex = findPeak(arr);
                    ans = bs(0, peakedIndex, arr, target, true);
                    if (ans == -1) {
                              ans = bs(peakedIndex + 1, arr.length - 1, arr, target, false);
                    }
                    return ans;
          }

          static int findPeak(int[] arr) {
                    int start = 0;
                    int end = arr.length - 1;

                    while (start < end) {
                              int mid = start + (end - start) / 2;
                              if (arr[mid] > arr[mid + 1]) {
                                        end = mid;
                              } else {
                                        start = mid + 1;
                              }
                    }
                    return start;
          }

          static int bs(int start, int end, int[] arr, int target, boolean isAsc) {

                    while (start <= end) {
                              int mid = start + (end - start) / 2;
                              if (arr[mid] == target) {
                                        return mid;
                              } else if (arr[mid] < target) {
                                        if (isAsc) {
                                                  start = mid + 1;
                                        } else {
                                                  end = mid - 1;
                                        }

                              } else {
                                        if (isAsc) {
                                                  end = mid - 1;
                                        } else {
                                                  start = mid + 1;
                                        }
                              }
                    }

                    return -1;
          }

}
