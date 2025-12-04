package src.BS;

public class RotatedBS {
          public static void main(String[] args) {
                    int[] arr = { 10, 12, 2, 4, 5, 7, 8, 9 };
                    int target = 7;
                    int ans = rotatedBS(arr, target);
                    System.out.println(ans);
          }

          static int rotatedBS(int[] arr, int target) {
                    int start = 0;
                    int end = arr.length - 1;
                    int ans = -1;
                    int pivot = findPivot(arr);
                    System.out.println(pivot);
                    if (arr[start] > target) {
                              ans = bs(arr, target, pivot + 1, end);
                    } else {
                              ans = bs(arr, target, start, pivot);
                    }
                    return ans;
          }

          static int bs(int[] arr, int target, int start, int end) {
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

          static int findPivot(int[] arr) {
                    int start = 0;
                    int end = arr.length - 1;
                    while (start <= end) { // Changed from start < end
                              int mid = start + (end - start) / 2;
                              if (mid + 1 < arr.length && arr[mid] > arr[mid + 1]) {
                                        return mid; // Return immediately when pivot found
                              }
                              if (arr[start] >= arr[mid]) { // Left side sorted
                                        end = mid - 1;
                              } else { // Right side sorted
                                        start = mid + 1;
                              }
                    }
                    return start; // Handles no rotation case
          }

}
