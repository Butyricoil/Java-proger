

public abstract class Transport {

    // Поля для хранения скорости, веса, цвета и координат
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates;

    // Конструктор по умолчанию
    public Transport() {

    }

    // Конструктор с параметрами скорости, веса, цвета и координат
    public Transport(float speed, int weight, String color, byte[] coordinates) {
        System.out.println("object created");
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
//        System.out.println(getValues()); // Комментарий убран для предотвращения вывода значений при создании объекта
    }

    //обстрактный метод
    public abstract void moveObjec(float speed);

    // Конструктор с параметрами веса и координат
    public Transport(int weight, byte[] coordinates) {
        System.out.println("object created");
        this.weight = weight;
        this.coordinates = coordinates;
//        System.out.println(getValues()); // Комментарий убран для предотвращения вывода значений при создании объекта
    }

    // Метод для установки значений полей
    public void setValues(float speed, int weight, String color, byte[] coordinates) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    // Метод для получения строкового представления значений полей
    public String getValues() {

        // Формирование строки с основной информацией
        String info = ("Speed: " + speed + " Weight: " + weight + " Color: " + color + " Coordinates: " + coordinates);

        // Формирование строки с информацией о координатах
        String infoCoordinates = ("Coordinates:\n");

        // Добавление координат в строку
        for(int i = 0; i < coordinates.length; i++) {
            infoCoordinates += coordinates[i] + "\n";
        }

        // Возвращение полной строки с информацией
        return info + infoCoordinates;
    }
}
