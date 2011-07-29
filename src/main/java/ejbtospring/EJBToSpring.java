package ejbtospring;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

/**
 * Session Bean implementation class EJBToSpring
 */
@Stateless
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class EJBToSpring implements EJBToSpringLocal {
	
	
	@Autowired	private SpringBean springBean;

	/**
     * Default constructor. 
     */
    public EJBToSpring() {
    	
    	System.out.println("EJBToSpring constructed...");
        
    }

	public String sayHello(String msg) {
		
		
//ApplicationContext ctx = new ClassPathXmlApplicationContext("beanRefContext.xml").getBean(ApplicationContext.class);
//		
//		System.out.println("BEAN:-" + ctx.getBean(SpringBean.class));
		
		String ret = "";
		
		if(springBean == null){
			
			ret = "springBean is NULL!!";
		} else {
			
			ret = springBean.toString();
		}
		
		return (msg!=null && !msg.isEmpty())?"HELLO " + ret + "!!":"HELLO NEW ZEALAND!!";
	}

	public SpringBean getSpringBean() {
		return springBean;
	}

	public void setSpringBean(SpringBean springBean) {
		this.springBean = springBean;
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanRefContext.xml").getBean(ApplicationContext.class);
		
		System.err.println("BEAN:-" + ctx.getBean(SpringBean.class));
	}
}