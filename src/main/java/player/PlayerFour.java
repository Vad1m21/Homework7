package player;

public class PlayerFour extends ExpensivePlayer{

    private final int price;
    private String [] playList = {"The best song","Good song","Super song"};


    public PlayerFour(int price) {
        this.price = price;
    }



    public int getPrice() {
        return price;
    }


    public void playSong() {
        String song = playList[playList.length-1];
        System.out.println("Playing: "+ song);

    }

    public  void playAllSong() {
        for (String str: playList){
            System.out.println("Playing: "+str);
        }
    }
}
