/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author gipao
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] sa = {"tom", "jerry"};
        for (int x = 0; x < 3; x++) {
            for (String s : sa) {
                System.out.println(x + " " + s);
                if (x == 1) {
                    break;
                }
            }
            
        }
        System.out.println("\n\n\n\n\n");
        for (int x = 0; x < 3; x++) {
        for (int i = 0; i < sa.length; i++) {
            System.out.println(x + " " + sa [i]);
            if (x == 1) {
                break;
            }
        } 
        }
        
        System.out.println("\n\n\n\n\n");
        
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println(((c++ + --a) * b));

    }
}
