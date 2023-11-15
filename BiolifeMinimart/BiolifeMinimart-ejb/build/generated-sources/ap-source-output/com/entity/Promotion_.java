package com.entity;

import com.entity.PromotionDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-11-15T14:46:51")
@StaticMetamodel(Promotion.class)
public class Promotion_ { 

    public static volatile SingularAttribute<Promotion, Date> promotionStart;
    public static volatile SingularAttribute<Promotion, String> promotionName;
    public static volatile SingularAttribute<Promotion, Date> promotionEnd;
    public static volatile CollectionAttribute<Promotion, PromotionDetails> promotionDetailsCollection;
    public static volatile SingularAttribute<Promotion, Integer> promotionID;

}