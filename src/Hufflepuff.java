public class Hufflepuff extends Hogwarts{

    private int hardworkingPoints;
    private int loyalPoints;
    private int honestPoints;

    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance,
                     int hardworkingPoints, int loyalPoints, int honestPoints ) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardworkingPoints = hardworkingPoints;
        this.loyalPoints = loyalPoints;
        this.honestPoints = honestPoints;
    }

    public int getHardworkingPoints() {
        return hardworkingPoints;
    }

    public void setHardworkingPoints(int hardworkingPoints) {
        this.hardworkingPoints = hardworkingPoints;
    }

    public int getLoyalPoints() {
        return loyalPoints;
    }

    public void setLoyalPoints(int loyalPoints) {
        this.loyalPoints = loyalPoints;
    }

    public int getHonestPoints() {
        return honestPoints;
    }

    public void setHonestPoints(int honestPoints) {
        this.honestPoints = honestPoints;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworkingPoints=" + hardworkingPoints +
                ", loyalPoints=" + loyalPoints +
                ", honestPoints=" + honestPoints +
                '}';
    }
}
