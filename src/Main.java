public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte quantityByte = 127;
        System.out.println("байт равен "+quantityByte);
        short quantityShort = 32767;
        System.out.println("Шорт равен "+quantityShort);
        int quantityInt = 2147483647;
        System.out.println("Инт равен "+ quantityInt);
        long quantityLong = 9223372036854775807L;
        System.out.println( "лонг равен "+quantityLong);
        float numFloat= 3.4e+30f;
        System.out.println(numFloat);
        double numDouble = 1.7e+308d;
        System.out.println(numDouble);

        float sugar = 27.12f;
        System.out.println("количество сахара "+sugar+ " кг");
        long apple = 987678965549L;
        System.out.println("Всего яблок на складе"+apple);
        double flour = 2.786F;
        System.out.println("Муки "+flour+ " кг");
        short books = 569;
        System.out.println("Всего книг "+books);
        short item = -159;
        System.out.println(item);
        int km = 27897;
        System.out.println("Мы проехали за год "+km);
        byte icecream = 67;
        System.out.println("Нам нужно купить "+icecream+ " мороженых");

        byte classAP = 23;
        byte classAS = 27;
        byte classEA = 30;
        int result = classEA + classAP + classAS;
        System.out.println("Всего учеников "+result);
        short paper = 480;
        System.out.println("Всего листов "+paper);
        int forOne = paper/result;
        System.out.println("На каждого ученика рассчитано "+forOne+ " листов бумаги");

        byte coca = 16;
        byte time = 2;
        int forMinute = coca / time;
        System.out.println("За минуту машина произвела "+forMinute+ " штук бутылок");
        byte time20 =20;
        int for20M = forMinute*time20;
        System.out.println("За "+time20+ " минут машина прозвела "+for20M+ " штук бутылок");
        short oneDay = 1440;
        int forDay = forMinute*oneDay;
        System.out.println("За "+ oneDay +" минут машина прозвела "+forDay+ " штук бутылок");
        short days = 3;
        int treeDays = forDay*days;
        System.out.println("За "+days+ " дня машина прозвела "+treeDays+ " штук бутылок");
        short month = 30;
        int oneMonth = forDay*month;
        System.out.println("За "+month+ "дней машина произвела "+oneMonth+ " штук бутылок");

        byte paint = 120;
        byte white = 2;
        byte brown =4;
        int classes = paint/(white+brown);
        System.out.println(classes);
        int allWhite = classes*white;
        int allBrown = classes*brown;
        System.out.println("В школе, где "+classes+ " классов, нужно "+allWhite+ " банок белой краски и " +allBrown+ " банок коричневой краски.");

        byte bananas = 5;
        byte weightOneBanan = 80;
        int allbabananas = bananas*weightOneBanan;
        System.out.println(allbabananas);
        short milk = 200;
        short milk100 = 100;
        byte weightOneMilk = 105;
        int allMilk = (milk/milk100)*weightOneMilk;
        System.out.println(allMilk);
        byte iceCream = 2;
        byte weightOneIC = 100;
        int allIceCream = iceCream*weightOneIC;
        System.out.println(allIceCream);
        byte aggs =4;
        byte weightOneAgg = 70;
        int allAggs = aggs*weightOneAgg;
        System.out.println(allAggs);
        int allProduct =allbabananas+allMilk+allIceCream+allAggs;
        System.out.println("Всего в граммах "+allProduct);
        float weightOneKG = 1000;
        float allOneKG = allProduct / weightOneKG;
        System.out.println("Всегов в килограммах " +allOneKG);

        int maria =67760;
        int denis = 83690;
        int kris = 76230;
        float bonus10 = 0.1f;
        float allMaria = maria+ (maria*bonus10);
        float allDenis = denis+ (denis*bonus10);
        float allKris = kris+ (kris*bonus10);
        byte oneYear = 12;
        float oldMaria = maria*oneYear;
        float oldDenis = denis*oneYear;
        float oldKris = kris*oneYear;
        float newMaria = allMaria*oneYear;
        float newDenis = allDenis*oneYear;
        float newKris = allKris*oneYear;
        float yearMaria =newMaria-oldMaria;
        float yearDenis = newDenis-oldDenis;
        float yearKris = newKris-oldKris;
        System.out.println("Маша теперь получает "+allMaria+ " рублей в месяц. Годовой доход вырос на "+yearMaria +" рублей.");
        System.out.println("Денис теперь получает "+allDenis+ " рублей. Годовой доход вырос на "+yearDenis+ " рублей");
        System.out.println("Кристина теперь получает "+allKris+ " рублей. Годовой доход вырос на "+yearKris+ " рублей.");




    }

}