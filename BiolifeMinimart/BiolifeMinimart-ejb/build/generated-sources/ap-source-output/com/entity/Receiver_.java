package com.entity;

import com.entity.Customer;
import com.entity.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(Receiver.class)
public class Receiver_ { 

    public static volatile SingularAttribute<Receiver, String> receiverAddress;
    public static volatile SingularAttribute<Receiver, Integer> receiverID;
    public static volatile SingularAttribute<Receiver, String> receiverPhone;
    public static volatile SingularAttribute<Receiver, String> receiverName;
    public static volatile SingularAttribute<Receiver, Customer> customerUsername;
    public static volatile CollectionAttribute<Receiver, Orders> ordersCollection;
    public static volatile SingularAttribute<Receiver, Integer> receiverStatus;

}