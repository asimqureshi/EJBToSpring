package ejbtospring;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

@Stateless
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class EjbOne implements EjbOneLocal {
	
	@Autowired	private SpringBean springBean;
	
	
	
	
	

	public SpringBean getSpringBean() {
		return springBean;
	}

	public void setSpringBean(SpringBean springBean) {
		this.springBean = springBean;
	}
	
	

}
