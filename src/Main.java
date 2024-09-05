import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Создание объекта класса Car с использованием конструктора
        Car bmw = new Car(250.0f, 1200, "white", new byte[] {0, 0, 0});

        // Создание объекта класса Truck с использованием конструктора
        Truck ram = new Truck(250.0f, 1200, "white", new byte[] {0, 0, 0});

        // Установка новых значений для объекта Truck, включая статус загрузки
        ram.setValues(250.0f, 1200, "white", new byte[] {100, 0, 100}, true);

        // Получение и вывод значений объекта Truck
        ram.getValues();

        bmw.engine.info();
        ram.engine.info();
    }
}
