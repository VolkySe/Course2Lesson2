import java.util.Objects;

class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String printDescription() {
        return "Студент " + getName() + " обладает силой магии, равной " + getMagicPower()
                + " и может трансгрессировать на дистанцию " + getTransgressionDistance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicPower == hogwarts.magicPower && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magicPower, transgressionDistance);
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.magicPower + student1.transgressionDistance > student2.magicPower + student2.transgressionDistance) {
            System.out.println(student1.name + " лучше, чем " + student2.name);
        } else if (student1.magicPower + student1.transgressionDistance < student2.magicPower + student2.transgressionDistance) {
            System.out.println(student2.name + " лучше, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны по силе магии и трансгрессии.");
        }

    }
}
