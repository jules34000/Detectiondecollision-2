/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj.groupe4.collisiondelamort;

/**
 *
 * @author Ewen
 */
public class Polygone {
    int[][] TableauPoints;

        public Polygone(int[][] TableauPoints) {
            this.TableauPoints = TableauPoints;
        }

        public int[][] getTableauPoints() {
            return TableauPoints;
        }

        public String toString() {
            String text = "";
            for (int i=0;i<TableauPoints.length;i++){ 
                text = text +"("+ TableauPoints[i][0]+","+TableauPoints[i][1]+")";
            }
            return text;
        }

    
 public static void main(String[] args) {
        int valeurstest[][] = { {0,2},{1,3} };
        Polygone A = new Polygone(valeurstest);
        System.out.print(A.toString());
    }

}
