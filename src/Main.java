public class Main {
    public static void main(String[] args) {
        int age = 22;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        } else if (age > 7) {
                System.out.println(" Иди в школу");
            } else {
                System.out.println("Иди в детский сад");
            }

        System.out.println("\nЗадача 2");
        for (int i = 0; i < 5; i += 2) {
            System.out.println(i);
            break;
        }

        int age2 = 6;
        if (age2 == 18) {
            System.out.println("С окончанием школы!");
        } else if (age2 == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age2 == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }

        System.out.println("\nЗадача 3");
        char color = 'y';
        if (color == 'r') {
            System.out.println("Красный! Ехать нельзя!");
        } else if (color == 'y') {
            System.out.println("Желтый. Внимание!");
            } else {
            System.out.println("Зеленый! Можно ехать.");
        }

        System.out.println("\nЗадача 4");
        char color2 = 'r';
        switch (color2) {
            case 'r':
                System.out.println("Красный! Ехать нельзя!");
                break;
            case 'y':
                System.out.println("Желтый. Внимание!");
                break;
            case 'g':
                System.out.println("Зеленый! Можно ехать.");
                break;
            case 'l':
                System.out.println("Поворот налево.");
                break;
            default:
                System.out.println();
        }

    }
}