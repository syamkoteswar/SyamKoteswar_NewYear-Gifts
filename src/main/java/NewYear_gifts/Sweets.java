package NewYear_gifts;

public abstract class Sweets implements Candies {

    private double sugarLevel;
    private double weight;
    private String name;

    public double getSugarLevel() {
        return sugarLevel;
    }
    public double getWeight() {
        return weight;
    }
    public void setSugarLevel(double itemSugarLevel) {
        this.sugarLevel = weight*itemSugarLevel;
    }
    public void setWeight(double itemWeight) {
        this.weight = itemWeight;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getSweetName() {
        return name;
    }
}
class Halva  extends Sweets {
    public Halva() {
    }

    public Halva (double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
        setName("Halva");
    }
}
class Ladoo  extends Sweets {
    public Ladoo() {
    }

    public Ladoo(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
        setName("Ladoo");
    }
}
