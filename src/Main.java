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
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int totalSum = 0;
        int month = 0;
        while (totalSum < 2_459_000) {
            totalSum += salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей");
        }

        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a + " ");
        }
        System.out.println("\n");
        for(int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17 * 1200;
        int mortality = 8 * 1200;
        int year = 1;
        while (year <= 10){
            System.out.println("Год "+ year + ", численность населения составляет " + population);
            population += birthRate - mortality;
            year++;
        }

        System.out.println("\n");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double contribution = 15000;
        double totalSum = 0;
        int month = 0;
        while (totalSum < 12_000_000) {
            totalSum = contribution + (contribution * 0.07);
            contribution = totalSum;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей");
        }

        System.out.println("\n");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double contribution = 15000;
        double totalSum = 0;
        int month = 0;
        while (totalSum < 12_000_000) {
            totalSum = contribution + (contribution * 0.07);
            contribution = totalSum;
            month++;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей");
            }
        }

        System.out.println("\n");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        double contribution = 15000;
        double totalSum = 0;
        int month = 0;
        while (month < 108) {
            totalSum = contribution + (contribution * 0.07);
            contribution = totalSum;
            month++;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей");
            }
        }

        System.out.println("\n");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int  friday = 4;
        while (friday < 30){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("\n");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int date = 2023;
        int a = date - 200;
        int b = date + 100;
        while (a < b){
            if(a % 79 == 0){
                System.out.println(a);
            }
            a++;
        }

        System.out.println("\n");
    }

}