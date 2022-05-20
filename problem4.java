//fourth option
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner inSS = null;
        String[] material = new String[4];
        String MATERIAL;    //input string
        String[] colour = new String[3];
        String COLOUR;      //input string
        int i;

        MATERIAL = "COTTON CASHMERE ALPACA SATIN";

        inSS = new Scanner(MATERIAL);

        for(i=0; i<4; ++i) {
            material[i] = inSS.next();
            System.out.println(material[i]);
        }

        COLOUR = "RED HOTPINK BURGUNDY";

        inSS = new Scanner(COLOUR);

        for(i=0; i<3; ++i) {
            colour[i] = inSS.next();
            System.out.println(colour[i]);
        }

        
        
       inSS.close();
    }
    
}
