import NewYear_gifts.NewYearGifts;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        NewYearGifts newyearGift=new NewYearGifts();
        newyearGift.sortWeights();
//		newyearGift.sortSugerLevel();

        newyearGift.printGifts();
    }
}
