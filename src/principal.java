import Vista.Principal;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
/**
 *
 * @author Santiago
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal window = new Principal();
        centrar(window);
        window.setVisible(true);
    }
    
    public static void centrar(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    
}
