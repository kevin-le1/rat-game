/* This file runs the entirety of the game, where it creates objects from the
implementation and audio implementation class. Additionally, it takes user
input, which will be the name of the rat. This code runs the game and audio
until the "win" or "lose" screen has been achieved.*/

public class RatGame {
    public static void main(String[] args) {
        // creates an object of the implementation class
        Implementation game = new Implementation();
        // creates an object of the audio implementation class
        AudioImplementation playSong = new AudioImplementation();
        // plays the song using the playSong object to call the audio
        // implementation class
        playSong.playSong("backgroundmusic.wav");
        // the two lines below take user inputs
        StdOut.println("Please input the rat's name:");
        StdIn.readString();
        // starts the game phrase using the game object to call the
        // implementation class
        game.contract();
    }
}
