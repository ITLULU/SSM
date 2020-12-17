package ssm.dao.imp;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import ssm.dao.CustomerDao;
import ssm.pojo.Customer;

/**
 * @author AdministratorC
 */
public  class CustomerDaoImp  extends SqlSessionDaoSupport implements CustomerDao {

    @Override
    public Customer findCustomerById(Integer id) {
        SqlSession sqlSession =this.getSqlSession();
        return sqlSession.selectOne("ssm.mapper.CustomerMapper.findCustomerWithOrders", id);
    }

}
