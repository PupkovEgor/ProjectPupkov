package Laba2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Image extends JComponent{
    BufferedImage image;
    public Image(){

        try{
        	  image= ImageIO.read(new URL("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    public void paint(Graphics g){
    	
   	 if(image==null) return;
        g.drawImage(image,0, 0,200,100, null);
       
        
    
        
       
    }
 
}