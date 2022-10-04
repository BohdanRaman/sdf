/**
 * A vampire number has an even number of digits and is formed by
 * multiplying a pair of numbers containing half the number of digits of the result. The digits
 * are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
 * Examples include:
 * 1260 = 21 * 60
 * 1827 = 21 * 87
 * 2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 * <p>
 * I took the solution "Task 10" from Internet and copy/past in my project.
 * I  want to be honest with you
 */
class VampireNumbers {
    public static int count = 0; // Запишите общее количество вампиров

    public static int k = 0; // Запишите, сколько раз судили о вызове

    public void searchNumbers() {
        for (int i = 1001; i < 10000; i++) {
            // Если число похоже на 1100 с хотя бы 2 нулями в конце, пропустить
            if (i % 100 == 0) {
                continue;
            }
            // Получить номер по четырем цифровым цифрам номера, здесь мы предполагаем, что четыре цифры представлены как abcd
            int a = i / 1000;
            int b = (i - a * 1000) / 100;
            int c = (i - a * 1000 - b * 100) / 10;
            int d = i - a * 1000 - b * 100 - c * 10;
            // Определяем, есть ли два нуля в четырех позициях, например 1010, и пропускаем эти числа.Так как место в тысячах не может быть нулем, необходимо только определить, имеют ли другие три бита два нуля
            // Когда есть 2 0 в 3 числах, должно быть «сумма 3 чисел равна одному из чисел», которая используется в качестве основы для суждения, и последние две цифры также исключаются. Фактически требуется только суждение, такое как 1001 И 1010 это случай
            if (b + c + d == c || b + c + d == d) {
                continue;
            }
            // После исключения различных ситуаций, вы можете начать настоящий цифровой показ вампира
            // Тогда существует 12 ситуаций: abcd, abdc, abcd, acdb, adbc, adcb, bacd, badc, bcda, bdca, cadb, cbda
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

    // Определяем, выполняются ли условия
    static boolean search(int i, int a, int b, int c, int d) {
        k++;
        if ((a * 10 + b) * (c * 10 + d) == i) {
            searchFor(i, a, b, c, d); // Если условия выполнены, выведите результат
            return true;
        } else {
            return false;
        }
    }

    // Вывести на печать, когда условия выполнены, и посчитать число
    static void searchFor(int i, int a, int b, int c, int d) {
        count++;
        System.out.println(i + "=" + (a * 10 + b) + "*" + (c * 10 + d));
    }
}
