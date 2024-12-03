public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5.5f;
        double f = 6.5;

        System.out.println("Значение переменной \"a\" с типом \"byte\" равно " + a);
        System.out.println("Значение переменной \"b\" с типом \"short\" равно " + b);
        System.out.println("Значение переменной \"c\" с типом \"int\" равно " + c);
        System.out.println("Значение переменной \"d\" с типом \"long\" равно " + d);
        System.out.println("Значение переменной \"e\" с типом \"float\" равно " + e);
        System.out.println("Значение переменной \"f\" с типом \"double\" равно " + f);

        // Задание 2
        float a1 = 27.12f;
        long b1 = 987_678_965_549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g = 67;

        System.out.println();
        // Задание 3
        byte studentLP = 23;
        byte studentAS = 27;
        byte studentEA = 30;

        short paper = 480;

        int res = paper / (studentLP + studentAS + studentEA);

        System.out.println("На каждого ученика рассчитано " + res + " листов бумаги");

        System.out.println();
        // Задание 4
        byte bottles = 16 / 2; // 8 бутылок в минуту

        System.out.println("За 20 минут машина произвела " + (bottles * 20) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (bottles * 1440) + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + (bottles * 1440 * 3) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (bottles * 1440 * 31) + " штук бутылок");

        System.out.println();
        // Задание 5
        byte total = 120;
        byte white = 2;
        byte brown = 4;
        int classes = total / (white + brown);

        System.out.println("В школе, где " + classes + " классов, нужно " + (classes * white) + " банок белой краски и " + (classes * brown) + " банок коричневой краски");

        System.out.println();
        // Задание 6
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 50;
        byte egg = 70;

        byte totalBanana = 5;
        short totalMilk = 200;
        byte totalIceCream = 2;
        byte totalEgg = 4;

        int result = (banana * totalBanana) + (milk * (totalMilk / 100)) + (iceCream * totalIceCream) + (egg * totalEgg);
        System.out.println("Вес спортзавтрака в граммах: " + result + " гр.\nВес спортзавтрака в киллограмах: " + (result / 1000f) + " кг.");

        System.out.println();
        // Задание 7
        byte loseKg = 7;
        short grDay1 = 250;
        short grDay2 = 500;

        int day1 = (loseKg * 1000) / grDay1;
        int day2 = (loseKg * 1000) / grDay2;
        System.out.println("Спортцмен сбросит 7кг. с рационом " + grDay1 + " гр. в день за " + day1);
        System.out.println("Спортцмен сбросит 7кг. с рационом " + grDay2 + " гр. в день за " + day2);
        System.out.println("В среднем, чтобы сбросить 7кг. потребуется " + (day1 + day2) / 2 + " дней");

        System.out.println();
        // Задание 8
        int mashaZP = 67760;
        int denisZP = 83690;
        int kristinaZP = 76230;

        float percent = .1f;

        float curMashaZP = mashaZP * percent + mashaZP;
        float curDenisZP = denisZP * percent + denisZP;
        float curKristinaZP = kristinaZP * percent + kristinaZP;

        float diffMashaZP = (curMashaZP * 12) - (mashaZP * 12);
        float diffDenisZP = (curDenisZP * 12) - (denisZP * 12);
        float diffKristinaZP = (curKristinaZP * 12) - (kristinaZP * 12);

        System.out.println("Маша теперь получает " + curMashaZP + " рублей. Годовой доход вырос на " + diffMashaZP + " рублей");
        System.out.println("Денис теперь получает " + curDenisZP + " рублей. Годовой доход вырос на " + diffDenisZP + " рублей");
        System.out.println("Кристина теперь получает " + curKristinaZP + " рублей. Годовой доход вырос на " + diffKristinaZP + " рублей");

    }
}