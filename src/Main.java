import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void installTheApplication(int OS, int yearOfManufactureDevice) {
        int currentYear = LocalDate.now().getYear();
        if (yearOfManufactureDevice >= currentYear) {
            switch (OS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Пожалуйста, выберите корректную операционную систему Вашего устройства: iOS - 0,Android - 1");
            }
        } else {
            switch (OS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Пожалуйста, выберите корректную операционную систему Вашего устройства: iOS - 0,Android - 1");
            }
        }
    }
    public static int countTheNumberOfDeliveryDays(int deliveryDistance){
        int numberOfDays = 1 + (19 + deliveryDistance) / 40;
        return numberOfDays;
    }
    public static void main(String[] args) {
        System.out.println("Homework 11");
        System.out.println("Task 1");
        int year = 1800;
        checkLeapYear(year);
        System.out.println("");

        System.out.println("Task 2");
        int typeOfOS = 3; //тип операционной системы (ОС) (0 — iOS или 1 — Android)
        int yearOfManufactureDevice = 2022; //год выпуска устройства
        installTheApplication(typeOfOS, yearOfManufactureDevice);
        System.out.println("");

        System.out.println("Task 3");
        int deliveryDistance = 20;
        int countOfNumberDeliveryDays = countTheNumberOfDeliveryDays(deliveryDistance);
        System.out.println("Для доставки в пределах " + deliveryDistance + " км потребуется дней: " + countOfNumberDeliveryDays);
        System.out.println(" ");
    }
}