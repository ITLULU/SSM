package ssm.sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import ssm.pojo.Product;
import utils.MyBatisUtils;

import java.util.List;

public class productTest {
    @Test
    public void  findProductByIdTest(){
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<Product> products  = sqlSession.selectList("ssm.mapper.ProductMapper.findProductById", 1);
        // 打印输出结果
        for (Product product:products){
            System.out.println(product.toString());
            System.out.println(product.getOrders());
        }
        // 关闭SqlSession
        sqlSession.close();
    }
}
