package academy.devdojo.maratonajava.javacore.comportamento.dominio;

public class Car {

    private String name = "Audi";
    private String color;
    private int year;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name: '" + name + '\'' +
                " | Color: '" + color + '\'' +
                " | Year: " + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
