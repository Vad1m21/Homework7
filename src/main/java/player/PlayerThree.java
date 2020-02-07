package player;

import java.util.Arrays;

import static player.PlayList.playList1;

public class PlayerThree extends ExpensivePlayer{

    private final int price;
    private String [] playList;

    public PlayerThree(int price,String [] playList) {
        this.price = price;
        this.playList = playList;
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