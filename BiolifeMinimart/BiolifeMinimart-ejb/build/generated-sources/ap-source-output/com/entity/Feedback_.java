package com.entity;

import com.entity.Customer;
import com.entity.Orders;
import com.entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(Feedback.class)
public class Feedback_ { 

    public static volatile SingularAttribute<Feedback, String> feedbackContent;
    public static volatile SingularAttribute<Feedback, Integer> feedbackRate;
    public static volatile SingularAttribute<Feedback, Product> productID;
    public static volatile SingularAttribute<Feedback, Orders> orderID;
    public static volatile SingularAttribute<Feedback, Date> feedbackDate;
    public static volatile SingularAttribute<Feedback, Integer> feedbackID;
    public static volatile SingularAttribute<Feedback, Customer> customerUsername;
    public static volatile SingularAttribute<Feedback, Integer> feedbackStatus;

}