package levelp.androidapp;

/**
 * Вычисления
 */
public class Calc {
    static String sum(String arg1, String arg2) {
        if (arg1.length() == 0)
            return "Введите первое число";
        if (arg2.length() == 0)
            return "Введите второе число";
        long a, b;
        try {
            a = Long.valueOf(arg1);
        } catch (NumberFormatException ex) {
            return arg1 + " - не число";
        }
        try {
            b = Long.valueOf(arg2);
        } catch (NumberFormatException ex) {
            return arg2 + " - не число";
        }
        return Long.toString(a + b);
    }
}
