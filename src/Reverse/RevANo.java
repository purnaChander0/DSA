package src.Reverse;

public class RevANo {
          public static void main(String[] args) {

                    int num = 12345;

                    int ans = 0;
                    while (num > 0) {
                              int r = num % 10;
                              ans = ans * 10 + r;
                              num = num / 10;
                    }
                    System.out.println(ans);
          }
}