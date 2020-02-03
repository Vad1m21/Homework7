package player;

public class PlayerFive extends ExpensivePlayer {

    private final int price;
    private String [] playList = {"The best song","Good song","Super song"};


    public PlayerFive(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


      public void playSong() {
        String song = playList[0];
          System.out.println("Playing: "+ song);

    }

     public  void playAllSong() {
        for(int i = playList.length-1; i >= 0 ;i-- ){
            System.out.println("Playing:" + playList[i]);
        }
    }
}
