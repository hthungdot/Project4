package com.entity;

import com.entity.Product;
import com.entity.Promotion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(PromotionDetails.class)
public class PromotionDetails_ { 

    public static volatile SingularAttribute<PromotionDetails, Integer> promotionDetailsID;
    public static volatile SingularAttribute<PromotionDetails, Product> productID;
    public static volatile SingularAttribute<PromotionDetails, Double> promotionDetailsDiscount;
    public static volatile SingularAttribute<PromotionDetails, Promotion> promotionID;

}