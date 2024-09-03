public class Car extends Transport {

    // Конструктор класса Car, который вызывает конструктор родительского класса Transport
    public Car(float speed, int weight, String color, byte[] coordinates) {
        super(speed, weight, color, coordinates); // Вызов конструктора суперкласса Transport с соответствующими параметрами
    }

}
