/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ets;

import java.awt.*;
import javax.swing.border.Border;

/**
 *
 * @author sahar
 */
public class RoundedBorder2 implements Border{
    final int radius;
        
        RoundedBorder2(int radius) {
            this.radius = radius;
        }
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius, this.radius, this.radius, this.radius);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g;
            Color c1 = new Color(246,121,90);
            Color c2 = new Color(213,22,115);
            GradientPaint gradient = new GradientPaint(0,100,c1,0,700,c2);
            g2.setPaint(gradient);
            g2.fillRoundRect(x, y, width, height, radius, radius);
        }
}
