//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //#1
        int clientOS = 0; //0=ios. 1=Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //#2
        int clientDeviceYear = 2014;
        String operationSystem = (clientOS == 0) ? "iOS" : "Android";
        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " +
                    operationSystem + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " +
                    operationSystem + " по ссылке");
        }

        //#3
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //#4
        int deliveryDistance = 95;
        int dayDelivery = 1;
        int dayDelivery1 = dayDelivery + 1;
        int dayDelivery2 = dayDelivery + 2;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + dayDelivery);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + dayDelivery1);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + dayDelivery2);
        } else {
            System.out.println("доставки нет");
        }

        //#5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}