package frj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App monApp = new App();
        System.out.println(monApp.max(4,5));
    }
    public int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
/*
package frj;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
 
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
 
import java.util.Iterator;
import com.opencsv.CSVReader;
 
public class App 
{   
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Ceci est ma modification");
        App monApp = new App();
        System.out.println(monApp.max(4,5));
         
        final int monmax = 0;
        //int monmax = 0;
        try
        {
            CSVReader reader = new CSVReader(new FileReader("data.csv"));
            try
            {
                List<String[]> myEntries = reader.readAll();
                Iterator<String[]> iterator = myEntries.iterator();
                iterator.next(); 
                 
                /*
                while (iterator.hasNext()) 
                {
                    String[] entree = iterator.next();
                     
                    for(int i=0; i<entree.length; i++)
                    {
                        try
                        {
                            if(Integer.parseInt(entree[i]) > monmax)
                            {
                                System.out.println("Nombre courant : "+Integer.parseInt(entree[i]));
                                monmax = Integer.parseInt(entree[i]);
                            }
                        }
                        catch (java.lang.NumberFormatException e)
                        {
                            continue;
                        }
                    }
                }
                System.out.println("Age maximum : "+monmax);
                */
                 
                /*
                while (iterator.hasNext()) 
                {
                    String[] entree = iterator.next();
                     
                    for(int i=0; i<entree.length; i++)
                    {
                        try
                        {
                            System.out.println("Nombre courant : "+Integer.parseInt(entree[i]));
                            monmax = monApp.max(monmax, Integer.parseInt(entree[i]));
                        }
                        catch (java.lang.NumberFormatException e)
                        {
                            continue;
                        }
                    }                    
                }
                System.out.println("Age maximum : "+monmax);
                
                 
                while(iterator.hasNext())
                {
                    String[] entree = iterator.next();
                    List list       = Arrays.asList(entree);
                     
                    Vector<String> out = new Vector<String>();
                    Predicate predicat = new Predicate()
                    {
                        public boolean evaluate(Object object)
                        {
                            try
                            {
                                return Integer.parseInt((String) object) > monmax;
                            }
                            catch (java.lang.NumberFormatException e)
                            {
                                return false;
                            }
                        }
                    };
                    CollectionUtils.select(list, predicat, out);
                    System.out.println("OUT : " + out);
                }
            }
 
            catch (java.io.IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch (java.io.FileNotFoundException ex)  
        {
            System.out.println(ex.getMessage());
        }
    }
     
    public int max(int a, int b)
    {
        return a > b ? a : b;
        //return a; // Un stagiaire est passe par la
    }
}*/