import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        /* Only read .wav audios */
            Scanner scanner = new Scanner(System.in);

            File file = new File("audio.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Input -> ");

                response = scanner.next();
                response = response.toUpperCase();
                switch (response){
                        case("P"): clip.start();
                        break;
                        case("S"): clip.stop();
                        break;
                        case("R"): clip.setMicrosecondPosition(0);
                        break;
                        case("Q"): clip.close();
                        break;
                        default: System.out.println("Not a valid response");
                }
            }
    System.out.println("Have a nice day!");
    }
}