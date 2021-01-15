package ua.kpi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kpi.controller.Controller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Controller controller = ctx.getBean(Controller.class);
        controller.handleUserInput();
    }
}
