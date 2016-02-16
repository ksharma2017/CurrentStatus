/**
 @name Kartikeya Sharma
 @course Advanced Topics in Computer Science
 @teacher Mr. Burkhart
 @version 1.0
 */

import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Netflix
{
    public String[] movies;
    public Vector<Vector> main;
    public Vector<Integer> scores;
    
    public Netflix{
        movies = null;
        main = null;
        readCSV();
    }
    
    public void readCSV(){
        String pathname = "Sheet1.csv";
        File file = new File(pathname);
        Scanner input = null;
        try
        {
            input = new Scanner(file);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(" Cannot open " + pathname );
            System.exit(1);
        }
        
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
    }
    
    
    
    
    
}