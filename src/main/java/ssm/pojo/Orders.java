package ssm.pojo;
import org.json.JSONObject;

import  java.util.List;
/**
 * @author Administrator
 */
public class Orders {
    /**
     * 订单id
     */
    private Integer id;
    /**
     * 订单编号
     */
    private String number;
    /**
     * 多对一关联顾客
     */
    private  Customer customer;
    /**
     * 多对多关联商品
     */
    private List<Product> productList;

    public Integer getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number +
                 ",productList='"+productList+
                '}';

    }

}
