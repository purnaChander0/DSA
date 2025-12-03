package src.ArmStringNum;

public class Q1 {
          public static void main(String[] args) {
                    System.out.println(findArm(153));
          }
          /*
           * a number which indiviudal positions ones tens ... place power with length of
           * digit makes the same digit then it is armstrong
           * ex: 153
           * the length of the no is 3
           * 1**3 +5**3 +3**3 is 1+125+ 27 =>153
           */

          static int findArm(int n) {
                    int ans = 0;
                    int len = findlen2(n);
                    while (n > 0) {
                              ans += (int) Math.pow(n % 10, len);
                              n = n / 10;
                    }
                    return ans;
          }

          static int findlen2(int n) {
                    if (n == 0)
                              return 1;
                    int ans = 0;
                    while (n > 0) {
                              ans++;
                              n = n / 10;
                    }
                    return ans;
          }

          // other approach
          static int findlen(int n) {
                    if (n == 0)
                              return 1;
                    int ans = 0;
                    ans = (int) Math.log10(n) + 1;
                    return ans;
          }
}
