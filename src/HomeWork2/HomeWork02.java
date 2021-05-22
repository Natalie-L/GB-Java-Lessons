package HomeWork2;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(sumInterval(10, 13));
        plusOrMinus(10);
        System.out.println(plusOrMinus2(3));
        neskolkoSlov("Несколько слов", 7);
        System.out.println(visokosGod(1999));
    }

    /* Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
     в пределах от 10 до 20 (включительно), если да – вернуть true,
     в противном случае – false.
     */
    public static boolean sumInterval(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }
    /* Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
public static void plusOrMinus(int a) {
    if (a >= 0) {
        System.out.println(a + " - Число положительное");
    } else {
        System.out.println(a + " - Число отрицательное");
    }
}
    /* Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     если число отрицательное, и вернуть false если положительное.
     */
public static boolean plusOrMinus2(int a) {
    return a <= 0;
}
    /* Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
     в консоль указанную строку, указанное количество раз
     */
public static void neskolkoSlov(String slova, int chislo) {
    for (int i = 0; i < chislo; i++ ) {
        System.out.println(slova);
    }
}
    /* Написать метод, который определяет, является ли год високосным, и возвращает boolean
    (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный
     */
    public static boolean visokosGod(int a) {
        if (a % 400 == 0)
            return true;
        else if (a % 100 == 0)
            return false;
        else return a % 2 == 0;
        }
    }
