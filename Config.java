import greenfoot.*;
import java.sql.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Config here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Config extends World
{

    /**
     * Constructor for objects of class Config.
     * 
     */
    public Config()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
        
    }
    Connection conn = null;
    public static Connection dbConnector(){
        try {
                String url = "jdbc:mysql://localhost:3307/uasalgo";
		String user = "root";
		String pass = "";
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		return DriverManager.getConnection(url, user, pass);
		}catch(Exception e){
		}
	return null;
    }
}
