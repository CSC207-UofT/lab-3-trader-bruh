public class Rat implements Tradable, Domesticatable, Drivable {
    private int maxSpeed;

    public Rat() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Squerk";
    }

    @Override
    public int getPrice() {
        return 69;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
