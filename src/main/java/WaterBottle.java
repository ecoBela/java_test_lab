public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }


    public int haveDrink() {
        return this.volume - 10;
    }

    public int emptyTheBottle() {
        return this.volume - this.volume;
    }
}
