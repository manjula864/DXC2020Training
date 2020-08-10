import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext cont= new ClassPathXmlApplicationContext("myspring.xml");

		Trainee obj=(Trainee)cont.getBean("trbean");//getbean returns a object
		obj.show();


		
	}

}
