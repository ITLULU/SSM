package ssm.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import ssm.dao.CustomerDao;
import ssm.mapper.CustomerMapper;
import ssm.pojo.Customer;

public class DaoTest {
    @Test
    public void findCustomerByIdDaoTest(){
        ApplicationContext act =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 根据容器中Bean的id来获取指定的Bean
        CustomerDao customerDao =
                (CustomerDao) act.getBean("customerDao");
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }


}
