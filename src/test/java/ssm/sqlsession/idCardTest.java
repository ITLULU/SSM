package ssm.sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import ssm.pojo.Customer;
import ssm.pojo.IdCard;
import utils.MyBatisUtils;

public class idCardTest {
    @Test
    public void  findCodeByIdTest(){
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        IdCard idCard = sqlSession.selectOne("ssm.mapper.IdCardMapper.findCodeById", 1);
        // 打印输出结果
        System.out.println(idCard.toString());
        // 关闭SqlSession
        sqlSession.close();
    }
}
