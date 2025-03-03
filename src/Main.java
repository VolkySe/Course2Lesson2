import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person[] persons = {new Gryffindor("Гарри", "Поттер", 10,10, 20, 20, 20),
                new Gryffindor("Гермиона", "Грейнджер", 10,10, 20, 20, 20),
                new Gryffindor("Рон", "Уизли", 10,10, 20, 20, 20),
                new Ravenclaw("Чжоу", "Чанг", 10,10, 20, 20, 20, 30),
                new Ravenclaw("Падма", "Патил", 10,10, 20, 20, 20, 30),
                new Ravenclaw("Драко", "Малфой", 10,10, 20, 20, 20, 30),
                new Slytherin("Грэхэм", "Монтегю", 10,10, 20, 20, 20,30,40),
                new Slytherin("Грегори", "Гойл", 10,10, 20, 20, 20,30,40),
                new Hufflepuff("Захария", "Смит", 10,10, 20, 20, 20),
                new Hufflepuff("Джастин", "Финч-Флетчли", 10,10, 20, 20, 20),
                new Hufflepuff("Седрик", "Диггори", 10,10, 20, 20, 20)
            };
        System.out.println(Arrays.toString(persons));
    }

}