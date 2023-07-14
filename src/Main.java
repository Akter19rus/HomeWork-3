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
            int a = 8_923_596;
            byte b = 120;
            short c = 30_555;
            long d = 8_923_596_44_86L;
            float e = 15f;
            double g = 36.6;
        System.out.println("Значение переменной 'a' с типом 'int' равен " + a );
        System.out.println("Значение переменной 'b' с типом 'byte' равен " + b);
        System.out.println("Значение переменной 'c' с типом 'short' равен " + c);
        System.out.println("Значение переменной 'd' с типом 'long' равен " + d);
        System.out.println("Значение переменной 'e' с типом 'float' равен " + e);
        System.out.println("Значение переменной 'g' с типом 'double' равен " + g);
    }

    public static void task2 () {
        System.out.println("Задача 2");
            float one = 27.12f;
            long two = 987_678_965_549L;
            float three = 2.786f;
            short four = 569;
            short five = -159;
            short six = 27_897;
            byte seven = 67;
        System.out.println("Для значения " + one + " присвоен тип 'float'");
        System.out.println("Для значения " + two + " присвоен тип 'long'");
        System.out.println("Для значения " + three + " присвоен тип 'float'");
        System.out.println("Для значения " + four + " присвоен тип 'int'");
        System.out.println("Для значения " + five + " присвоен тип 'int'");
        System.out.println("Для значения " + six + " присвоен тип 'short'");
        System.out.println("Для значения " + seven + " присвоен тип 'byte'");
    }
    public static void task3 () {
        System.out.println("Задача 3");
            byte students_LP = 23;
            byte students_AS = 27;
            byte students_EA = 30;
            short buyPaper = 480;
            int paperForStudent = buyPaper / (students_LP + students_AS + students_EA);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги!");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Производительность машины 16 бутылок за 2 минуты
            byte performanceOneMinut = 16 / 2;
                byte minutesInHour = 60;
                byte hourInDay = 24;
                byte dayInMonth = 31;
            byte twentyMinutes = 20;
            int inTwentyMinutes = twentyMinutes * performanceOneMinut;
        System.out.println("За " + twentyMinutes + " минут машина произвела " + inTwentyMinutes + " штук бутылок.");
            int performanceInDay = performanceOneMinut * (hourInDay * minutesInHour);
        System.out.println("За " + hourInDay + " часа машина произвела " + performanceInDay + " штук бутылок.");
            byte threeDay = 3;
                int hourInThreeDay = hourInDay * threeDay;
                int performanceInThreeDay = performanceOneMinut * (hourInThreeDay * minutesInHour);
        System.out.println("За " + threeDay + " дня машина произвела " + performanceInThreeDay + " штук бутылок.");
            int performanceInMonth = (dayInMonth * hourInDay * minutesInHour) * performanceOneMinut;
        System.out.println("За " + dayInMonth + " день машина произвела " + performanceInMonth + " штук бутылок.");
    }


    public static void task5 () {
        System.out.println("Задача 5");
            byte fullCans = 120;
            byte oneClassWhite = 2;
            byte oneClassBrown = 4;
                int fullCansForClass = oneClassBrown + oneClassWhite;
                int fullClass = fullCans / fullCansForClass;
                int fullWhiteCans = fullClass / oneClassWhite;
                int fullBrownCans = fullClass / oneClassBrown;
        System.out.println("В школе, где " + fullClass + " классов, нужно " + fullWhiteCans + " банок белой краски и " + fullBrownCans + " банок коричневой краски.");
    }

    public static void task6 () {
        System.out.println("Задача 6");
            byte bananas = 5;
                byte oneBananasGram = 80;
            short milk = 200;
                byte milkForMl = 100;
                byte milkInGram_100ml = 105;
            byte iceCream = 2;
                byte oneIceCreamInGram = 100;
            byte rawEgg = 4;
                byte oneRawEggInGram = 70;
            int fullGramProduct = (bananas * oneBananasGram) + (milk * milkInGram_100ml / milkForMl) + (oneIceCreamInGram * iceCream) + (oneRawEggInGram * rawEgg);
            short gramInKilo = 1000;
                float fullKiloProduct = fullGramProduct / (float) gramInKilo;
        System.out.println("Общий вес спортзавтрака " + fullGramProduct + " грамм.");
        System.out.println("Общий вес спортзавтрака равен " + fullKiloProduct + " килограмм.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
            byte resetKilo = 7;
                short gramInKilo = 1000;
                float resetKiloInGram = resetKilo * (float) gramInKilo;
            short oneDayReset = 250;
            short oneDayReset2 = 500;
            int oneDayReset3 = 375;

            float forDaysReset = resetKiloInGram / oneDayReset;     //Если каждый день сбрасывать по 250 грамм
            float forDaysReset2 = resetKiloInGram / oneDayReset2;   //Если каждый день сбрасывать по 500 грамм
            float forDaysReset3 = resetKiloInGram / oneDayReset3;   //Если каждый день сбрасывать среднее количество грамм
        System.out.println("Если каждый день сбрасывать по " + oneDayReset + " грамм, то спортсмен похудеет на " + resetKilo + " киллограммов за " + forDaysReset + " дней.");
        System.out.println("Если каждый день сбрасывать по " + oneDayReset2 + " грамм, то спортсмен похудеет на " + resetKilo + " киллограммов за " + forDaysReset2 + " дней.");
        System.out.println("Если каждый день сбрасывать по " + oneDayReset3 + " грамм, то спортсмен похудеет на " + resetKilo + " киллограммов за " + forDaysReset3 + " дней.");
    }

    public static void task8 () {
        System.out.println("Задача 8");
            byte percent = 10;
            byte monthInYear = 12;

            int salaryMasha = 67_760;
                int salaryYear = salaryMasha * monthInYear;   //Зарплата за год, до повышения
                int salaryAfterPromotion = (salaryMasha * percent / 100) + salaryMasha;
                    int salaryYearNow = salaryAfterPromotion * monthInYear;   //Зарплата за год, после повышения
                int differenceNow = (salaryYear + salaryYearNow)% salaryYear;
        System.out.println("Маша теперь получает " + salaryAfterPromotion + " рублей. Годовой доход вырос на " + differenceNow + " рублей.");

            int salaryDenis = 83_690;
                int salaryYear_Denis = salaryDenis * monthInYear;   //Зарплата за год, до повышения
                int salaryAfterPromotion_Denis = (salaryDenis * percent / 100) + salaryDenis;
                    int salaryYearNow_Denis = salaryAfterPromotion_Denis * monthInYear;     //Зарплата за год, после повышения
                int differenceNow_Denis = (salaryYear_Denis + salaryYearNow_Denis)% salaryYear_Denis;
        System.out.println("Денис теперь получает " + salaryAfterPromotion_Denis + " рублей. Годовой доход вырос на " + differenceNow_Denis + " рублей.");

        int salaryKris = 76_230;
                int salaryYear_Kris = salaryKris * monthInYear;   //Зарплата за год, до повышения
                int salaryAfterPromotion_Kris = (salaryKris * percent / 100) + salaryKris;
                    int salaryYearNow_Kris = salaryAfterPromotion_Kris * monthInYear;   //Зарплата за год, после повышения
                int differenceNow_Kris = (salaryYear_Kris + salaryYearNow_Kris)% salaryYear_Kris;
        System.out.println("Кристина теперь получает " + salaryAfterPromotion_Kris + " рублей. Годовой доход вырос на " + differenceNow_Kris + " рублей.");

    }
}