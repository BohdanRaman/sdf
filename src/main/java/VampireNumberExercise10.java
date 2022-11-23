/**
 * A vampire number has an even number of digits and is formed by
 * multiplying a pair of numbers containing half the number of digits of the result. The digits
 * are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
 * Examples include:
 * 1260 = 21 * 60
 * 1827 = 21 * 87
 * 2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 */
class VampireNumbers {
    public static int count = 0; // Written count vampires.

    public static int k = 0; // Written count colling

    public void searchNumbers() {
        for (int i = 1001; i < 10000; i++) {
            if (i % 100 == 0) {
                continue;
            }

            int a = i / 1000;
            int b = (i - a * 1000) / 100;
            int c = (i - a * 1000 - b * 100) / 10;
            int d = i - a * 1000 - b * 100 - c * 10;
            if (b + c + d == c || b + c + d == d) {
                continue;
            }
            if (search(i, a, b, c, d)) {
            } else if (search(i, a, b, d, c)) {
            } else if (search(i, a, c, b, d)) {
            } else if (search(i, a, c, d, b)) {
            } else if (search(i, a, d, b, c)) {
            } else if (search(i, a, d, c, b)) {
            } else if (search(i, b, a, c, d)) {
            } else if (search(i, b, a, d, c)) {
            } else if (search(i, b, c, d, a)) {
            } else if (search(i, b, d, c, a)) {
            } else if (search(i, c, a, d, b)) {
            } else if (search(i, c, b, d, a)) {
            }
        }
    }

    static boolean search(int i, int a, int b, int c, int d) {
        k++;
        if ((a * 10 + b) * (c * 10 + d) == i) {
            searchFor(i, a, b, c, d);
            return true;
        } else {
            return false;
        }
    }

    static void searchFor(int i, int a, int b, int c, int d) {
        count++;
        System.out.println(i + "=" + (a * 10 + b) + "*" + (c * 10 + d));
    }
}
