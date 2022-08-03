public class Main {
    public static void main(String[] args) {
	// task 1
        int clientOs=0;
        if (clientOs==0) {
            System.out.println("У вас Андроид");
    } else if (clientOs==1) {
            System.out.println("У вас IOS");
        } else {
            System.out.println("Ос не найдена");
        }

        // task 2
         clientOs=0;
        int year=2015;
            if (clientOs==0 && year>2019) {
                System.out.println("Установите обычную версию андроида");
            }else if (clientOs==0 && year<2019) {
            System.out.println("Установите lite версию Андроида");
        } else if (clientOs==1 && clientOs>2019) {
                System.out.println("Установите обычную версию IOS");
            } else if (clientOs==1 && clientOs<2019) {
                System.out.println("Установите lite версию IOS");
            } else {
                System.out.println("Ваше устройство не поддерживается");
            }
            // task 3

            if (year%4==0&&year%100!=0||year%400==0) {
                  System.out.printf("Год является  високосным", year);
            }else{
                  System.out.printf("Год  не  является високосным",year );

}
            // task 4
        int deliveryDistance=60;
            if (deliveryDistance>0&&deliveryDistance<20) {
                System.out.println("Доставка за 1 день");
            }else if (deliveryDistance>=20&&deliveryDistance<60){
                System.out.println("Доставка за два дня");}
            else if (deliveryDistance>=60&&deliveryDistance<100){
                System.out.println("Доставка за 3 дня");
            }else {
                System.out.println("Сюда не доставляем");
            }
            // task 5
        int monthNumber=123;
            switch (monthNumber){
                case 12:
                case 1:
                case 2:
                    System.out.println("Зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осенний месяц");
                default:
                    System.out.println("Такого месяца не бывает");

            }




        }


            }


