
package herocalculator;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author Mira
 */
public class HeroCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    // Declare variables
    
    // Gather user input
        String currentLevelString = JOptionPane.showInputDialog(null, "Please"
                + " enter the current level of your hero: ", "Hero Level",
                JOptionPane.PLAIN_MESSAGE);
        
    // Convert currentXpString to int
        int currentLevel = Integer.parseInt(currentLevelString);
        
    // Gather xp for current level
        String currentLevelXpAmountString = JOptionPane.showInputDialog(null,
                "Please enter how much xp you have for this level: ", "Current"
                + " XP ", JOptionPane.PLAIN_MESSAGE);
        
    // Convert currentLevelXPAmountString to int
        int currentLevelXpAmount = Integer.parseInt(currentLevelXpAmountString);
    
    // Gather target level
        String targetLevelString = JOptionPane.showInputDialog(null, "What leve"
                + " would you like to be?", "Target Level", 
                JOptionPane.PLAIN_MESSAGE );
    
     // Convert targetLevelString to int
        int targetLevel = Integer.parseInt(targetLevelString);
        
     
      // Calculations
        int previousLevel = currentLevel - 1;
        int previousLevelXp = (20* ((previousLevel * (previousLevel + 1))/2));
        int totalCurrentXp = currentLevelXpAmount + previousLevelXp;
        
        int targetTotalLevelXp = (20* ((targetLevel * (targetLevel + 1))/2));
        
        int xpNeeded = ((targetTotalLevelXp - totalCurrentXp) - 680);
        
        
        System.out.println(xpNeeded);
        
        
        // Calculate specific items needed
        int twgR = xpNeeded % 50000;
        int twg = ((xpNeeded - twgR) / 50000);
        int twaR = twgR % 10000;
        int twa = ((twgR - twaR) / 10000);
        int twwR = twaR % 1000;
        int tww = ((twaR - twwR) / 1000);
        int attacksR = twwR % 20;
        int attacks = ((twwR - attacksR) / 20);
        
        if (twgR > 0)
            System.out.println(twg + " Train with Gandalfs.");
        if (twaR > 0)
            System.out.println(twa + " Train with Archers.");
        if (twwR > 0)
            System.out.println(tww + " Train with Warriors.");
        if (attacksR > 0)
            System.out.println(attacks + " Neighborhood attacks.");
        

        
        
        
    }
}
