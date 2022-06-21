
/**
 * class to create Grader.
 * fields
 * - average
 * - TEST_PERCENT
 * - testPoints
 * - assnPoints
 * - total
 * - letterGrade
 *
 * @author Samuel Guy
 * @version 10/3/2020
 */
public class Grader
{
    //field declarations
    private double average;
    private double TEST_PERCENT = 0.66;
    private double testPoints;
    private int assnPoints = 30;
    private double total;
    private String letterGrade;
    
    /*...........mutator methods..........*/
    /**
     * Method to determine the test points
     * Add 3 caller-provided test scores
     * and calculate their average
     * Calculate 66% of that to get the test points
     * (This is the portion of the final grade from test scores.)
     * 
     * @param int test1, int test2, int test3
     */
    public void setTestPoints(int test1, int test2, int test3){
        if((test1 <= 100 && test1 >=0) && (test2 <= 100 && test2 >=0) && (test3 <= 100 && test3 >=0)){ 
            //1. calculate the average
            double sum = test1 + test2 + test3;
            average = sum/3;
            //2. calculate the 66% using the TEST_POINTS constant
            testPoints = average * TEST_PERCENT;
        }
        else{
            System.out.println("Scores must be between 0 and 100." 
                + " Please enter grades again.");
        }
    }

    /**
     * Method to calculate the final points
     * 
     * @param int assnPoints
     */
    public void setTotal(int assnPoints){
        total = testPoints + assnPoints;
    }

    /**
     * Method to convert the number grade to a letter grade
     */
    public void setLetterGrade(){
        if(total >= 90){
            letterGrade = "A";
        }
        else{
            if(total >= 80){
                letterGrade = "B";
            }
            else{
                if(total >=70){
                    letterGrade = "C";
                }
                else{
                    if(total >= 65){
                        letterGrade = "D";
                    }
                    else{
                        letterGrade = "F";

                    }
                }
            }
        }
    }
}