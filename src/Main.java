public class Main {
    public static void main(String[] args) {
        // Задание №1
        //    byte dog = 2;
            short monkey = 4;
        //    int cat = 15;
            long shark = 4900L;
            float saltWeight = 1.4f;
            double sugarWeight = 3.3;
            char percent = 37;
        //      System.out.println(percent);
        //    boolean catIsAdult = cat > 10;
        //      System.out.println(catIsAdult);

        // Задание №2 (6)
            double firstBoxer = 78.2;
            double secondBoxer = 82.7;
        //    double weightOfAllBoxers = firstBoxer + secondBoxer;
        //    double weightDifference = secondBoxer - firstBoxer;
        //      System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        //      System.out.println("Разница в весе боксеров " + weightDifference);

        // Задание №3
            byte banana = 5;
            short milk = 200;
            byte icecream = 2;
            byte egg = 4;
            float totalCalculate = (banana * 80) + (milk + 10) + (icecream * 100) + (egg * 70);
        //       System.out.println("Общий объём спорт-завтрака равен " + totalCalculate + " грамм");
            float totalWeight = totalCalculate / 1000;
        //       System.out.println("Общий объём такого спорт-завтрака равен " + totalWeight + " кг");

        // Задание №4
            byte needWeightLose = 7;
            short kg = 1000;
            int weightInKg = needWeightLose * kg;
            int a = 250, b = 500;
            int averageValue = (a + b) / 2;
            int trainerCorrect_a = weightInKg / a;
            int trainerCorrect_b = weightInKg / b;
            int averageCorrectValue = weightInKg / averageValue;
        //       System.out.println(trainerCorrect_a + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        //       System.out.println(trainerCorrect_b + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        //       System.out.println(averageCorrectValue + " дней может потребоваться в среднем, чтобы добиться результата похудения.");

        // Задание №5
            int Maria = 67_760;
            int Denis = 83_690;
            int Christina = 76_230;
            int annualRevenue1 = Maria * 12; //ежегодные доходы сотрудников
            int annualRevenue2 = Denis * 12;
            int annualRevenue3 = Christina * 12;
        //       System.out.println("Годовой доход Марии составляет "+annualRevenue1 + " рублей");
        //       System.out.println("Годовой доход Дениса составляет "+annualRevenue2 + " рублей");
        //       System.out.println("Годовой доход Кристины составляет "+annualRevenue3 + " рублей");
            double percentageIncrease = 10.0/100;
            double salaryIncrease1 = (Maria * percentageIncrease) + Maria; // увеличение ежемесячной зарплаты на 10%
            double salaryIncrease2 = (Denis * percentageIncrease) + Denis;
            double salaryIncrease3 = (Christina * percentageIncrease) + Christina;
        //      System.out.println("Увеличение зарплаты Марии на 10% от текущей месячной составляет " +salaryIncrease1 + " рублей");
        //      System.out.println("Увеличение зарплаты Дениса на 10% от текущей месячной составляет " +salaryIncrease2 + " рублей");
        //      System.out.println("Увеличение зарплаты Кристины на 10% от текущей месячной составляет " +salaryIncrease3 + " рублей");
            double afterIncrease1 = salaryIncrease1 * 12; // ежегодные доходы сотрудников + 10% от ежемесячной зарплаты
            double afterIncrease2 = salaryIncrease2 * 12;
            double afterIncrease3 = salaryIncrease3 * 12;
        //      System.out.println("Годовой доход Марии после повышения ежемесячной зарплаты составляет "+ afterIncrease1 + " рублей");
        //      System.out.println("Годовой доход Дениса после повышения ежемесячной зарплаты составляет "+ afterIncrease2 + " рублей");
        //      System.out.println("Годовой доход Кристины после повышения ежемесячной зарплаты составляет "+ afterIncrease3 + " рублей");
            double difference1 = afterIncrease1 - annualRevenue1; // разница между годовым доходом с нынешней зарплатой и после повышения
            double difference2 = afterIncrease2 - annualRevenue2;
            double difference3 = afterIncrease3 - annualRevenue3;
        //      System.out.println("Разница между годовым доходом Марии с нынешней зарплатой и после повышения составляет " + difference1 + " рублей");
        //      System.out.println("Разница между годовым доходом Дениса с нынешней зарплатой и после повышения составляет " + difference2 + " рублей");
        //      System.out.println("Разница между годовым доходом Кристины с нынешней зарплатой и после повышения составляет " + difference3 + " рублей");

        // Задача №6 (1)
            double dog = 8;
            var cat = 3.6;
            var paper = 763789;

        // Задача №7 (2)
        //  dog = dog +4;
        //  cat = cat + 4;
        //  paper = paper +4;
        //       System.out.println(dog);
        //       System.out.println(cat);
        //       System.out.println(paper);

        // Задача №8 (3)
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
        //    System.out.println(dog);
        //    System.out.println(cat);
        //    System.out.println(paper);

        // Задача №9 (4)
            var friend = 19;
        //    System.out.println(friend);
            friend = friend + 2;
        //    System.out.println(friend);
            friend = friend / 7;
        //    System.out.println(friend);

        // Задача №10 (5)
            var frog = 3.5;
        //    System.out.println(frog);
        //    frog = (frog * 10) / 3.5 + 4;
        //    System.out.println(frog);
            frog = frog * 10;
        //    System.out.println(frog);
            frog = frog / 3.5;
        //    System.out.println(frog);
            frog = frog + 4;
        //    System.out.println(frog);

        // Задача №11 (7)
            var fighter1 = 78.2;
            var fighter2 = 82.7;
            var weightDifference = fighter2 - fighter1;
        //    System.out.println(weightDifference);
            weightDifference = fighter2 % fighter1;
        //    System.out.println(weightDifference);

        // Задача №12 (8)
            var time = 640;
            var workerTime = time / 8;
            System.out.println("Всего работников в компании " + workerTime + " человек");
            var timeSharing = time / (workerTime + 94);
            System.out.println("Если в компании работает 174 человека, то всего " + timeSharing + " часов работы может быть поделено между сотрудниками");
    }


}