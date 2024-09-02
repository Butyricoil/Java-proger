

public class Truck extends Transport {

    private boolean isLoaded;

    public Truck( int weight, byte[] coordinate) {

        super(weight, coordinate);

    }
    public Truck( int weight, byte[] coordinate, boolean isLoade) {

        super(weight, coordinate);

    }

    public void setLoaded(boolean isLoaded){
        this.isLoaded = isLoaded;
    }

    public void getLoaded(){

        if(isLoaded){
            System.out.println("Truck is loaded");
        } else {
            System.out.println("Truck is empty");
        }

    }

}
