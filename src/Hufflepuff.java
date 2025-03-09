import java.util.Objects;

class Hufflepuff extends Hogwarts {
    private int hardWorking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWorking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String printDescription() {
        return super.printDescription() + ", трудолюбив на " + getHardWorking()
                + ", верне на " + getLoyal()  + " и честен на " +getHonest();
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardWorking == that.hardWorking && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardWorking, loyal, honest);
    }

    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.hardWorking + student1.loyal + student1.honest;
        int sum2 = student2.hardWorking + student2.loyal + student2.honest;
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName() );
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName() );
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны в Пуффендуе.");
        }
    }
}