import greenfoot.*;
import java.sql.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        gerak();
        atas();
        bawah();
        kiri();
        kanan();// Add your action code here.
    }
    
    public void gerak()
    {
        if(Greenfoot.isKeyDown("up")){setLocation(getX(), getY()-10);}
        if(Greenfoot.isKeyDown("down")){setLocation(getX(), getY()+10);}
        if(Greenfoot.isKeyDown("left")){setLocation(getX()-10, getY());}
        if(Greenfoot.isKeyDown("right")){setLocation(getX()+10, getY());}
        
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
    
    public void atas()
    {
        setLocation(getX(), getY()-2);
    }
    
    public void bawah()
    {
        setLocation(getX(), getY()+2);
    }
    
    public void kiri()
    {
        setLocation(getX()-2, getY());
    }
    
    public void kanan()
    {
        setLocation(getX()+2, getY());
    }
}
