public class Car extends Transport {

    private int vinNumber;
    private int govNumber;

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getGovNumber() {
        return govNumber;
    }

    public void setGovNumber(int govNumber) {
        this.govNumber = govNumber;
    }

    @Override
    public void move() {
//      super.move();
        System.out.println("Car is moving");
    }
}

