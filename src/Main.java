public class Main {
    public static void main(String[] args) {
        //Задача 1.
        int age = 19;
        if (age >= 18) {
            System.out.println ("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println ("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача 2.
        int temp = 5;
        if (temp > 5) {
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
        if (age4 >= 2 && age4 < 7) {
                System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
            } else if (age4 >= 7 && age4 < 18) {
                    System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
                } else if (age4 >= 18 && age4 < 24) {
                        System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
                    } else {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }
        //Задача 5.
        int age5 = 17;
        if (age5 < 5) {
            System.out.println ("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе");
        }
        if (age5 >= 5 && age5 < 14) {
            System.out.println ("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println ("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождении взрослого");
        }
        //Задача 6.
        int seatPlace = 40;
        int standPlace = 12;
        int freeSeatPlace = 60-seatPlace;
        int freeStandPlace = 42-standPlace;
        if (seatPlace == 60) {
            if (standPlace == 42) {
                System.out.println("В вагоне нет свободных мест");
            } else {
                System.out.println("В вагоне есть " + freeStandPlace + " стоячих мест");
            }
        } else if (standPlace == 42) {
                System.out.println("В вагоне есть " + freeSeatPlace + " сидячих мест");
            } else {
                    System.out.println("В вагоне есть " + freeSeatPlace + " сидячих мест и " + freeStandPlace + " стоячих мест");
                }
        //Задача 7.
        int one = 4;
        int two = 40;
        int three = 40;
        if (one == two && one == three) {
            System.out.println("Все числа равны " + one);
        } else if (one >= two && one >= three) {
            if (one == two) {
                System.out.println("Первое число равно второму, наибольшие и равны " + one);
            } else if (one == three) {
                System.out.println("Первое число равно третьему, наибольшие и равны " + one);
            } else {
                System.out.println("Первое число наибольшее и равно " + one);
            }
        } else if (two >= three) {
            if (two == three) {
                System.out.println("Второе число равно третьему, наибольшие и равны " + two);
            } else {
                System.out.println("Второе число наибольшее и равно " + two);
            }
        } else {
            System.out.println("Третье число наибольшее и равно " + three);
        }
    }
}
