import com.shk.config.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext configuration = new AnnotationConfigApplicationContext(Configuration.class);

        Object getUser = configuration.getBean("getUser");
        System.out.println(getUser);
    }
}
