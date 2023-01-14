public class Main {
    public static void main(String[] args){
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

    private static void task1() {
    System.out.println("Задание 1");
    for(int i = 1; i<=10; i++){
    System.out.println("Интерация цикла " + i);}
    }
    private static void task2() {
    System.out.println("Задание 2");
    for(int i = 10; i >= 1; i--){
    System.out.println("Интерация цикла " + i);}
    }

    private static void task3() {
    System.out.println("Задание 3");
    for(int i = 2; i <= 17; i = i+2){
    System.out.println("Интерация цикла " + i);}
    }

    private static void task4() {
    System.out.println("Задание 4");
    for(int i = 10; i >= -10; i--){
    System.out.println("Интерация цикла " + i);}
    }
    private static void task5() {
    System.out.println("Задание 5");
    for(int i = 1904; i <= 2096; i = i+4){
    System.out.println(i + " год является високосным.");}
    }
    private static void task6() {
    System.out.println("Задание 6");
    for(int i = 7; i <= 98; i = i+7){
    System.out.println("Интерация цикла " + i);}
    }
    private static void task7() {
    System.out.println("Задание 7");
    for(int i = 1; i <= 512; i = i*2){
    System.out.println("Интерация цикла " + i);}
    }
    private static void task8() {
    System.out.println("Задание 8");
    int salary = 29000;
    int total = 0;
    for(int i = 1; i <= 12; i++){
    total = total + salary;
    System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " равна.");}
    }
    private static void task9() {
    System.out.println("Задание 9");
    int salary = 29000;
    int total = 0;
    for(int i = 1; i <= 12; i++){
    total = total+total/100;
    total = total + salary;
    System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " равна.");}
    }
    private static void task10() {
    System.out.println("Задание 10");
    int two = 2;
    for(int i = 1; i < 10; i++){
    System.out.println(two + "*" + i + "=" + two*i);}
    }
}





