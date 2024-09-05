import DataBase.DB;

public class Main {
    public static void main(String[] args) {
//         Создание объекта класса Car с использованием конструктора
        Car bmw = new Car(250.0f, 1200, "white", new byte[] {0, 0, 0});
//        анонимный класc
        Car flyCar = new Car (250.0f, 1200, "white", new byte[] {0, 0, 0}){
            @Override
            public void moveObjec(float speed) {
                super.moveObjec(speed);

                this.engine.isReady(true);
                System.out.println("car is flying sky high");
            }
        };

//        // Создание объекта класса Truck с использованием конструктора
        Truck ram = new Truck(250.0f, 1200, "white", new byte[] {0, 0, 0});
//
//        // Установка новых значений для объекта Truck, включая статус загрузки
        ram.setValues(250.0f, 1200, "white", new byte[] {100, 0, 100}, true);
//
//        // Получение и вывод значений объекта Truck
        ram.getValues();
        bmw.engine.setValues(true, 6000);
        bmw.engine.info();
        ram.engine.setValues(false, 670000);
//        ram.engine.info();
        flyCar.moveObjec(450);
    }
}
