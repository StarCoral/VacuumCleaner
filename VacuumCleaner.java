/**
 *
 * @author StarCoral
 */
package vacuumcleaner;
import java.util.*;
import java.lang.*;
import static vacuumcleaner.Environment.printMap;

public class VacuumCleaner
{
    public static void main(String[] args) 
    {
        Environment.Environment();
        System.out.println("\n***********************************\n");
        while(Environment.dirtyNumber>0 )
        {
            Sensor.Sensor();
           
         //   Environment.printMap();
        }
    }

    
}
