package ssm.service;

import ssm.pojo.Customer;

/**
 * @author Administrator
 */
public interface CustomerService {
    /**
     * 通过 id查找顾客信息
     * @param id
     * @return
     */
    public Customer findCustomerWithOrders(Integer id);
}
