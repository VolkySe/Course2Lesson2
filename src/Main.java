public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 50, 95, 90, 85);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 40, 85, 80, 75);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 95, 40, 88, 70, 70);

        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 85, 45, 90, 85, 80);
        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 75, 35, 80, 75, 70);
        Hufflepuff jastin = new Hufflepuff("Джастин Финч-Флетчли", 75, 35, 80, 75, 70);

        Ravenclaw padma = new Ravenclaw("Падма Патил", 88, 42, 92, 88, 85, 90);
        Ravenclaw chgou = new Ravenclaw("Чжоу Чанг", 82, 38, 88, 84, 80, 85);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 82, 38, 88, 84, 80, 85);

        Slytherin draco = new Slytherin("Драко Малфой", 87, 47, 90, 85, 88, 82, 90);
        Slytherin gregory = new Slytherin("Грегори Гойл", 77, 37, 80, 75, 78, 72, 80);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 70, 37, 90, 70, 68, 62, 90);

        System.out.println(harry.printDescription());
        System.out.println(ron.printDescription());
        System.out.println(germiona.printDescription());
        System.out.println(cedric.printDescription());
        System.out.println(zacharias.printDescription());
        System.out.println(jastin.printDescription());
        System.out.println(padma.printDescription());
        System.out.println(chgou.printDescription());
        System.out.println(markus.printDescription());
        System.out.println(draco.printDescription());
        System.out.println(gregory.printDescription());
        System.out.println(graham.printDescription());

        Gryffindor.compareGryffindorStudents(harry, ron);
        Hufflepuff.compareHufflepuffStudents(cedric, zacharias);
        Ravenclaw.compareRavenclawStudents(padma, chgou);
        Slytherin.compareSlytherinStudents(draco, gregory);

        Hogwarts.compareStudents(harry, draco);
    }

}