public class Bat implements Tradable, Domesticatable{
    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String sound() {
        return "moo";
    }
}
