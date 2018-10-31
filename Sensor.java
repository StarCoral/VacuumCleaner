package vacuumcleaner;

import java.util.Random;

public class Sensor 
{
    public static int way = 0;  
    public static int top = 0,down = 0,left = 0,right =0;
    
    public static void Sensor()
    {
        way = top = down = left = right= 0;
        //System.out.println("I: "+Environment.agent_I+" J: "+Environment.agent_J+"   way:  "+way);
        if((Environment.agent_I-1) >=0 && (Environment.agent_I-1) < Environment.size)
        {   
            top = 1;
            if(Environment.map[Environment.agent_I-1][Environment.agent_J] == 1)
            {
                Actuator.Top();     
                Actuator.Dirty();
                way = 1;
            }
        }
       if((Environment.agent_I+1) >=0 && (Environment.agent_I+1) < Environment.size)
        {   
            down =1;
            if(Environment.map[Environment.agent_I+1][Environment.agent_J] == 1)
            {
                Actuator.Down(); 
                Actuator.Dirty();
                way = 2;
            }
        }
         if((Environment.agent_J+1) >=0 && (Environment.agent_J+1) < Environment.size)
        {   
            right =1;
            if(Environment.map[Environment.agent_I][Environment.agent_J+1] == 1)
            {
                Actuator.Right();
                Actuator.Dirty();
                way = 3;
            }
        }
       if((Environment.agent_J-1) >=0 && (Environment.agent_J-1) < Environment.size)
        {   
            left =1;
            if(Environment.map[Environment.agent_I][Environment.agent_J-1] == 1)
            {
                Actuator.Left();
                Actuator.Dirty();
                way = 4;
            }
        }
        
        if(way == 0)
        {
            Random rand = new Random();
            if(top==1 && down == 1 && right == 1 && left==1)
            {    
                int r = rand.nextInt(4);
                switch (r) 
                {
                    case 0:
                        Actuator.Top();
                        break;
                    case 1:
                        Actuator.Down();
                        break;
                    case 2:
                        Actuator.Right();
                        break;
                    default:
                        Actuator.Left();
                        break;
                }
            }
            else if(top==1 && down == 1 && right == 1)
            {
                int r = rand.nextInt(3);
                switch (r) 
                {
                    case 0:
                        Actuator.Top();
                        break;
                    case 1:
                        Actuator.Down();
                        break;
                    default:
                        Actuator.Right();
                        break;
                }
            }
            else if(top==1 && down == 1 && left==1)
            {
                int r = rand.nextInt(3);
                switch (r) 
                {
                    case 0:
                        Actuator.Top();
                        break;
                    case 1:
                        Actuator.Down();
                        break;
                    default:
                        Actuator.Left();
                        break;
                }
            }
            else if(top==1 && right == 1 && left==1)
            {
                int r = rand.nextInt(3);
                switch (r) 
                {
                    case 0:
                        Actuator.Top();
                        break;
                    case 1:
                        Actuator.Right();
                        break;
                    default:
                        Actuator.Left();
                        break;
                }
            }
            else if(right==1 && down == 1 && left==1)
            {
                int r = rand.nextInt(3);
                switch (r) 
                {
                    case 0:
                        Actuator.Right();
                        break;
                    case 1:
                        Actuator.Down();
                        break;
                    default:
                        Actuator.Left();
                        break;
                }
            }
            else if(top == 1 && down==1)
            {
                int r = rand.nextInt(2);
                if(r==1)
                    Actuator.Top();
                else
                    Actuator.Down();
            }  
            else if(top == 1 && right==1)
            {
                int r = rand.nextInt(2);
                if(r==1)
                    Actuator.Top();
                else
                    Actuator.Right();
            }
            else if(top == 1 && left==1)
            {
                int r = rand.nextInt(2);
                if(r==1)
                    Actuator.Top();
                else
                    Actuator.Left();
            }
             else if(down == 1 && left==1)
            {
                int r = rand.nextInt(2);
                if(r==1)
                    Actuator.Down();
                else
                    Actuator.Left();
            }
            else if(down == 1 && right==1)
            {
                int r = rand.nextInt(2);
                if(r==1)
                    Actuator.Down();
                else
                    Actuator.Right();
            } 
            else if(left == 1 && right==1)
            {
                int r = rand.nextInt(2);
                if(r==1)
                    Actuator.Left();
                else
                    Actuator.Right();
            } 
            else if(top==1)
                Actuator.Top();
            else if(down == 1)
                Actuator.Down();
            else if(right == 1)
                Actuator.Right();
            else if(left==1)
                Actuator.Left();
        }
       // System.out.println("I: "+Environment.agent_I+" J: "+Environment.agent_J+"   way:  "+way);
    }
}
