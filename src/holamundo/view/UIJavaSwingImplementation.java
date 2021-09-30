/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

import holamundo.controller.View;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 * Class for the implementation of JavaSwing
 *
 * @author Ilia Consuegra Alain Lozano
 */
public class UIJavaSwingImplementation extends javax.swing.JFrame implements View {

    /**
     * Creates new form UIJavaSwingImplementation
     */
    public UIJavaSwingImplementation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method that launches a JOptionPane with the greeting it receives.
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        JOptionPane.showMessageDialog(this, greeting);
        exit(0);
    }

}
