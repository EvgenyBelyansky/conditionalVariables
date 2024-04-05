public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 3.");

        System.out.println("\nЗадача № 1.");
        int age = 19;
        if (age <= 18) {
            System.out.printf("Если возраст человека равен %s, то он несовершеннолетний", age);
        } else {
            System.out.printf("Возраст человека %s. Ты уже совершеннолетний. Поздравляю.", age);
        }

        System.out.println("\n\nЗадача № 2.");
        int airTemperature = 2;
        if (airTemperature >= 5) {
            System.out.printf("На улице %s градусов, можно идти без шапки.", airTemperature);
        } else {
            System.out.printf("На улице %s гразусов, нужно надеть шапку.", airTemperature);
        }

        System.out.println("\n\nЗадача № 3.");
        int speed = 64;
        if (speed <=60) {
            System.out.printf("Если скорость %s км/ч, можно ехать штрафа не будет.", speed);
        }
        if (speed > 60) {
            System.out.printf("Если скорость %s км/ч, то придется заплатить штраф.", speed);
        }

        System.out.println("\n\nЗадача № 4");
        System.out.println("Вариант 1");
        int age2 = 19;
        boolean goToKindergarten = (age2 >= 2 && age2 <= 6);
        boolean goToSchool = (age2 >= 7 && age2 <= 17);
        boolean goToUniversity = (age2 >= 18 && age2 <= 24);
        boolean goToWork = (age2 > 24);
        if (goToKindergarten) {
            System.out.printf("Если человеку %s лет, то он должен ходить в детский сад.", age2);
        }
        else if (goToSchool) {
            System.out.printf("Если человеку %s лет, то он должен ходить в школу.", age2);
        }
        else if (goToUniversity) {
            System.out.printf("Если человеку %s лет, то он должен ходить в университет.", age2);
        }
        else if (goToWork) {
            System.out.printf("Если человеку %s лет, то он должен ходить на работу.", age2);
        }

        System.out.println("\n\nЗадача № 5");
        int age3 = 17;
        boolean youShellNotPass = (age3 < 5);
        boolean youWillPassButOnlyWithYourParents = (age3 >= 5 && age3 < 14);
        boolean youWillPass = (age3 > 14);
        if (youShellNotPass) {
            System.out.printf("Если возраст ребенка %s лет, то ему нельзя кататься на атракционе", age3);
        } else if (youWillPassButOnlyWithYourParents) {
            System.out.printf("Если возраст ребенка %s лет, то ему можно кататься на атракционе только в " +
                    "сопровождении взрослого", age3);
        } else if (youWillPass) {
            System.out.printf("Если возраст ребенка %s лет. то он может кататься на атракционе без сопровождения", age3);
        }

        System.out.println("\n\nЗадача № 6");
        int carriagePlacesCapacity = 102;
        int sittingPlaces = 60;
        int standingPlaces = carriagePlacesCapacity - sittingPlaces;
        int occupiedSittingPlaces = 60;
        int occupiedStandingPlaces = 43;
        int freeSittingPlaces = sittingPlaces - occupiedSittingPlaces;
        int freeStandingPlaces = standingPlaces - occupiedStandingPlaces;
        int allFreePlaces = freeSittingPlaces + freeStandingPlaces;
        if (allFreePlaces > 0) {
            System.out.printf("В вагоне есть %s свободных места, их них %s сидячих и %s стоячих.",
                    allFreePlaces, freeSittingPlaces, freeStandingPlaces);
        } else {
            System.out.println("Свободных мест нет. Перейдите в другой вагон.");
        }

        System.out.println("\nЗадача № 7");
        int one = 25;
        int two = 263;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else if ( three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }


    }
}