
/**
 * class to create MathWork.
 * fields
 * - counter
 * - TOP_NUM
 * - dblCounter
 * - total
 * - LIMIT
 * - average
 * 
 * @author Samuel Guy
 * @version 10/3/2020
 */
public class MathWork{
    //field declarations
    private int counter;
    private final int TOP_NUM = 5;
    private double dblCounter;
    private double total;
    private final double LIMIT = 25;
    private double average;
    /**
     * Constructor
     */
    public MathWork(){
        counter = 0;
        dblCounter = 0;
        total = 0.0; 
    }
    
    /*...........mutator methods..........*/
    /**
     * Method to increment by one
     */
    public void setCounterByOne(){
        counter = counter + 1;
    }

    /**
     * Method to stop incrementing when at 5
     * Resets to 0 when at 5
     */
    public void setCounterToTopNum(){
        if (counter < TOP_NUM){
            counter = counter + 1;
        }
        else{
            counter = 0;
        }
    }

    /**
     * Method to count by onehalf
     */
    public void setCounterByOneHalf(){
        dblCounter = dblCounter + 0.5;
    }

    /**
     * Method to accumulate a total number of purchases
     * up to a limit
     * 
     * @param double more
     */
    public void setTotal(double more){
        double tempTotal = total + more;  
        if(tempTotal <= LIMIT){
            total = total + more;
        }
    }

    /**
     * Method to calculate the average 
     * of two numbers
     * 
     * @param int num1, int num2
     */
    public void setAverage(int num1, int num2){
        average = (num1 + num2)/2;
    }
}
