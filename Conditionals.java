
/**
 * class to create Conditionals.
 * fields
 * - PERMIT_AGE
 *
 * @author Samuel Guy
 * @version 10/6/20
 */
public class Conditionals
{
    //field declaration
    private final int PERMIT_AGE = 16;

    /**
     * Constructor
     */
    public Conditionals(){

    }
    
    /*...........mutator methods..........*/
    /**
     * Method to approve permits
     * 
     * @param int age
     */
    public void setPermit(int age){
        if(age >= PERMIT_AGE){
            System.out.println("Permit approved");
        }else{
            System.out.println("Permit is not approved at this time");

        }
    }

    /**
     * Method to set the permits feedback
     * 
     * @param int age
     */
    public void setPermitFeedback(int age){
        if(age >= PERMIT_AGE)
            System.out.println("Permit approved");
        else{
            int moreYears = PERMIT_AGE - age;
            System.out.println("Permit is not approved."  
                + "Come back in " + moreYears + " year(s).");
        }
    }

    /**
     * Methods to set the permits age
     * 
     * @param int age
     */
    public void setPermitAge(int age){
        int topAge = 150;
        if(age >= PERMIT_AGE && age <= topAge){
            System.out.println("Permit approved");  
        }else{
            int moreYears = PERMIT_AGE - age;
            if(moreYears >=0){
                System.out.println("Permit is not approved."  
                    + "Come back in " + moreYears + " year(s).");
            }
            else{
                System.out.println("Permit can not be approved.");
            }
        }
    }
}
