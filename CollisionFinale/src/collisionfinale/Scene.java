/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collisionfinale;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.*;

public class Scene extends JPanel {
    int x;
    int y;
    Polygon[] polygons;

    public Scene(int x, int y, Polygon[] polygons) {
        this.x = x;
        this.y = y;
        this.polygons = polygons;
    }
    
    
    public void paintComponent( Graphics g )
    {
       super.paintComponent( g ); 
 
       // Dessiner les Polygones
       for (int i = 0 ; i<polygons.length ; i++){
           int xValues[] = polygons[i].xpoints;
           int yValues[] = polygons[i].ypoints;
           Polygon polygonA = new Polygon (xValues, yValues , xValues.length);
           g.drawPolygon( polygonA);
       }
                          
 
    }
    public void dessiner(int x,int y,Polygon[] polygons){
         JFrame frame=new JFrame("Polygone et Polyligne")	;
    		 JPanel policePanel=new Scene(x, y, polygons );
    		 frame.add(policePanel);
    		 frame.setSize(800,800);
    		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    		 frame.setVisible(true);
    }
    
}

