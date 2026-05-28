package basics;
//interface Vehicle{
//     void start();
//     void stop();
//}
//class Car implements Vehicle{
//    public void start(){
//        System.out.println("Car is starting");
//    }
//    public void stop(){
//        System.out.println("car is stopping");
//    }
//}
//
//class Bike implements Vehicle{
//    public void start(){
//        System.out.println("Bike is starting");
//    }
//    public void stop(){
//        System.out.println("Bike is stopping");
//    }
//}
//
//public  class Demo {
//    static void main() {
//       Car c = new Car();
//       c.start();
//       Bike b = new Bike();
//       b.start();
//
//    }
//}
//interface Camera {
//    void takePhoto();
//}
//interface MusicPlayer{
//    void playMusic();
//}
//class SmartPhone implements Camera,MusicPlayer{
//    @Override
//    public void takePhoto() {
//        System.out.println("picture is capture through the smartphone's camera");
//    }
//
//    @Override
//    public void playMusic() {
//        System.out.println("Music is playing!!");
//    }
//}
//public class Demo{
//    static void main() {
//        SmartPhone s = new SmartPhone();
//        s.takePhoto();
//        s.playMusic();
//    }
//    }
interface Media{
    abstract void play();
    default void pause(){
        System.out.println("pause the video(default implementation)");
    }
}
class VideoPlayer implements Media{
    @Override
    public void play() {
        System.out.println("video is playing!!");
    }
}
public class Demo{
    static void main() {
        VideoPlayer v = new VideoPlayer();
        v.pause();
        v.play();
    }
}
