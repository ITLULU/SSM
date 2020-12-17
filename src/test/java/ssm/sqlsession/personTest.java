package ssm.sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import ssm.pojo.Person;
import utils.MyBatisUtils;

public class personTest {
    /**
     * 嵌套查询
     */
    @Test
    public void findPersonByIdTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
        Person person = session.selectOne("ssm.mapper."
                + "PersonMapper.findPersonById", 1);
        // 3、输出查询结果信息
        System.out.println(person);
        // 4、关闭SqlSession
        session.close();
    }

    /**
     * 嵌套结果
     */
    @Test
    public void findPersonByIdTest2() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.使用MyBatis嵌套结果的方法查询id为1的人的信息
        Person person = session.selectOne("ssm.mapper."
                + "PersonMapper.findPersonById2", 1);
        // 3、输出查询结果信息
        System.out.println(person);
        // 4、关闭SqlSession
        session.close();
    }
    @Test
    public void findPersonWithOrdersTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.使用MyBatis嵌套结果的方法查询id为1的人的信息
        Person person = session.selectOne("ssm.mapper."
                + "PersonMapper.findPersonWithOrders", 1);
        // 3、输出查询结果信息
        System.out.println(person);
        // 4、关闭SqlSession
        session.close();
    }

}
