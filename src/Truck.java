

public class Truck extends Transport {

    private boolean isLoaded;

    public Truck() {

    }

    public Truck(float speed, int weight, String color, byte[] coordinate) {

        super(speed, weight, color, coordinate);

    }

    public Truck( float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {

        super(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;

}

    @Override
    public void setValues(float speed, int weight, String color, byte[] coordinate) {

        super.setValues(speed, weight, color, coordinate);
        System.out.println("overrited From truck class");


    }

    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {

        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
        System.out.println("Simple From truck class");

    }


        public void setLoaded(boolean isLoaded){
        this.isLoaded = isLoaded;
    }

    public String getLoaded(boolean isLoaded){

        if(isLoaded){
            return "Truck is loaded";
        } else {
            return "Truck is empty";
        }

    }

}
