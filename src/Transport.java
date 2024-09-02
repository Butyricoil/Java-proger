public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates;


    public Transport(float speed, int weight, String color, byte[] coordinates){

        System.out.println("object created");
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
        System.out.println(getValues());

    }

    public Transport(int weight, byte[] coordinates){
        System.out.println("object created");
        this.weight = weight;
        this.coordinates = coordinates;
        System.out.println(getValues());
    }


    public void setValues(float speed, int weight, String color, byte[] coordinates){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;

    }


    public String getValues(){

        String info = ("Speed: " + speed + " Weight: " + weight + " Color: " + color + " Coordinates: " + coordinates);

        return info;
    }
}
