public class Transport {

    private String name;
    private int seatCount;

    public Transport() {
        System.out.println("Transport object is being created");
    }

    public void setSeatCount(int number) {
        if (number <= 100) {
            this.seatCount = number;
            System.out.println("Seat count has been set.");
        } else {
            System.out.println("Seat count has NOT been set - number of seats too large. Choose fewer number of seats.");
        }
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void move () {
        System.out.println("Transport is moving");
    }
    public void options () {
        System.out.println("I can move back and forward");
    }



}

