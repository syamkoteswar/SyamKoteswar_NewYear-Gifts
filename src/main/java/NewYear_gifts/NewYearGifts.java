package NewYear_gifts;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewYearGifts {
    private int numGifts;
    private Gift giftItems[];
    private String friendName[];
    private File input;
    private Scanner scan;

    public NewYearGifts() throws FileNotFoundException {
        input =new File("src/main/resources/friendnames");
        scan =new Scanner(input);
        this.setNewYearGifts();
    }
    public void setNewYearGifts() throws FileNotFoundException {
        numGifts = scan.nextInt();
        scan.nextLine();
        giftItems=new Gift[numGifts];
        friendName=new String[numGifts];
        for(int iter = 0;iter < numGifts;++iter) {
            friendName[iter]=scan.nextLine();
            giftItems[iter] = new Gift(iter);
        }

    }
    public void printGifts() {
        for(int iter = 0; iter < numGifts; ++iter) {
            System.out.println("===================Gift-"+(iter+1)+"================");
            System.out.println("Friend Name:"+friendName[iter]);
            giftItems[iter].printItemDetails();
        }
    }
    public void sortWeights() {
        Gift temp;
        String temp2="";
        for(int iter1=0;iter1<numGifts-1;++iter1) {
            for(int iter2=iter1+1;iter2<numGifts;++iter2) {
                if( giftItems[iter1].getItemWeigth() > giftItems[iter2].getItemWeigth() ) {
                    temp=giftItems[iter1];
                    giftItems[iter1]=giftItems[iter2];
                    giftItems[iter2]=temp;
                    temp2=friendName[iter2];
                    friendName[iter2]=friendName[iter1];
                    friendName[iter1]=temp2;
                }
            }
        }
    }
    public void sortSugerLevel() {
        Gift temp;
        String temp2;
        for(int iter1=0;iter1<numGifts;++iter1) {
            for(int iter2=iter1+1;iter2<numGifts;++iter2) {
                if( giftItems[iter1].getItemSugerLevel() > giftItems[iter2].getItemSugerLevel() ) {
                    temp=giftItems[iter1];
                    giftItems[iter1]=giftItems[iter2];
                    giftItems[iter2]=temp;
                    temp2=friendName[iter2];
                    friendName[iter2]=friendName[iter1];
                    friendName[iter1]=temp2;

                }
            }
        }
    }
}

