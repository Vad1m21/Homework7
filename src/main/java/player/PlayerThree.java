package player;

public class PlayerThree extends ExpensivePlayer{

    private final int price;
    private String [] playList = {"The best song","Good song","Super song"};

    public PlayerThree(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    @Override
   public void playSong() {
        String song = playList[0];
        System.out.println("Playing:"+ song );
    }
    @Override
    public void playAllSong() {
        for (int i = 0;i<playList.length;i++){
            System.out.println("Playing:"+playList[i]);
        }
    }
}