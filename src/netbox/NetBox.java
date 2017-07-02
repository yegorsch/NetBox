/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbox;

import javax.swing.JFrame;

/**
 *
 * @author egor
 */
public class NetBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               
                JFrame frame = new JFrame("LoginForm");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new LoginForm());
                frame.pack();
                frame.setVisible(true);
            }
        });

    }

}
