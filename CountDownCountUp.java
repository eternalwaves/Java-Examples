/**
 * Nested for loops example counts down from a specified number then counts back up.
 *
 * @author      Elizabeth Lynn Rakphongphairoj Kilrain
 * @version     1.1
 */
class CountDownCountUp
{
    public static void main (String[] args)
    {
        // can be any number
        int n = 7;
        // counts down from n
        for (int x = n; x > 0; x--) {
            // counts up to x
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
            // when x reaches 1
            if (x == 1) {
                // starts at 2 and counts up to n
                for (int a = 2; a <= n; a++) {
                    // counts up to a
                    for (int b = 1; b <= a; b++) {
                        System.out.print(b + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}