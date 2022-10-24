package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

      //myFinch.playTone(20000,5000); //hz, ms
      
      int A3 = 220;
      int B3 = 247;
      int C4 = 262;
      int D4 = 294;
      int E4 = 330;
      int F4 = 349;
      int G4 = 392;
      int G5 = 784;
      int E5 = 659;
      int C5 = 523; 
      int F5 = 698;
      int D5 = 587;
      int B4 = 494;
      int A5 = 880;
      int B5 = 988;
      
      int whole = 1000;
      int half = whole;
      int quarter = half/2;
      int eight = quarter/2;
      
      myFinch.playTone(G5, quarter);
      myFinch.playTone(E5, eight);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(G5, quarter);
      myFinch.playTone(F5, quarter);
      myFinch.playTone(D5, half);
      myFinch.sleep(400);
      myFinch.playTone(F5, quarter);
      myFinch.playTone(D5, eight);
      myFinch.playTone(B4, quarter);
      myFinch.playTone(F5, quarter);
      myFinch.playTone(E5, quarter);
      myFinch.playTone(C5, half);
      myFinch.sleep(400);
      myFinch.playTone(A5, whole);
      myFinch.playTone(B5, eight);
      myFinch.playTone(G5, eight);
      myFinch.playTone(F5, eight);
      myFinch.playTone(G5, whole);
      myFinch.playTone(F5, whole);
      myFinch.playTone(F5, eight);
      myFinch.playTone(E5, eight);
      myFinch.playTone(D5, eight);
      myFinch.playTone(C5, whole);
      myFinch.sleep(400);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(B4, quarter);
      myFinch.playTone(C5, eight);
      myFinch.playTone(G4, whole);
      myFinch.sleep(200);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(B4, quarter);
      myFinch.playTone(C5, eight);
      myFinch.playTone(E5, whole);
      myFinch.sleep(200);
      myFinch.playTone(F5, quarter);
      myFinch.playTone(E5, quarter);
      myFinch.playTone(D5, quarter);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(F5, quarter);
      myFinch.playTone(E5, quarter);
      myFinch.playTone(D5, quarter);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(D5, eight);
      myFinch.playTone(D5, whole);
      myFinch.sleep(400);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(B4, quarter);
      myFinch.playTone(C5, eight);
      myFinch.playTone(G4, whole);
      myFinch.sleep(200);
      myFinch.playTone(C5, quarter);
      myFinch.playTone(B4, quarter);
      myFinch.playTone(C5, eight);
      myFinch.playTone(G5, whole);
      
      
      
      
 
      
    		  
    		  
      
      // Write some code here!

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

