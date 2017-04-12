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
import com.opencsv.CSVWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App monApp = new App();
        //System.out.println(monApp.max(4,5));
        //assertEquals(5, monApp.max(4, 5));
        //assertEquals(4, monApp.max(5, 4));
        
        
        try
        {
	        CSVReader reader = new CSVReader(new FileReader("data.csv"));
	        try
            {
		        List<String[]> myEntries = reader.readAll();
		        Iterator<String[]> iterator = myEntries.iterator();
		        iterator.next(); 
		        final int Max = 0;
		        int monMax = 0;
		         
		        while (iterator.hasNext()) 
		        {
		            String[] entree = iterator.next();
		             
		            for(int i=0; i<entree.length; i++)
		            {
		            	System.out.println("Nombre courant : "+Integer.parseInt(entree[i]));
		                monMax = monApp.max(Max, Integer.parseInt(entree[i]));
		                
		            }
		            
		        }
		        //Max = monMax;
		        System.out.println("Nombre max : "+Max);
		        
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
		                        return Integer.parseInt((String) object) > Max;
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
    	//return a; //Pourquoi on a laissé le stagiaire toucher à ça ?
    }
}