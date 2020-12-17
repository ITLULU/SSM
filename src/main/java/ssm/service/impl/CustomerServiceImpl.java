package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.mapper.CustomerMapper;
import ssm.pojo.Customer;
import ssm.service.CustomerService;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Customer findCustomerWithOrders(Integer id) {
        return null;
    }
}
