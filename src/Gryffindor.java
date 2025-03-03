public class Gryffindor extends Hogwarts {
    private int nobilityPoints;
    private int honorPoints;
    private int braveryPoints;

    public Gryffindor(String name, String surname, int magicPower, int transgressionDistance,
                      int nobilityPoints, int honorPoints, int braveryPoints) {
        super(name, surname, magicPower, transgressionDistance);
        this.nobilityPoints = nobilityPoints;
        this.honorPoints = honorPoints;
        this.braveryPoints = braveryPoints;
    }

    public int getNobilityPoints() {
        return nobilityPoints;
    }

    public void setNobilityPoints(int nobilityPoints) {
        this.nobilityPoints = nobilityPoints;
    }

    public int getHonorPoints() {
        return honorPoints;
    }

    public void setHonorPoints(int honorPoints) {
        this.honorPoints = honorPoints;
    }

    public int getBraveryPoints() {
        return braveryPoints;
    }

    public void setBraveryPoints(int braveryPoints) {
        this.braveryPoints = braveryPoints;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobilityPoints=" + nobilityPoints +
                ", honorPoints=" + honorPoints +
                ", braveryPoints=" + braveryPoints +
                '}';
    }
}
