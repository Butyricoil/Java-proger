import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Byte>  numbers = new ArrayList<>();
//        numbers.add((byte) 1);
//        numbers.add((byte) 2);
//        numbers.add((byte) 32);
//
//        LinkedList<Float> numbers= new LinkedList<>();
//        numbers.add(1.2f);
//        System.out.println(numbers);

       // Car car = new Car(250.0f, 1200, "white",new byte[] {0, 0, 0});
       Truck ram =new Truck(250.0f, 1200, "white", new byte[] {0, 0, 0});
       ram.setValues(250.0f, 1200, "white", new byte[] {100, 0, 100},true);
       ram.getValues();

    }
}