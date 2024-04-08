public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        String clietnDeviceOS0 = "IOS";
        String clietnDeviceOS1 = "Android";

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.printf("Установите версию приложения для %s по ссылке", clietnDeviceOS0);
        } else if (clientOS == 1) {
            System.out.printf("Установите версию приложения для %s по ссылке", clietnDeviceOS1);
        } else {
            System.out.println("Версии для других ОС находятся в разработке. Следите за новостями.");
        }

        System.out.println("\n\nЗадача № 2");
        String lightWersion = "облегченную версию";
        String normalWersion = "обычную версию";
        int clientDeviceYear = 2024;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.printf("\nУстановите %s версию для %s по ссылке",
                    lightWersion, clietnDeviceOS0);
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.printf("\nУстановите %s версию для %s по ссылке",
                    normalWersion, clietnDeviceOS0);
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.printf("\nУстановите %s версию для %s по ссылке",
                    lightWersion, clietnDeviceOS1);
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.printf("\nУстановите %s версию для %s по ссылке",
                    normalWersion, clietnDeviceOS1);
        } else {
            System.out.println("Версии для других ОС находятся в разработке. Следите за новостями.");
        }

        System.out.println("\n\nЗадача № 3");
        int year = 2001;
        String typeYear = "не високосным";

        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            typeYear = "високосным";
        }
        System.out.printf("%s год является %s.%n", year, typeYear);


        System.out.println("\nЗадача № 4");
        int deliveryDistance = 12;
        int days = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days += 2;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        //Попытка оптимизации
        int days2 = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days2);
        } else if (deliveryDistance <= 60) {
            days2 += 1;
            System.out.println("Потребуется дней: " + days2);
        } else if (deliveryDistance <= 100) {
            days2 += 2;
            System.out.println("Потребуется дней: " + days2);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("\nЗадача № 5");
        int monthNumber = 14;
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("В году только 12 месяцев!!");


        }
    }
}