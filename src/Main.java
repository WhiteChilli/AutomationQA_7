public class Main {
    public static void main(String[] args) {

        Transport train = new Transport();
        train.setName("Train from France to Germany");
        train.setSeatCount(45);

        String trainName = train.getName();
        int trainCapacity = train.getSeatCount();
    }
}