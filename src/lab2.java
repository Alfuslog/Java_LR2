import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean rabota = true;

        while (rabota) {
            System.out.println("\n\n\nВведите номер задания:");
//            if (Exception e){
//                System.out.println("Неверный Ввод");
//            }
            int zadan = in.nextInt();
            switch (zadan) {
                case (0): {
                    System.out.println("\n\nПрограмма завершена!\nСпасибо за использование!!");
                    rabota = false;
                    break;
                }
                case (1): {
                    task1();
                    break;
                }
                case (2): {
                    task2();
                    break;
                }
                case (3): {
                    task3();
                    break;
                }
                case (4): {
                    task4();
                    break;
                }
                case (5): {
                    task5();
                    break;
                }
                case (6): {
                    break;
                }
                case (7): {
                    break;
                }
                default: {System.out.println("Введено некорректное значение!");}
            }
        }
        in.close();
    }


    static 	void task1(){
        System.out.println("\n  Задание 1\n  Вывод максимальных и минимальных значений для каждого объектного типа данных:");
        System.out.println("\n\tТип данных\t|\tМаксимальное значение\t|\tМинимальное значение");
        System.out.println("\tByte\t\t|\t"+Byte.MAX_VALUE+"\t\t\t\t\t\t|\t"+Byte.MIN_VALUE);
        System.out.println("\tShort\t\t|\t"+Short.MAX_VALUE+"\t\t\t\t\t|\t"+Short.MIN_VALUE);
        System.out.println("\tInteger\t\t|\t"+Integer.MAX_VALUE+"\t\t\t\t|\t"+Integer.MIN_VALUE);
        System.out.println("\tInteger\t\t|\t"+Integer.MAX_VALUE+"\t\t\t\t|\t"+Integer.MIN_VALUE);
        System.out.println("\tFloat\t\t|\t"+Float.MAX_VALUE+"\t\t\t|\t"+Float.MIN_VALUE);
        System.out.println("\tDouble\t\t|\t"+Double.MAX_VALUE+"\t|\t"+Double.MIN_VALUE+"\n\n");
    }

    static void task2(){
        System.out.println("\n  Задание 2\n  ");

        int[] a = {-5, -4, -90, 1, -15};
        int mul = 1; // Инициализация переменной mul
        boolean hasNegative = false; // Флаг для проверки наличия отрицательных чисел

        for (int i : a) {
            if (i < 0) {
                mul *= i;
                hasNegative = true; // Устанавливаем флаг, если найдено отрицательное число
            }
            System.out.println(i);
        }

        if (hasNegative) {
            double skuirt = (Math.floor(Math.sqrt(mul)*100)/100);
            System.out.println("\nКвадратный корень из произведения отрицательных чисел ~ " + skuirt);
        } else {
            System.out.println("В массиве нет отрицательных чисел.");
        }
    }

    static void task3 (){
        System.out.println("\n  Задание 3\n  ");

        double r[] = {0, 10};
        double R[] = {4, 2};
        double distance = 5;

        double distRr = Math.floor(1000*Math.sqrt(Math.pow(Math.abs(r[0]-R[0]),2)+Math.pow(Math.abs(r[1]-R[1]),2)))/1000;

        System.out.println("Дистанция равна ~ "+ distRr);

        if (distRr > distance){
            System.out.println("\nНе обнаружен\n");
        }
        else{
            System.out.println("\nПеремога!\n");
        }
    }
    static void task4(){
        System.out.println("\n  Задание 4\n  ");


        Scanner in = new Scanner(System.in);
        Double[] R = new Double[2];
        Double[] r = new Double[2];
        double distance = 5;

        System.out.println("Введите координаты X1:..");
        r[0] = in.nextDouble();
        System.out.println("Введите координаты X2:..");
        r[1] = in.nextDouble();
        System.out.println("Введите координаты Y1:..");
        R[0] = in.nextDouble();
        System.out.println("Введите координаты X2:..");
        R[1] = in.nextDouble();


        double distRr = Math.floor(1000*Math.sqrt(Math.pow(Math.abs(r[0]-R[0]),2)+Math.pow(Math.abs(r[1]-R[1]),2)))/1000;

        System.out.println("\nДистанция равна ~ "+ distRr+"\n");

        if (distRr > distance){
            System.out.println("\nНе обнаружен\n");
        }
        else{
            System.out.println("\nПеремога!\n");
        }
    }
    static void task5(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите целое десятичное число:");
        //int chislo = in.nextint();

        System.out.println();

    }
}