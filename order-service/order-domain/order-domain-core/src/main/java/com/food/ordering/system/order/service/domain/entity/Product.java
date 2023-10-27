package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    protected Money price;

    public Product(ProductId productId, String name, Money price) {
        this.name = name;
        this.price = price;
        super.setId(productId);
    }

    public Product(ProductId productId){
        super.setId(productId);
    }
    public void updateWithConfirmedNameAndPrice(String name, Money price){

    }
    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}