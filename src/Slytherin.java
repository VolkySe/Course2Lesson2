public class Slytherin  extends Hogwarts{

    private int cunningPoints;
    private int determinationPoints;
    private int ambitionPoints;
    private int resourcefulnessPoints;
    private int thirstOfPowerPoints;

    public Slytherin(String name, String surname, int magicPower, int transgressionDistance,
                     int cunningPoints, int determinationPoints, int ambitionPoints, int resourcefulnessPoints, int thirstOfPowerPoints) {
        super(name, surname, magicPower, transgressionDistance);
        this.cunningPoints = cunningPoints;
        this.determinationPoints = determinationPoints;
        this.ambitionPoints = ambitionPoints;
        this.resourcefulnessPoints = resourcefulnessPoints;
        this.thirstOfPowerPoints = thirstOfPowerPoints;
    }

    public int getCunningPoints() {
        return cunningPoints;
    }

    public void setCunningPoints(int cunningPoints) {
        this.cunningPoints = cunningPoints;
    }

    public int getDeterminationPoints() {
        return determinationPoints;
    }

    public void setDeterminationPoints(int determinationPoints) {
        this.determinationPoints = determinationPoints;
    }

    public int getAmbitionPoints() {
        return ambitionPoints;
    }

    public void setAmbitionPoints(int ambitionPoints) {
        this.ambitionPoints = ambitionPoints;
    }

    public int getResourcefulnessPoints() {
        return resourcefulnessPoints;
    }

    public void setResourcefulnessPoints(int resourcefulnessPoints) {
        this.resourcefulnessPoints = resourcefulnessPoints;
    }

    public int getThirstOfPowerPoints() {
        return thirstOfPowerPoints;
    }

    public void setThirstOfPowerPoints(int thirstOfPowerPoints) {
        this.thirstOfPowerPoints = thirstOfPowerPoints;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunningPoints=" + cunningPoints +
                ", determinationPoints=" + determinationPoints +
                ", ambitionPoints=" + ambitionPoints +
                ", resourcefulnessPoints=" + resourcefulnessPoints +
                ", thirstOfPowerPoints=" + thirstOfPowerPoints +
                '}';
    }
}
