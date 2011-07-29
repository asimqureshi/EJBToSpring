package ejbtospring;

import javax.ejb.Local;

@Local
public interface EjbOneLocal {
	
	SpringBean getSpringBean();


}
