public class SchoolAppropriateWords implements Drivable, Domesticatable, Tradable {
    public int maxSpeed;

    public SchoolAppropriateWords() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "I love everyone :)";
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
    public int getPrice() {
        return 10000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
