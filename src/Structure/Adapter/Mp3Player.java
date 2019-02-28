package Structure.Adapter;

public class Mp3Player implements MediaPlayer {

    MediaPlayer mediaPlayer;


    public void play(String type){
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3");
        }else if(type.equalsIgnoreCase("mp4")){
            mediaPlayer=new MediaPlayerAdapter("mp4");
            mediaPlayer.play("mp4");

        }else if(type.equalsIgnoreCase("mp5")){
            mediaPlayer=new MediaPlayerAdapter("mp5");
            mediaPlayer.play("mp5");

        }else{
            System.out.println("Type not supported");
        }

    }
}
