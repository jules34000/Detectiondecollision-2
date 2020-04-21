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
        int xValues2[] = { 70, 90, 100, 80, 70, 65, 60 };
        int yValues2[] = { 100, 100, 400, 110, 130, 110, 90 };
        int xValues1[] = { 10, 30, 100, 80, 70, 65, 40 };
        int yValues1[] = { 100, 100, 50, 110, 50, 110, 90 };
        Polygon polygon1 = new Polygon( xValues1, yValues1, 6 );
        Polygon polygon2 = new Polygon( xValues2, yValues2, 6 );
        Polygon[] listePolygones = {polygon1, polygon2};
        Scene SceneA = new Scene (500 ,600 , listePolygones );
        SceneA.dessiner(500,600,listePolygones);
    }
}
