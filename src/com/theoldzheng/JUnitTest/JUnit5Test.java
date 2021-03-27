package com.theoldzheng.JUnitTest;

import com.theoldzheng.Service.UserService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.27 12:58
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:hello1.xml")
@SpringJUnitConfig(locations = "classpath:hello1.xml")  //用该注解可以替代上面的两个注解
public class JUnit5Test {
    @Autowired
    private UserService userService;

    @Test
    public void test01() {
        userService.updateAccount();
    }

}
