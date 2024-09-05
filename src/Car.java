

public class Car extends Transport implements Ilights {
    // создание класса вложеного обьектаа
    public Engine engine = new Engine();

    private boolean isOn = false;

    //конструктор по умолчанию
    public Car () { }

    // Конструктор класса Car, который вызывает конструктор родительского класса Transport
    public Car(float speed, int weight, String color, byte[] coordinates) {
        super(speed, weight, color, coordinates); // Вызов конструктора суперкласса Transport с соответствующими параметрами
    }

    // реализация обстрактного клаасса
    @Override
    public void moveObjec(float speed) {
        System.out.println("car is moving on this speed:" + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("We just blinked with lights");
    }

    public boolean isOn() {
        return isOn;
    }
}
