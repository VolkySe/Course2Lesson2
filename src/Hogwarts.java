public class Hogwarts extends Person {
    protected int magicPower;
    protected int transgressionDistance;

    public Hogwarts(String name, String surname, int magicPower, int transgressionDistance) {
        super(name, surname);
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", фамилия: " + surname +
                ". Сила магии: " + magicPower + ", дистанция трансгрессии: " + transgressionDistance;
    }
}
