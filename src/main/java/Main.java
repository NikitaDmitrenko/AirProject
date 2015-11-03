import Dispatchers.DispathersCenter;
import model.aircrafts.helicopters.MI17;
import model.aircrafts.helicopters.MI171;
import model.aircrafts.helicopters.MI2;
import model.aircrafts.planes.A300;
import model.aircrafts.planes.B700;
import model.aircrafts.planes.L39;

/**
 * Created by Nikita on 02.11.2015.
 */
public class Main {
    public static void main(String[]args){
        MI2 mi2 = new MI2("UK",50,150,5000,250);
        MI17 mi17 = new MI17("GE",25,120,3000,200);
        MI171 mi171 = new MI171("RU",20,-150,2500,170);
        A300 a300 = new A300("AG",41,0,7000,280);
        B700 b700 = new B700("RE",-50,-140,4500,310);
        L39 l39 = new L39("CH",-26,179,4000,250);
        DispathersCenter dispathersCenter = new DispathersCenter("CENTER_1");
    }
}
