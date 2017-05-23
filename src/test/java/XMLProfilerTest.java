import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 5/19/17.
 */
public class XMLProfilerTest {

    @Test
    public void productionProfilerTest() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        applicationContext.getEnvironment().setActiveProfiles("production");
        applicationContext.refresh();
        Message message = applicationContext.getBean("message", Message.class);
        assertNotNull(message);
        String messageStr = message.getMessage();
        assertNotNull(messageStr);
        assertEquals("Production", messageStr);
    }

    @Test
    public void developmentProfilerTest() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        applicationContext.getEnvironment().setActiveProfiles("development");
        applicationContext.refresh();
        Message message = applicationContext.getBean("message", Message.class);
        assertNotNull(message);
        String messageStr = message.getMessage();
        assertNotNull(messageStr);
        assertEquals("Development", messageStr);
    }

    @Test
    public void test() {
        double d = 1;
        double d1 = 1.0;
        System.out.println();
    }
}
