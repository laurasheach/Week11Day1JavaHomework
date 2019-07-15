public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int drinkWater(){
        return this.volume - 10;
    }

    public int emptyBottle(){
       this.volume = 0;
       return this.volume;
    }

    public int fillBottle(){
        this.volume = 100;
        return this.volume;
    }
}
