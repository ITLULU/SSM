package ssm.mapper;

import ssm.pojo.Customer;

/**
 * @author Administrator
 */
public interface CustomerMapper {
    /**
     *  通过id查询客户
     * @param id
     * @return
     */
    public Customer findCustomerById(Integer id);

    /**
     * 添加客户
     * @param customer
     */
    public void addCustomer(Customer customer);

    /**
     * 一对多查询 客户对于的订单
     * @param id
     * @return
     */
    public Customer findCustomerWithOrders(Integer id);

}
