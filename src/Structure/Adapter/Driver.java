package Structure.Adapter;

public class Driver {

    public static void main(String[] args){

        MediaPlayer mediaPlayer=new Mp3Player();

        mediaPlayer.play("mp3");

        mediaPlayer.play("mp4");

        mediaPlayer.play("mp5");

        mediaPlayer.play("mp8");








    }
}
