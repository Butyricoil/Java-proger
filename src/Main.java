import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Byte> numbers = new ArrayList<>();
        numbers.add((byte) 1);
        numbers.add((byte) 2);
        numbers.add((byte) 32);
        LinkedList<Float> numbers2 = new LinkedList<>();
        numbers2.add(1.2f);
        System.out.println(numbers);

        // Создание объекта класса Car с использованием конструктора
        Car car = new Car(250.0f, 1200, "white", new byte[] {0, 0, 0});

        // Создание объекта класса Truck с использованием конструктора
        Truck ram = new Truck(250.0f, 1200, "white", new byte[] {0, 0, 0});

        // Установка новых значений для объекта Truck, включая статус загрузки
        ram.setValues(250.0f, 1200, "white", new byte[] {100, 0, 100}, true);

        // Получение и вывод значений объекта Truck
        ram.getValues();
    }
}
