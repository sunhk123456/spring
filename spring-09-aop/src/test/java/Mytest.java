import com.shk.service.UserService;
import com.shk.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServive = context.getBean("userServive", UserServiceImpl.class);
        userServive.add();

    }
}
