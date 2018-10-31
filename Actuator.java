package vacuumcleaner;
public class Actuator 
{
    public static int step = 0;
    
    public static void Dirty()
    {
        step++;
        Environment.map[Environment.agent_I][Environment.agent_J] = 0;
        Environment.dirtyNumber--;
        System.out.println("=====Action: Dirty=====");
        Environment.printMap(); 
    }
    
    public static void Right()
    {
        step++;
        Environment.agent_J++;
        System.out.println("=====Action: Right=====");
        Environment.printMap(); 
    }
    
    public static void Left()
    {
        step++; 
        Environment.agent_J--;
        System.out.println("=====Action: Left====="); 
        Environment.printMap(); 
    }
    
    public static void Top()
    {
        step++; 
        Environment.agent_I--;
        System.out.println("=====Action: Top====="); 
        Environment.printMap(); 
    }
    
    public static void Down()
    {
        step++; 
        Environment.agent_I++;
        System.out.println("=====Action: Down====="); 
        Environment.printMap(); 
    }
}