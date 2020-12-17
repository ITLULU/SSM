package ssm.sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import ssm.pojo.Customer;
import ssm.pojo.User;
import utils.MyBatisUtils;

import java.util.List;

public class customerTest {

    @Test
    public void findCustomerByIdTest() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        Customer customer = sqlSession.selectOne("ssm.mapper"
                + ".CustomerMapper.findCustomerById", 1);
        // 打印输出结果
        System.out.println(customer.toString());
        // 关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void findCustomerByName(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<Customer> customers = sqlSession.selectList("ssm.mapper.CustomerMapper.findCustomerByName",
                "admin");
        // 打印输出结果
        for ( Customer customer:customers) System.out.println(customer.toString());

        // 关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void findCustomerByNameWithBind(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Customer customer = sqlSession.selectOne("ssm.mapper"
                + ".CustomerMapper.findCustomerById", 1);
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<Customer> customers = sqlSession.selectList("ssm.mapper.CustomerMapper.findCustomerByNameWithBind",
                customer);
        // 打印输出结果
        for ( Customer cus:customers) System.out.println(cus.toString());

        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void findCustomerWithOrdersTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
       Customer customer = sqlSession.selectOne("ssm.mapper.CustomerMapper.findCustomerWithOrders",
                1);
        System.out.println(customer.toString());
        // 关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void findCustomerWithOrders2Test(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        Customer customer = sqlSession.selectOne("ssm.mapper.CustomerMapper.findCustomerWithOrders2",
                1);
        System.out.println(customer.toString());
        // 关闭SqlSession
        sqlSession.close();
    }

}
