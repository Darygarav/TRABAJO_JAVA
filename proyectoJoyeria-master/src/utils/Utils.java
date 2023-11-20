
package utils;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author gustavo gongora ortiz
 */
public class Utils {
    
    private static final String ICON_PATH_FRAME = "/img/icons8-jewel-100.png"; 
    
    public static void cambiarIconoJFrame (JFrame frame){
         try {
            ImageIcon icono = new ImageIcon(Utils.class.getResource(ICON_PATH_FRAME));
            frame.setIconImage(icono.getImage());
        } catch (Exception e) {
            ImageIcon icono = new ImageIcon();
            frame.setIconImage(icono.getImage());
        }
    }
    

    
    
    

    
    
    
}
