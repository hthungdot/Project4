package com.entity;

import com.entity.Customer;
import com.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, Product> productID;
    public static volatile SingularAttribute<Cart, Integer> cartID;
    public static volatile SingularAttribute<Cart, Customer> customerUsername;
    public static volatile SingularAttribute<Cart, Integer> cartQuantity;

}