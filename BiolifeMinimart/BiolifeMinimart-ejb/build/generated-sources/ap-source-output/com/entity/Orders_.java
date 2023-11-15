package com.entity;

import com.entity.Receiver;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Receiver> receiverID;
    public static volatile SingularAttribute<Orders, Date> orderDeliveryDate;
    public static volatile SingularAttribute<Orders, Integer> orderID;
    public static volatile SingularAttribute<Orders, String> orderNote;
    public static volatile SingularAttribute<Orders, Integer> orderStatus;
    public static volatile SingularAttribute<Orders, Date> orderDate;
    public static volatile SingularAttribute<Orders, BigDecimal> orderTotal;

}