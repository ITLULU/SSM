package ssm;

import ssm.dao.CustomerDao;
import ssm.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestIOC {
    @Test
    public void Testioc(){
        //1.初始化spring容器，加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取userDao实例
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("userDao");
        //3.调用实例中的say()方法
        customerDao.findCustomerById(1);
    }

    @Test
    public void TestDI(){
        //1.初始化spring容器，加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取UserService实例
        CustomerService userService =
                (CustomerService) applicationContext.getBean("userService");
        //3.调用实例中的say()方法
    }
}
