
import java.util.Random;

public class Main {
static Random r = new Random();
    public static void main(String[] args) {
        getPrices();
        getYears();
        getCarPlate();
        getRandomWord();
    }

    public static void getRandomWord() {
        // random word with max 8 chars, a-z A-z
        int wordLength = r.nextInt(8) + 1;
        String word = "";
        for (int i = 0; i < wordLength; i++) {
            int tmp = r.nextInt(26); // generate 0 - 25
            int choices = r.nextInt(2); // determine whether is a-z or A-Z
            if (choices == 1) word += (char)('a' + tmp);
            else word += (char)('A' + tmp);
        }
        System.out.println("Random Word : " + word);
    }

    public static void getCarPlate() {
        // random carplate with 5 leading digits and 2 char
        String carPlate = "";
        int carPlateDigit = r.nextInt(99_000 - 10_000 + 1) + 10_000;
        carPlate += carPlateDigit;
        for (int i = 0; i < 2; i++) {
            char c = 'Z';
            c = (char) (r.nextInt(26) + 'A');
            carPlate += c;
        }
        System.out.println("Car Plate Number : " + carPlate);
    }

    public static void getYears() {
        // 5 random even years
        int years[] = new int[5];
        for (int i = 0; i < years.length; i++) {
            years[i] = r.nextInt(2030 - 1990 + 1) + 1990;
            if (years[i] % 2 != 0) years[i]++; // if the year is odd, convert to even by +1
        }
        System.out.print("5 random even-numbered years : ");
        for (int i = 0; i < years.length; i++) {
            System.out.printf("%d ", years[i]);
        }
        System.out.println("");
    }

    public static void getPrices() {
        // 3 random prices range 100.00 - 300.00
        double prices[] = new double[3];
        for (int i = 0; i < prices.length; i++) {
            // generate the integer part first, then append the floating points
            prices[i] = r.nextInt(300 - 100 + 1) + 100;
            prices[i] += r.nextDouble();
        }
        System.out.print("3 random price values : ");
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%.2f ", prices[i]);
        }
        System.out.println("");
    }

}
