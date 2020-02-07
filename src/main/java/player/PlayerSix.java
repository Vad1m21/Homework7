package player;



import java.util.Random;



public class PlayerSix extends ExpensivePlayer {

    private final int price;
    private String[] playList;

    public PlayerSix(int price,String [] playList) {
        this.price = price;
        this.playList = playList;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public void playSong() {
        String song = playList[0];
        System.out.println("Playing: " + song);
    }

    @Override
    public void playAllSong() {
        for (String str : playList
        ) {
            System.out.println("Playing: " + str);
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < playList.length; i++) {
            int num =i + random.nextInt(playList.length - i);
            String temp = playList[i];
            playList[i] = playList[num];
            playList[num] = temp;
        }


    }
}
