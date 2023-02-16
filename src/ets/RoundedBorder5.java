/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ets;

import java.awt.*;
import javax.swing.border.Border;

public class RoundedBorder5 implements Border{
    final int radius;
        
        RoundedBorder5(int radius) {
            this.radius = radius;
        }
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius-20, this.radius-20, this.radius-20, this.radius-20);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(new Color(153,153,255));
            g.fillRoundRect(x, y, width, height, radius, radius);
        }
}
