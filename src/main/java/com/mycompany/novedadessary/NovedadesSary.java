/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.novedadessary;

import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.novedadessary.Views.Login;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Misae
 */
public class NovedadesSary {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        try {
            // Estilo tipo Cupertino Light
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("No se pudo cargar FlatLaf");
        }

        SwingUtilities.invokeLater(() -> {
            Login objLogin = new Login();
            objLogin.setLocationRelativeTo(null);
            objLogin.setVisible(true);
            //new Login().setLocationRelativeTo(null);
            //new Login().setVisible(true);
        });
    }
}
