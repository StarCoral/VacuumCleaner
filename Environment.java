package vacuumcleaner;

import java.util.*;
import java.lang.*;

public class Environment
{
    static int size,dirtyNumber=0,agent_I,agent_J;
    static int[][] map;
    
    public static void Environment()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Vacuum-Cleaner World!");       
         System.out.print("Please input the number of matrix size: ");
         
         size = sc.nextInt();
         map = new int[size][size];
         
         initMap();
         agentPosition();
         printMap();
    }

 /*****************Intial:  position of agent*****************/   
    public static void agentPosition()
    {
        Random rand = new Random();
        agent_I = rand.nextInt(size);
        agent_J = rand.nextInt(size);
        
        if(map[agent_I][agent_J]==1)
        {
            dirtyNumber--;
        }
        map[agent_I][agent_J] = 0;
    }
    
 /*****************Intial:  Map*****************/       
    public static void initMap()
    {
         Random rand = new Random();
         for(int i = 0 ; i<size ; i++)
         {
            for(int j = 0 ; j<size ; j++)
            {
                  map[i][j] = rand.nextInt(2);
                  if(map[i][j]==1)
                    dirtyNumber++;
            }
         }
    }
 
 /*****************Ptint:   Map*****************/       
    public static void printMap()
    {
         //Title: Matrix*
         System.out.print("\t");
         for(int t = 0 ; t<size ; t++)
         {
             System.out.print((t+1)+"\t");
         }
         System.out.println();
        
         for(int i=0 ; i<size ; i++)
         {
            System.out.print((i+1)+"\t");       //Title: Matrix
            
            for(int j=0 ; j<size ; j++)
            {
                  if( (agent_I) != i  || (agent_J) != j)
                    System.out.print(map[i][j]+"\t");
                  else
                     System.out.print("A\t"); 
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.print("Dirty Number: "+dirtyNumber);
        System.out.print("\t");
        System.out.println("Agent Position:  ( "+(agent_I+1)+" , "+(agent_J+1)+" )");
        System.out.println("Step: "+Actuator.step);
        
    }
}