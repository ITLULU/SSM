package ssm.pojo;

import java.util.List;

/**
 * @author Administrator
 */
public class Product {
    /**
     * 商品id
     */
    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品单价
     */
    private Double price;
    /**
     * 与订单的关联属性
     */
    private List<Orders> orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
