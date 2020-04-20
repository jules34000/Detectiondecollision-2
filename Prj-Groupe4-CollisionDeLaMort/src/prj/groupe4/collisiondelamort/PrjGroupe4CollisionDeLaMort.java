/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj.groupe4.collisiondelamort;

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrjGroupe4CollisionDeLaMort {

   

 
    public void main(String[] args) {
        int valeurstest[][] = { {0,2},{1,3} };
        Polygone A = new Polygone(valeurstest);
        System.out.print(A.toString());
    }

}
