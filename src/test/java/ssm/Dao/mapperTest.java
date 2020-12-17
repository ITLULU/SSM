package ssm.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import ssm.mapper.CustomerMapper;
import ssm.pojo.Customer;

public class mapperTest {

    @Test
    public void findCustomerByIdMapperTest(){
        ApplicationContext act =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerMapper customerMapper = act.getBean(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(1);
        System.out.println(customer);
        System.out.println(customerMapper.findCustomerWithOrders(1));
    }

}
