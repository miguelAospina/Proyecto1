package GEEK_OUT_MASTERS;

import javax.swing.*;
import java.awt.*;
/**
 * This class is a kind of JLabel used to create a personalized Header for the project
 * @autor Natalia Riaños Horta (2042568) rianos.natalia@correounivalle.edu.co
 * Miguel Ángel Ospina Hernández (2040634) miguel.ospina.hernandez@correounivalle.edu.co
 * @version @version v.1.0.0 date:11/01/2022
 */

public class Header extends JLabel {
    /**
     * Constructor of the Header class
     * @param title String that contains Header text
     * @param colorBackground Color object to be assigned for the Header background
     */

    public Header(String title, Color colorBackground) {
        this.setText(title);
        this.setBackground(colorBackground);
        this.setForeground(new Color(255,255,255));
        this.setFont(new Font(Font.DIALOG,Font.BOLD,20));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(true);

    }
}
