package com.entity;

import com.entity.Orders;
import com.entity.Product;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, Integer> orderDetailsID;
    public static volatile SingularAttribute<OrderDetails, Product> productID;
    public static volatile SingularAttribute<OrderDetails, Orders> orderID;
    public static volatile SingularAttribute<OrderDetails, BigDecimal> orderDetailsUnitPrice;
    public static volatile SingularAttribute<OrderDetails, Double> orderDetailsDiscount;
    public static volatile SingularAttribute<OrderDetails, Integer> orderDetailsQuantity;

}