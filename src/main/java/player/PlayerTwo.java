package player;

public class PlayerTwo extends CheaperPlayer {

    private final int price;

    public PlayerTwo(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void playSong(String song) {

        System.out.println("Error!");
    }


}
