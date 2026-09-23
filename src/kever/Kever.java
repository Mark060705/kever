
package kever;

public class Kever {


    
    static String[] pakli = new String[22];
    public static void main(String[] args) {
        
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
                case 2:
                    for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = pakli[19 - (sor - 1) * 3];
                    uj[sor+7] = pakli[20 - (sor - 1) * 3];
                    uj[sor+14] = pakli[21 - (sor - 1) * 3];
                    }
                    break;
                case 3:
                    for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = pakli[20 - (sor - 1) * 3];
                    uj[sor+7] = pakli[21 - (sor - 1) * 3];
                    uj[sor+14] = pakli[19 - (sor - 1) * 3];
                    }
                break;
                
                default:
                    throw new AssertionError();
            }
            

            pakli = uj;
                
            }
}
