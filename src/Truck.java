public class Truck extends Transport {

    // Поле, указывающее загружен ли грузовик
    private boolean isLoaded;

    // Конструктор по умолчанию
    public Truck() {

    }

    // Конструктор с параметрами скорости, веса, цвета и координат
    public Truck(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);
    }

    // Конструктор с дополнительным параметром isLoaded
    public Truck(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    // Переопределённый метод setValues из класса Transport
    @Override
    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        super.setValues(speed, weight, color, coordinate);
        System.out.println("overrited From truck class");
    }

    // Перегруженный метод setValues с дополнительным параметром isLoaded
    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
        System.out.println("Simple From truck class");
    }

    // Метод для установки значения поля isLoaded
    public void setLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    // Метод для получения статуса загрузки грузовика
    public String getLoaded(boolean isLoaded) {
        if(isLoaded) {
            return "Truck is loaded";
        } else {
            return "Truck is empty";
        }
    }

}
