import java.time.LocalDate;

public class Main {
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else return false;
    }

    public static void printYear(int year) {
        if(isLeapYear(year)) {
            System.out.printf("%d — високосный год", year);
        } else {
            System.out.printf("%d — не високосный год", year);
        }
    }

    public static void downloadApplication(int typeOS, int year) {
        String typeOSString;
        String str = "";
        int currentYear = LocalDate.now().getYear();
        switch(typeOS) {
            case 0: typeOSString = "iOS"; break;
            case 1: typeOSString = "Android"; break;
            default: throw new RuntimeException("Указан неизвестный тип ОС");
        }
        if (year < currentYear) str = "облегченную ";
        System.out.printf("Установите %sверсию приложения для %s по ссылке", str, typeOSString);
    }

    public static int getAmountDaysOfDelivery(int distance) {
        // Начиная с 20км, каждые 40км добавляет день доставки, причем используются интервалы типа [...)
        if (distance < 20) {
            return 1;
        } else {
            int p = (distance - 20) / 40;
            return p + 2;
        }
}

    public static void main(String[] args) {
        // task 1
        int year = 1900;
        printYear(year);

        // task 2
        System.out.println();
        downloadApplication(1, 2019);

        // task 3
        System.out.println();
        int distance = 95;
        System.out.printf("Потребуется дней: %d", getAmountDaysOfDelivery(distance));
    }
}