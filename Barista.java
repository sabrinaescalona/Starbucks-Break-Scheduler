/*
* Author: Sabrina Escalona
* Date: October 15, 2021
*/

import java.time.LocalDateTime;

public class Barista 
{
    private double shiftLength;
    
    //Barista constructor
    public Barista(double shiftLength)
    {
        shiftLength = this.shiftLength;
    }  

    private boolean hasLunch()
    {
        boolean needsLunch = false;
        if(shiftLength >= 5.0)
        {
            needsLunch = true;
        }
        else
        {
            needsLunch = false;
        }
        return needsLunch;
    }

    private int calculateNumLunch()
    {
        int numOfLunch = 0;
        
        if(hasLunch() == false) //If the shift is 2 hours or less, no break is required
        {
            numOfLunch = 0;
        }
        else 
        {
            numOfLunch = 1;
        }
        return numOfLunch;
    }
        
    private int calculateNumTens()
    {
        int numOfTens = 0;
        
        if(shiftLength <= 2.0) //If the shift is 2 hours or less, no break is required
        {
            numOfTens = 0;
        }
        else if(hasLunch() == false) //If the shift is less than 5 hours
        {
            numOfTens = 1;
        }
        else if(shiftLength >= 5.0 && shiftLength < 6.0)
        {
            numOfTens = 1;
        }
        else 
        {
            numOfTens = 2;
        }

        return numOfTens;
    }

    private void totalBreaks()
    {
        int totalBreaks = calculateNumTens() + calculateNumLunch();
    }
    
    private boolean validShift()
    {
        if(shiftLength < 0.0 || shiftLength > 10.0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
}
