public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Для вышей системы нет версии приложения. Операционная система устройства на определена");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        short clientDeviceYear = 2016;
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <=2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <=2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS !=0 && clientOS !=1) {
            System.out.println("Операционная система вашего устройства не определена. Мы не можем предложить приложение для вашего устройства");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        short year = 2028;
        if ((year % 4) == 0) {
            System.out.println("Год высокосный");
        } else if ((year % 100) == 0) {
            System.out.println("Год не высокосный");
        } else if ((year % 400) == 0) {
            System.out.println("Год высокостный");
        } else
            System.out.println("Год не высокосный");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        //Константа возможности доставки
        short deliveryMax = 100;
        int deliveryDistance = 95;
        int deliveryTime = 0;
        //Плечи доставки за сутки в км
        boolean deliverySpeedOne = (deliveryDistance > 0 && deliveryDistance <= 20);
        boolean deliverySpeedTwo = (deliveryDistance > 20 && deliveryDistance <= 60);
        boolean deliverySpeedThree = (deliveryDistance > 60 && deliveryDistance <= deliveryMax);
        if (deliveryDistance <= deliveryMax && deliveryDistance != 0) {
            if (deliverySpeedOne) {
                deliveryTime = deliveryTime + 1;
                System.out.println("Потребуется дней " + deliveryTime);
            } else if (deliverySpeedTwo) {
                deliveryTime = deliveryTime + 2;
                System.out.println("Потребуется дней " + deliveryTime);
            } else if (deliverySpeedThree) {
                deliveryTime = deliveryTime + 3;
                System.out.println("Потребуется дней " + deliveryTime);
            }
        } else if (deliveryDistance > deliveryMax) {
            System.out.println("Мы не доставляем на расстояния больше, чем на " + deliveryMax + " км");
        } else {
            System.out.println("Вы не указали расстояние " + deliveryDistance + " Хотите оформить самовывоз?");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима. Январь");
                break;
            case 2:
                System.out.println("Зима. Февраль");
                break;
            case 3:
                System.out.println("Весна. Март");
                break;
            case 4:
                System.out.println("Весна. Апрель");
                break;
            case 5:
                System.out.println("Весна. Май");
                break;
            case 6:
                System.out.println("Лето. Июнь");
                break;
            case 7:
                System.out.println("Лето. Июль");
                break;
            case 8:
                System.out.println("Лето. Август");
                break;
            case 9:
                System.out.println("Осень. Сентябрь");
                break;
            case 10:
                System.out.println("Осень. Октябрь");
                break;
            case 11:
                System.out.println("Осень. Ноябрь");
                break;
            case 12:
                System.out.println("Зима. Декабрь");
                break;
            default:
                System.out.println("Значение за границами переменной");
        }
    }
}