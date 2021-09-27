public class VWBug implements Tradable, Domesticatable, Drivable {
    private int maxSpeed;
    private String color;

    public VWBug() {
        this.color = "yellow";
        this.maxSpeed = 1000;
    }

    public VWBug(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String sound() {
        return "beep beep";
    }

    @Override
    public int getPrice() {
        return -0;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed+=2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed-=2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")" + " painted " + this.color;
    }
}
