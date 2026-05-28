package OOP;

//Multiple interfaces
interface Camera {
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera,MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("picture is capture through the smartphone's camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing!!");
    }
}
public class Demo{
    static void main() {
        SmartPhone s = new SmartPhone();
        s.takePhoto();
        s.playMusic();
    }
}
