package ssm.sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import ssm.pojo.Orders;
import ssm.pojo.Product;
import utils.MyBatisUtils;

import java.util.List;

public class ordersTest {
    @Test
    public void  findOrdersWithPorduct2Test(){
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<Orders> ordersList  = sqlSession.selectList("ssm.mapper.OrdersMapper.findOrdersWithPorduct2", 1);
        // 打印输出结果
        for (Orders orders :ordersList){
            System.out.println(orders.toString());
            System.out.println(orders.getProductList());
        }
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void  findProductByIdTest(){
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<Orders> ordersList  = sqlSession.selectList("ssm.mapper.OrdersMapper.findOrdersWithPorduct", 1);
        // 打印输出结果
        for (Orders orders :ordersList){
            System.out.println(orders.toString());
        }
        // 关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void  TestCase(){
       String a="3661.83" ;
        System.out.println();
    }
}
