public class Person {
    //статичное поле
    private static int count;

    public Person() {
        count ++;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void getCount() {
        System.out.println("cout value" + count);
    }
}
