package epam.com.logger;

import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * Hello world!
 *
 */
public class App 
{	
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner in=new Scanner(System.in);
        LOGGER.debug("Enter Your Option:\n1.Calculate Interest\n2.Estimate House Construction Cost");
        int option=in.nextInt();
        while(option<1 || option>2) {
        	LOGGER.debug("Enter a valid option\n");
        	option=in.nextInt();
        }
        if(option==1) {
        	LOGGER.debug("Enter Principle Amount : ");
        	double p=in.nextDouble();
        	LOGGER.debug("Enter Rate Of Interest : ");
        	double r=in.nextDouble();
        	LOGGER.debug("Enter Time Taken : ");
    		double t=in.nextDouble();
        	//LOGGER.debug()
        	LOGGER.debug("Enter your type:\n1 Simple Interest\n2 Compound Interest");
        	int type=in.nextInt();
        	switch(type) {
        	case(1):
        		Simple s=new Simple(p,t,r);
        		LOGGER.debug("SIMPLE INTEREST : "+ s.cal()+"INR");
        		break;
        	case(2):
        		Compound c=new Compound(p,t,r);
        		LOGGER.debug("COMPOUND INTEREST : "+c.cal()+"INR");
        		break;	
        	}
        }
        else {
        	LOGGER.debug("Enter Area Of The House : ");
        	double area=in.nextDouble();
        	LOGGER.debug("Enter Material Standards you need : ");
        	LOGGER.debug("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int op=in.nextInt();
        	House h=new House(area,op);
        	LOGGER.debug("TOTAL COST : "+h.total() +"INR");
        	}
        in.close();
    }
}
