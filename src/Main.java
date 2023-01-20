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
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();


    }

    private static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация цикла " + i);
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Интерация цикла " + i);
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println("Интерация цикла " + i);
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }
    }

    private static void task5() {
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
    }

    private static void task6() {
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Интерация цикла " + i);
        }
    }

    private static void task7() {
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Интерация цикла " + i);
        }
    }

    private static void task8() {
        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " равна.");
        }
    }

    private static void task9() {
        System.out.println("Задание 9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " равна.");
        }
    }

    private static void task10() {
        System.out.println("Задание 10");
        int two = 2;
        for (int i = 1; i < 10; i++) {
            System.out.println(two + "*" + i + "=" + two * i);
        }
    }


    private static void task11() {
        System.out.println("Задание 11");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_495_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i++ + " ,сумма накоплений равна " + total + " равна.");
        }
    }

    private static void task12() {
        System.out.println("Задание 12");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
            {
                System.out.println();
                for (int w = 10; w >= 1; w--) {
                    System.out.print(w + " ");
                }
                System.out.println();
            }
        }
    }

    private static void task13() {
        System.out.println("Задание 13");
        int population = 12_000_000;
        float birthCount = (float) 17 / 1000;
        float deathCount = (float) 8 / 1000;
        for (int i = 1; i <= 10; i++) {
            population = (int) (population + (population * birthCount) - (population * deathCount));
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    private static void task14() {
        System.out.println("Задание 14");
        int salary = 15_000;
        int total = salary;
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = total + total / 100 * 7;
            System.out.println("Месяц " + i + " сумма накоплений:" + total);
        }
        System.out.println("Василию потребуется " + i + " месяцев, чтобы накопить сумму " + total + " если к сумме его вклада добавляется еще 7% ежемесячно");
    }

    private static void task15() {
        System.out.println("Задание 15");
        int salary = 15_000;
        int total = salary;
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = total + total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений:" + total);
            }
        }
        System.out.println("Василию потребуется " + i + " месяцев, чтобы накопить сумму " + total + " если к сумме его вклада добавляется еще 7% ежемесячно");
    }

    private static void task16() {
        System.out.println("Задание 16");
        int salary = 15_000;
        int total = salary;
        for (int i = 1; i <= 108; i++) {
            total = total + total / 100 * 7;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений:" + total);
        }
    }

    private static void task17() {
        System.out.println("Задание 17");
        for (int day = 6; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет.");
        }
    }

    private static void task18() {
        System.out.println("Задание 18");
        int i = 1600; // год за 200 лет до текущего
        while (i < 1800) {
            i = i + 79;
            if (i % 79 == 0) ;
            System.out.println(i);
            }
    }

}




