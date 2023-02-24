public class Main {
    public static void main(String[] args) {

        Transport train = new Transport();
        train.setName("Train from France to Germany");
        train.setSeatCount(45);

        String trainName = train.getName();
        System.out.println(trainName);

        int trainCapacity = train.getSeatCount();
        System.out.println(trainCapacity);

        Car ford = new Car();
        ford.options();

        Car bwm = new Car();
        bwm.move();
    }
}