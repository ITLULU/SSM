package ssm.sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import ssm.pojo.User;
import utils.MyBatisUtils;

import java.util.List;

public class userTest {
    @Test
    public void findAllUserTest() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<User> list = sqlSession.selectList("ssm.mapper.UserMapper.findAllUser");
        for (User user : list) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }
}
