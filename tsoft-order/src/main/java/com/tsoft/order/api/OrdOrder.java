package com.tsoft.order.api;

import java.io.Serializable;

/**
 * @ClassName OrdOrder
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/17
 * @Version V1.0
 **/
public class OrdOrder implements Serializable {

    private  String id;

    private  String orderCode;

    private  String orderDes;

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Override
    public String toString() {
        return "OrdOrder{" +
                "id='" + id + '\'' +
                ", orderCode='" + orderCode + '\'' +
                ", orderDes='" + orderDes + '\'' +
                '}';
    }
}
