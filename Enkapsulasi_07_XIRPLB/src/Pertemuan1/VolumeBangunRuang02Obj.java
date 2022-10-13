/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class VolumeBangunRuang02Obj {
    public static void main (String [] args ){
       VolumeBangunRuang02  kubus = new  VolumeBangunRuang02();
        
        kubus.setInput1(JOptionPane.showInputDialog("Masukan sisi pertama:"));
        kubus.setInput2(JOptionPane.showInputDialog("Masukan sisi kedua:"));
        kubus.setInput3( JOptionPane.showInputDialog("Masukan sisi ketiga:"));
        
        kubus.menghitung();
        
}
}