package chapterSix;

public class Cata {

    public char calculateGradeFor(int score) {
        if(score >89) return 'A';
        if(score >79) return 'B';
        if(score >70) return 'C';
        if(score >60) return 'D';
        return 'F';
    }

    public int setPriceFor(int price) {
        if (price >= 1 && price <= 4) {
            price = (price * 2000);
            return price;
        }
        if (price > 4 && price <= 9) {
            price = (price * 1800);
            return price;
        }
        if (price > 9 && price <= 29) {
            price = (price * 1600);
            return price;
        }
        if (price > 29 && price <= 49) {
            price = (price * 1500);
            return price;
        }
        if (price > 49 && price <= 99) {
            price = (price * 1300);
            return price;
        }
        if (price > 99 && price <= 199) {
            price = (price * 1200);
            return price;
        }
        if (price > 199 && price <= 499) {
            price = (price * 1100);
            return price;
        }
        if (price > 500 ) {
            price = (price * 1000);
            return price;
        }
        return 0;
    }}

