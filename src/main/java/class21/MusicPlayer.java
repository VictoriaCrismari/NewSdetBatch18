package class21;

public abstract class MusicPlayer {
    /*Task1) Music Player System: Create a class MusicPlayer with methods like
    play(), pause(), stop(), and fields such as currentTrack and volume.
    Implement subclasses for different types of music players, like MP3Player, CDPlayer,
     and StreamingPlayer, each with their unique implementations of the
     play() method (e.g., streaming from the internet, playing from a CD).
     */
    private String currentTrack;
    private int volume;
    MusicPlayer(String currentTrack,int volume){
        this.currentTrack=currentTrack;
        this.volume=volume;
    }
    void printInfo(){
        System.out.println(currentTrack+" "+volume);
    }
    abstract void play();
    void pause(){
        System.out.println("Music is paused");
    }
    void stop(){
        System.out.println("Music is stopped");
    }
}
class MP3Player extends MusicPlayer{
    MP3Player(String currentTrack,int volume){
        super(currentTrack, volume);
    }

    @Override
    void play() {
        System.out.println("Playing music from a memory card");
    }
}
class CDPlayer extends MusicPlayer{
    CDPlayer(String currentTrack,int volume){
        super(currentTrack, volume);}
        void play(){
            System.out.println("Playing music from a CD");
        }
}
class StreamingPlayer extends MusicPlayer{
    StreamingPlayer(String currentTrack,int volume){
        super(currentTrack, volume);}
        void play(){
            System.out.println("Streaming music from the internet");
        }
    }
    class MusicPlayerTester{
        public static void main(String[] args) {
            MusicPlayer [] arr={new MP3Player("White Christmas",12),
            new CDPlayer("Last Christmas",14),
                    new StreamingPlayer("Jingle Bell Rock",17)};
                    for(MusicPlayer m:arr){
                        m.printInfo();
                        m.play();
                        m.pause();
                        m.stop();
                    }
        }
    }


