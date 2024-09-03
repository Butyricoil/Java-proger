

public class Car extends Transport {

    // Конструктор класса Car, который вызывает конструктор родительского класса Transport
    public Car(float speed, int weight, String color, byte[] coordinates) {
        super(speed, weight, color, coordinates); // Вызов конструктора суперкласса Transport с соответствующими параметрами
    }

    @Override
    public void moveObjec(float speed) {
        System.out.println("car is moving on this speed:" + speed);
    };


}
