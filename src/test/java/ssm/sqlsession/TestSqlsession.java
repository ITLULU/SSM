package ssm.sqlsession;

import org.testng.annotations.Test;
import utils.MyBatisUtils;

public class TestSqlsession {
    @Test
    public void TestSession(){
        System.out.println(MyBatisUtils.getSession());
    }
}
