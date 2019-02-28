package Structure.Adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;


    public  MediaPlayerAdapter(String type) {
        if(type.equalsIgnoreCase("mp4")){
            this.advancedMediaPlayer=new Mp4Player();
        }else{
            this.advancedMediaPlayer=new Mp5Player();
        }

    }

    @Override
    public void play(String type) {
        if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4();
        }else if(type.equalsIgnoreCase("mp5")){
            advancedMediaPlayer.playMp5();
        }

    }
}
