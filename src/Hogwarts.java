public class Hogwarts extends Person {
    private int magicPower;
    private int trasgressionDistance;

    public Hogwarts(String name, String surname) {
        super(name, surname);
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrasgressionDistance() {
        return trasgressionDistance;
    }

    public void setTrasgressionDistance(int trasgressionDistance) {
        this.trasgressionDistance = trasgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "magicPower=" + magicPower +
                ", trasgressionDistance=" + trasgressionDistance +
                '}';
    }
}
