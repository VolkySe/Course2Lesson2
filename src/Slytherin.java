import java.util.Objects;

class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String printDescription() {
        return super.printDescription() + ", решителен на " + getDetermination()
                + ", обладает хитростью " + getCunning()  + ", амбициозен на " + getAmbition()
                + ", находчив на " + getResourcefulness() +" и жаден до власти " +getThirstForPower();
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPower);
    }

    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstForPower;
        int sum2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstForPower;
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName() );
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName() );
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны в Слизерине.");
        }
    }
}