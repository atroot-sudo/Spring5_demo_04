package com.theoldzheng.JUnitTest;

import com.theoldzheng.Service.UserService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.27 12:38
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:hello1.xml")
public class JUnit4Test {
    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        userService.updateAccount();
    }

}
