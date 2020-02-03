package launcher;

import player.*;

import java.util.Scanner;

public class Launcher {
     public String [] playList = {"The best song","Good song","Super song"};
    public void launcherForPlayerOne(){

       PlayerOne playerOne = new PlayerOne(15);
       playerOne.playSong(playList[2]);
    }

    public  void launcherForPlayerTwo(){
        PlayerTwo playerTwo = new PlayerTwo(20);
        playerTwo.playSong(playList[1]);
    }

    public  void launcherForPLayerThree(){
        PlayerThree playerThree = new PlayerThree(30);
        playerThree.playSong();
        playerThree.playAllSong();

    }

    public void launcherForPlayerFour(){
        PlayerFour playerFour = new PlayerFour(35);
        playerFour.playSong();
        playerFour.playAllSong();
    }

    public void launcherForPlayerFive(){

        PlayerFive playerFive = new PlayerFive(40);
        playerFive.playSong();
        playerFive.playAllSong();
    }

    public void launcherForPlayerSix(){
        int randomNumber = 0 + (int)((Math.random()) *2);
        PlayerSix playerSix = new PlayerSix(60);
        playerSix.playSong();
        playerSix.shuffle(randomNumber);
        playerSix.playAllSong();
    }

}
