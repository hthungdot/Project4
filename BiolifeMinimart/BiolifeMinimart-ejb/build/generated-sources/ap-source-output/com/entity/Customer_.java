package com.entity;

import com.entity.Cart;
import com.entity.Feedback;
import com.entity.Receiver;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> customerStatus;
    public static volatile CollectionAttribute<Customer, Cart> cartCollection;
    public static volatile SingularAttribute<Customer, String> customerPhone;
    public static volatile SingularAttribute<Customer, String> customerAvatar;
    public static volatile SingularAttribute<Customer, Integer> customerGender;
    public static volatile SingularAttribute<Customer, String> customerEmail;
    public static volatile SingularAttribute<Customer, String> customerPassword;
    public static volatile CollectionAttribute<Customer, Feedback> feedbackCollection;
    public static volatile SingularAttribute<Customer, String> customerUsername;
    public static volatile CollectionAttribute<Customer, Receiver> receiverCollection;
    public static volatile SingularAttribute<Customer, String> customerFullname;

}