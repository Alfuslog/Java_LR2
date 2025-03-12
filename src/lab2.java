import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.io.IOException;
import java.net.URISyntaxException;
import java.awt.Desktop;
import java.net.URI;

public class lab2 {
    public static int zad6(int code, int line, int column){
        Boolean fstLine = true;

        for (int i=0; i<line; i++){
//            if(fstLine){
//
//            }
            for (int j=0; j<column; j++){
                System.out.print((char) code + " ");
                //System.out.print(Integer.toHexString(code)+ " ");
                code++;
            }
            System.out.print("\n");

//            System.out.print(Integer.toHexString(code)+ " ");

        }
        System.out.print("\n");
        return 0;
    }

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
                    task6();
                    break;
                }
                case (7): {
                    task7();
                    break;
                }
                case (8): {
                    task8();
                    break;
                }
                case (9): {
                    task9();
                    break;
                }
                case (10):{
                    task10();
                    break;
                }
                default: {System.out.println("Введено некорректное значение!");}
            }
        }
        in.close();
    }
//idexof  //substring
//    static int CntIndexOf(){
//        String stroka = "Priveteke";
//        String podstroka = "e";
//        int cntIndx = 0;
//        String[] strokaArray = stroka.length();
//        for (String s: stroka){
//
//        }
//        return cntIndx;
//    }

    static void task1(){
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
    static void task3(){
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
        System.out.println("Введите координаты Y2:..");
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
        Integer chislo;
        chislo = in.nextInt();
        //String convert;

        System.out.println("\n16-я система счисления: "+ Integer.toHexString(chislo) + "\n");

        System.out.println("\n8-я система счисления: " + Integer.toOctalString(chislo) + "\n");

        System.out.println("\n2-я система счисления: " + Integer.toBinaryString(chislo) + "\n");
    }
    static void task6(){
        zad6(0x0400, 16, 16);

        zad6(0x20a0, 2, 16);
    }
    static void task7(){
        Scanner in = new Scanner(System.in);
        String Stroka = in.nextLine();

        int cntWords = 0, cntLower = 0, cntHigher = 0, cntNumbers = 0, cntArabNumbers = 0, cntNotArabNumbers = 0, cntOtherSymbols = 0;
        int StrokaLength = Stroka.length();
        for (int i = 0; i < Stroka.length(); i++){
            if (Stroka.contains("qwertyuiopasdfghjklzxcvbnmйцукенгшщзхъфывапролджэячсмитьбюQWERTYUIOPASDFGHJKLZXCVBNMЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ")){cntWords++;}
            if (Stroka.contains("qwertyuiopasdfghjklzxcvbnmйцукенгшщзхъфывапролджэячсмитьбю")) {cntLower++;}
            if (Stroka.contains("QWERTYUIOPASDFGHJKLZXCVBNMЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ")) {cntHigher++;}
            if (Stroka.contains("123467890МVIX")){cntNumbers++;}
            if (Stroka.contains("123467890")){cntArabNumbers++;}
            if (Stroka.contains("МVIX")){cntNotArabNumbers++;}
            else {cntOtherSymbols++;}
        }
    }
    static void task8(){
        try{
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("https://javarush.com/groups/posts/2890-metod-indexof-klassa-string-zachem-on-nuzhen-i-kak-rabotaet"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        //System.exit(0);
    }
    static void task9(){


        System.out.println("\n"+CntIndexOf());
    }
    static void task10(){
        String stroka = "abcd";
        for (int i=0; i<stroka.length(); i++){
            System.out.println("\""+stroka.substring(i)+stroka.substring(0, i)+"\"");
        }

    }
}