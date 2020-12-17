package ssm.dao;

import ssm.pojo.Customer;
import ssm.pojo.User;

/**
 * @author Administrator
 */
public interface CustomerDao {
  /**
   * 通过 id查找顾客信息
   * @param id
   * @return
   */
  public Customer findCustomerById(Integer id);
}
