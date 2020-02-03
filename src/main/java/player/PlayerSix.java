package player;

public class PlayerSix extends ExpensivePlayer{

    private final int price;
    private String [] playList = {"The best song","Good song","Super song"};

    public PlayerSix(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }


    @Override
    public void playSong() {
    String song = playList[0];
        System.out.println("Playing: "+ song);
    }
    @Override
     public void playAllSong() {
        for (String str: playList
             ) {
            System.out.println("Playing: "+ str);
        }
    }

    public void shuffle(int j){
        for(int z = 0; z <j;z++) {
            for (int i = 0; i < playList.length - 1; i++) {
                String temp = playList[i];
                playList[i] = playList[i + 1];
                playList[i + 1] = temp;
            }
        }
    }
}
