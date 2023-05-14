/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.a3project.projetcta3.view;

import java.awt.Dialog.ModalityType;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class Mensagens extends Exception {

    Mensagens(String msg) {
        JOptionPane optionPane = new JOptionPane(msg, JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Mensagem");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
