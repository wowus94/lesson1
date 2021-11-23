package lesson1;

public class Lesson01 {

    public static void main(String[] args) {
        byte byteVal = (byte) 40; //8-битное знаковое целое число от -128 до 127
        short shortVal = (short) 400; //16-битное знаковое целое число от -32768 до 32767
        int intVal = 40000; //32-битное знаковое целое числ от -2147483648 до 2147483647
        long longVal = 400000L; //64-битное знаковое целое числ от -9223372036854775808 до 9223372036854775807
        float floatVal = 40.40f; //32-битное знаковое число с плавающей запятой одинарной точности
        double doubleVal = -400.444; //64-битное знаковое число с плавающей запятой двойной точности

        char charVal1 = 'b'; //16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
        char charVal2 = 'a'; //от '\u0000' или 0 до '\uffff' или 65,535

        boolean booleanVal1 = false; //логический тип данных
        boolean booleanVal2 = true;

        greetings("Андрей");
    }

    public static float calculator(float a, float b, float c, float d) {
        return a * (b + (c / d));

    }

    public static boolean task10and20(int x1, int x2) {
        int s = x1 + x2;
        if (10 < s && s < 20) return true;
        else return false;
    }

    public static void isPositiveOrNegative(int g) {
        if (g >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int k) {
        if (k < 0) {
            return true;
        }
        return false;
    }

    public static void greetings(String name) {
        //greetings ("Андрей");
        System.out.println("Привет, " + name + "!");
    }
}


