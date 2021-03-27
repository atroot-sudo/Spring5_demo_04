package com.theoldzheng.Service;

import com.theoldzheng.DAO.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.26 19:12
 */
@Transactional(propagation = Propagation.REQUIRED) //在类头加上事务注解 或者在方法头上加上注解@Transactional 表示对该单个方法的事务注解
/**
 * 关于其参数的说明
 * 1.事务传播行为Propagation.REQUIRED 表示当前方法使用当前方法的事务进行操作，如果方法本身没有事务那么就创建一个事务
 * Propagation.REQUIRED_NEW 表示当前方法不管有没有事务，都要创建新的事务进行操作
 *
 * 2.事务隔离级别
 * 事务隔离级别所涉及到的几个问题：脏读、不可重复读、虚(幻)读
 *脏读值得是读到了未提交的内容、不可重复读是指的读到别人的数据在不断发生变化、幻读是指读到不一样的多条数据
 * 1.READ UNCOMMITTED 读未提交(没有解决任何问题)
 * 2.READ COMMITTED  读已提交(解决了脏读问题)
 * 3.REPEATABLE READ  可重复读(解决了脏读和可重复读问题) 该隔离级别为MySql的默认隔离级别
 * 4.SERIALIZABLE     串行化(解决了三个问题)
 *
 * 其他属性：
 * timeout：超时时间  事务需要在一定的时间内完成提交操作，如果不提交则会进行回滚
 * 其默认值为-1(表示不超时)，设置时间以秒为单位
 *
 * readOnly：是否只读  默认值为false ，若改为true 那么只能进行读(查询)操作
 *
 * rollbackFor：回滚 设置那些异常出现后进行回滚
 * noRollbackFor：设置那些异常出现不进行回滚
 */
@Service
public class UserService {
    @Autowired
    private DAO userDAO;


    public void updateAccount() {
        userDAO.reduceMoney();
//        int a = 10 / 0; //模拟异常
        userDAO.addMoney();
    }
}
