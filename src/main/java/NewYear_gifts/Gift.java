package NewYear_gifts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gift {

    private Sweets[] instances = {new Halva(), new Ladoo(),
            new SnickersBar(),
            new MilkyWayBar(), new DoveChocolate()};
    private double totalWeight;
    private double totalSugerLevel;
    private int noItems;
    private static File input = new File("src/main/resources/giftItems");
    private static Scanner scan;

    static {
        try {
            scan = new Scanner(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Gift(int x) throws FileNotFoundException {
        this.setGiftitems();
    }
    public void setGiftitems() {
        noItems = scan.nextInt();
        scan.nextLine();
        String itemName;
        String className;
        String[] classNames;
        double itemWeight;
        double itemSugerLevel;
        for(int iter = 0; iter< noItems; ++iter) {
            itemName=scan.nextLine();
            itemWeight = scan.nextDouble();
            itemSugerLevel = scan.nextDouble();
            scan.nextLine();
            for(int iter1=0;iter1<5;++iter1) {
                className="";
                className = instances[iter1].getClass().getName();
                classNames = className.split("[.]",2);
                className=classNames[1];
                if(className.equals(itemName)) {
                    instances[iter1].setName(itemName);
                    instances[iter1].setWeight(itemWeight);
                    instances[iter1].setSugarLevel(itemSugerLevel);
                    totalWeight+=instances[iter1].getWeight();
                    totalSugerLevel+=instances[iter1].getSugarLevel();
                    break;
                }
            }

        }
    }

    public double getItemWeigth() {
        return totalWeight;
    }

    public double getItemSugerLevel() {
        return totalSugerLevel;
    }

    public void printItemDetails() {
        System.out.println("No.\t"+"Name\t"+"\tSugerLevel\t"+"Weigth");
        int nitem=0;
        System.out.println("------------------------------------------");
        for(int iter=0;iter<5;++iter) {
            if(instances[iter].getSweetName() != null) {
                System.out.print((nitem+1)+"\t"+instances[iter].getSweetName()+"\t");
                System.out.printf("\t%.2f\t",instances[iter].getSugarLevel());
                System.out.printf("\t%.2f\n",instances[iter].getWeight());
                nitem+=1;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("No.of items:"+noItems);
        System.out.printf("Total weight:%.3f",totalWeight);
        System.out.printf("\nTotal Suger Level:%.3f\n",totalSugerLevel);

    }
}

