package ejbtospring;

import javax.ejb.Local;

/**
 * EJBToSpring local interface
 */
@Local
public interface EJBToSpringLocal {
	
	String sayHello(String msg);
	
	SpringBean getSpringBean();

}