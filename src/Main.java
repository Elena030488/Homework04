public class Main {
    public static void main(String[] args) {
        //Задача 1.
        int age = 1;
        if (age >= 18) {
            System.out.println ("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println ("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача 2.
        int temp = -10;
        if (temp >= 5) {
            System.out.println ("На улице " + temp + " градусов, тепло, можно идти без шапки");
        } else {
            System.out.println ("На улице " + temp + " градусов, холодно, нужно надеть шапку");
        }
        //Задача 3.
        int speed = 40;
        if (speed <= 60) {
            System.out.println ("Если скорость " + speed + " км/ч,то превышения скорости нет, можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч,то скорость превышена, придется заплатить штраф");
        }
        //Задача 4.
        int age4 = 60;
        if (age4 < 2) {
            System.out.println ("Если возраст человека равен " + age4 + ", то ему пора спать");
        } else {
            if (age4 >= 2 && age4 < 7) {
                System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
            } else {
                if (age4 >= 7 && age4 < 18) {
                    System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
                } else {
                    if (age4 >= 18 && age4 < 24) {
                        System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
                    } else {
                        if (age4 >= 24 && age4 < 60) {
                            System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
                        } else {
                            System.out.println ("Если возраст человека равен " + age4 + ", то он может отдохнуть");
                        }}}}}
        //Задача 5.
        int age5 = 13;
        if (age5 < 5) {
            System.out.println ("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе");
        }
        if (age5 >= 5 && age5 < 14) {
            System.out.println ("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println ("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождении взрослого");
        }
        //Задача 6.
        int place = 105;
        if (place < 60) {
            System.out.println ("В вагоне есть сидячее место");
        } else {
            if (place >= 60 && place < 102) {
                System.out.println ("В вагоне есть стоячее место");
            } else {
                System.out.println("Вагон полностью забит");
            }}
        //Задача 7.
        int one = 8;
        int two = 40;
        int three = 2;
        if (one > two && one > three) {
            System.out.println ("Большим из трех чисел является one = " + one);
        } else {
            if (two > one && two > three) {
                System.out.println ("Большим из трех чисел является two =  " + two);
            } else {
                System.out.println ("Большим из трех чисел является three =  " + three);
            }}

    }
}
