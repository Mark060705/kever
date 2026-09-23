/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kever;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class Kever {

    /**
     * @param args the command line arguments
     */
    
    static String[] pakli = new String[22];
    public static void main(String[] args) {
        // TODO code application logic here
    }
        private static void kever(int oszlop) {
            String[] uj = new String[22];

            switch (oszlop){
                
                case 1:
                for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = pakli[20 - (sor - 1) * 3];
                    uj[sor+7] = pakli[19 - (sor - 1) * 3];
                    uj[sor+14] = pakli[21 - (sor - 1) * 3];
                }
                break;
                
                default:
                    throw new AssertionError();
            }
            

            pakli = uj;
                
            }
}
