
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richie
 */


    /* 
By Bavo Bruylandt (Http://www.realapplets.com")
*/

// and now The inevidable "Hello World" example :)

// tell the compiler where to find the methods you will use. 
// required when you create an applet 
import java.applet.*; 
// required to paint on screen 
import java.awt.*; 

import java.util.Scanner;
 

// the start of an applet - HelloWorld will be the executable class 
// Extends applet means that you will build the code on the standard Applet class 
public class Applet extends java.applet.Applet {
{

// The method that will be automatically called  when the applet is started 
     @Override
      void init() 
     { 
 // It is required but does not need anything. 
     } 
 

// This method gets called when the applet is terminated 
// That's when the user goes to another page or exits the browser. 
     @Override
      void stop() 
     { 
     // no actions needed here now. 
     } 
 

// The standard method that you have to use to paint things on screen 
// This overrides the empty Applet method, you can't called it "display" for example.

     @Override
     public void paint() 
    Object Graphics = null;

     { 
 //method to draw text on screen 
 // String first, then x and y coordinate. 
      g.drawString("Hey hey hey",20,20); 
      g.drawString("Hellooow World",20,40);

     }

} 
 
@Override
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
