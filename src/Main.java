public class Main {
    public static void main(String[] args) {

        int age = 4;
        if (age >=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил!");
        }

        {
            int age2 = 32;
            if (age2 >= 7 && age2 < 18) {
                System.out.println("Ребенок ходит в школу");

            }
            if (age2>= 18 && age2<24)
                System.out.println("Университетские годы");
            if (age2 >= 24) {
                System.out.println("Пора искать работу");
            }
        }
        int passengers = 100;
        if (passengers <=60){
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне остались только стоячие места");
        }
        if (passengers>102){
            System.out.println("В вагоне нет мест");
        }

        int age3 = 20;
        if (age3 >= 2 && age3 <= 10){
            System.out.println("Тебе нужно ходить в садик");
        } else if (age3 >= 7 && age3 <= 18) {
            System.out.println("Тебе нужно ходить в школу");
        } else if (age3 >= 18 && age3<= 24) {
            System.out.println("Тебе нужно ходить в университет");
        } else if (age3 >24) {
            System.out.println("Пора искать работу");
        }


        int age4 = 2;
        if (age4 < 5) {
            System.out.println("Пока совсем нельзя кататья на аттракционе");
        } else if (age4 > 5 && age4 <= 14) {
            System.out.println("Можно кататься только с родителями");
        } else if (age4 > 14) {
            System.out.println("Можно кататься одному!");
        }

        int one = 15;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }



    }}