public class Ravenclaw extends  Hogwarts{

    private int smartPoints;
    private int wisePoints;
    private int wittyPoints;
    private int creativityPoints;

    public Ravenclaw(String name, String surname, int magicPower, int transgressionDistance,
                      int smartPoints, int wisePoints, int wittyPoints, int creativityPoints) {
        super(name, surname, magicPower, transgressionDistance);
        this.smartPoints = smartPoints;
        this.wisePoints = wisePoints;
        this.wittyPoints = wittyPoints;
        this.creativityPoints = creativityPoints;
    }

    public int getSmartPoints() {
        return smartPoints;
    }

    public void setSmartPoints(int smartPoints) {
        this.smartPoints = smartPoints;
    }

    public int getWisePoints() {
        return wisePoints;
    }

    public void setWisePoints(int wisePoints) {
        this.wisePoints = wisePoints;
    }

    public int getWittyPoints() {
        return wittyPoints;
    }

    public void setWittyPoints(int wittyPoints) {
        this.wittyPoints = wittyPoints;
    }

    public int getCreativityPoints() {
        return creativityPoints;
    }

    public void setCreativityPoints(int creativityPoints) {
        this.creativityPoints = creativityPoints;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smartPoints=" + smartPoints +
                ", wisePoints=" + wisePoints +
                ", wittyPoints=" + wittyPoints +
                ", creativityPoints=" + creativityPoints +
                '}';
    }
}
