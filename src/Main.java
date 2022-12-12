import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 11");
        System.out.println("Task 1");
        int year = 1800;
        checkLeapYear(year);
        System.out.println("");

        System.out.println("Task 2");
        int yearOfManufactureDevice = 2019; //год выпуска устройства
        int typeOfOS = 0; //тип операционной системы (ОС) (0 — iOS или 1 — Android)
        printVersionOS(yearOfManufactureDevice, typeOfOS);
        System.out.println("");

        System.out.println("Task 3");
        int deliveryDistance = 3500;
        if (deliveryDistance > 0 && deliveryDistance <= 5000) {
            System.out.println("Для доставки в пределах " + deliveryDistance + " км потребуется дней: " + countTheNumberOfDeliveryDays(deliveryDistance));
        } else {
            System.out.println("Доставка неосуществима");
        }

        System.out.println(" ");
    }
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }
    private final static int CURRENTYEAR = LocalDate.now().getYear();
    public static String getVersionOS(int versionOS) {
        if (versionOS == 0) {
            return "iOS";
        } else if (versionOS == 1) {
            return "Android";
        }
        return "Вы указали несуществующий тип операционной системы";
    }
    public static void printVersionOS(int year, int versionOS){
        if (year == CURRENTYEAR) {
            System.out.println("Установите обычную версию приложения для ОС - " + getVersionOS(versionOS));
        } else if (year >= 2007 && year < CURRENTYEAR) {  // в 2007 году появилась первая iOS, в 2008 году - Android
            System.out.println("Установите облегченную версию приложения для ОС - " + getVersionOS(versionOS));
        } else {
            System.out.println("Введите коррекный год");
        }
    }
    public static int countTheNumberOfDeliveryDays(int deliveryDistance){
        int numberOfDays = 1 + (19 + deliveryDistance) / 40;
        return numberOfDays;
    }

}