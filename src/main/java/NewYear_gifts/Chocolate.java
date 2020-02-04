package NewYear_gifts;

public abstract class Chocolate extends Sweets {
    public Chocolate() {

    }
}
class SnickersBar extends Chocolate {
    public SnickersBar() {
    }

    public SnickersBar(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
        setName("SnickersBar");
    }
}
class MilkyWayBar extends Chocolate {
    public MilkyWayBar() {
    }

    public MilkyWayBar(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
        setName("MilkyWayBar");
    }
}
class DoveChocolate extends Chocolate {
    public DoveChocolate() {
    }

    public DoveChocolate(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
        setName("DoveChocolate");
    }
}
