import com.theoldzheng.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.25 21:26
 */
public class test1 {
    //基于注解的测试
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("hello1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.updateAccount();
    }

    //基于xml配置文件的测试
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("hello2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.updateAccount();
    }
}