package com.entity;

import com.entity.Category;
import com.entity.ProductImage;
import com.entity.Supplier;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> productQuantity;
    public static volatile SingularAttribute<Product, Supplier> supplierID;
    public static volatile SingularAttribute<Product, String> productImage;
    public static volatile SingularAttribute<Product, Integer> productID;
    public static volatile SingularAttribute<Product, BigDecimal> productUnitPrice;
    public static volatile SingularAttribute<Product, Integer> productStatus;
    public static volatile SingularAttribute<Product, String> productQuantityPerUnit;
    public static volatile CollectionAttribute<Product, ProductImage> productImageCollection;
    public static volatile SingularAttribute<Product, BigDecimal> productImportPrice;
    public static volatile SingularAttribute<Product, String> productName;
    public static volatile SingularAttribute<Product, String> productDescription;
    public static volatile SingularAttribute<Product, Category> categoryID;

}