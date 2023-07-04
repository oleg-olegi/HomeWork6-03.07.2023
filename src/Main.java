public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "\s");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + "\s");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\s");
            }
        }

    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + "\s");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + "\s");
            if (i == 98) {
                System.out.print("\n");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + "\s");
        }
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        int cash = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += cash;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int cash = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            int totalWithPenny = total / 100;
            total = total + cash + totalWithPenny;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task10() {
        System.out.println("Задача 10");
        int num = 2;
        int result = 0;
        for (int i = 1; i <= 10; i ++) {
            result=num*i;
            System.out.print(num+"*"+i+"="+result + "\s");
        }
    }
}