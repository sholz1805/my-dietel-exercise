package chapterThree;

public class CarApplication {
    public static void main(String[] args) {

        Car car = new Car("B360", "2021", 10_000_000);
        Car car2 = new Car("B2250", "2022", 10_500_000);

        double Benz = car.getPrice();
        double Benz2 = car2.getPrice();

        double discount = car.getPrice() - (car.getPrice()*0.05);
        double discount2 = car2.getPrice() - (car2.getPrice()*0.07);

        System.out.printf("The price of the Benz, model %s year %s is %.3f", car.getModel(),car.getYear(),Benz);
        System.out.println( );
        System.out.printf("The price after 5%% discount is %.3f", discount);
        System.out.println();
        System.out.printf("The price of the Benz, model %s year %s is %.3f", car2.getModel(),car2.getYear(),Benz2);
        System.out.println( );
        System.out.printf("The price after 7%% discount is %.3f", discount2);


    }


}