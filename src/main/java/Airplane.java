

public class Airplane implements Drivable, Tradable{
    private int maxSpeed;

    public Airplane() { this.maxSpeed = 200; }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
