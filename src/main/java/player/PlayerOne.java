package player;

public class PlayerOne extends CheaperPlayer {

    private final int price;

    public PlayerOne(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void playSong(String song) {

        System.out.println("Playing:" + song);


    }


}
