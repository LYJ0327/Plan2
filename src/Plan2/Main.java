package Plan2;

import Plan2.Person.Person;
import Plan2.Transport.Airship;
import Plan2.Transport.Hotballon;
/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/18 11:05
 * @Version: 1.0
 * @Modified by:
 */
public class Main {
    public static void main(String[] args){
        Person lisa=new Person("0327");

        Airship lisaAirship = new Airship( );
        lisaAirship.setId("1997");
        Hotballon lisaHotbollon=new Hotballon( );
        lisaHotbollon.setId("0808");

        lisa.driveTransport(lisaAirship);
        lisa.driveTransport(lisaHotbollon);
    }
}
