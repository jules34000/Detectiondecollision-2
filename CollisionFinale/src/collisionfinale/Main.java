/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collisionfinale;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.*;
/**
 *
 * @author Ewen
 */
public class Main {
    public static void main (String[] args){
        System.out.println("test");
        int xValues2[] = { 10,50,50,10 };
        int yValues2[] = { 10, 10, 100, 100};
        int xValues1[] = { 10, 25, 200, 420 };
        int yValues1[] = { 100, 200, 300, 400 };
        Polygone polygon1 = new Polygone( xValues1, yValues1, 3 );
        Polygone polygon2 = new Polygone( xValues2, yValues2, 3 );
        Polygone[] listePolygones = {polygon1, polygon2};
        Scene SceneA = new Scene (1080 ,1920 , listePolygones );
        SceneA.dessiner(500,600,listePolygones);
        System.out.print(polygon1.toString());
    }
}
