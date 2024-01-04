import java.awt.Dimension;
import java.awt.Toolkit;

public class GetScreenSize {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        System.out.println("Screen width: " + screenWidth + " pixels");
        System.out.println("Screen height: " + screenHeight + " pixels");
    }
}
