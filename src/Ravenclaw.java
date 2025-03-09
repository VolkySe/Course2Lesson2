import java.util.Objects;

class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty   ;
    private int fullOfcreativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfcreativity = creativity;
    }

    @Override
    public String printDescription() {
        return super.printDescription() + ", умен на " + getSmart()
                + ", обладает мудростью " + getWise()  + ", остроумием " + getWitty()
                + " и способностью к творчеству на " +getFullOfcreativity();
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfcreativity() {
        return fullOfcreativity;
    }

    public void setFullOfcreativity(int fullOfcreativity) {
        this.fullOfcreativity = fullOfcreativity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return smart == ravenclaw.smart && wise == ravenclaw.wise && witty == ravenclaw.witty && fullOfcreativity == ravenclaw.fullOfcreativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty, fullOfcreativity);
    }

    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.smart + student1.wise + student1.witty + student1.fullOfcreativity;
        int sum2 = student2.smart + student2.wise + student2.witty + student2.fullOfcreativity;
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName() );
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName() );
        } else {
                System.out.println(student1.getName() + " и " + student2.getName() + " равны в Когтевране.");
        }
    }
}