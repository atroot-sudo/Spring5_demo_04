//import com.theoldzheng.Service.UserService;
//import com.theoldzheng.User;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.GenericApplicationContext;
//
///**
// * Description:
// *
// * @author theoldzheng@163.com  @ZYD
// * @create 2021.3.25 21:26
// */
//public class test1 {
//    //基于注解的测试
//    @Test
//    public void test01() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("hello1.xml");
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.updateAccount();
//    }
//
//    //基于xml配置文件的测试
//    @Test
//    public void test02() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("hello2.xml");
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.updateAccount();
//    }
//
//    @Test
//    public void test03(){
//        Class [] clazz ={com.theoldzheng.TxConfig.txConfig.class};
//        ApplicationContext context = new AnnotationConfigApplicationContext(clazz);
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.updateAccount();
//
//    }
//
//    @Test
//    public void test04(){
//        //Spring支持函数式风格
//        // 1. 创建GenericApplicationContext对象
//        GenericApplicationContext context = new GenericApplicationContext();
//        //清空准备注册
//        context.refresh();
//        context.registerBean("user1",User.class,() -> new User());
//
//        User user1 = (User) context.getBean("user1");
//        System.out.println(user1);
//
//    }
//}