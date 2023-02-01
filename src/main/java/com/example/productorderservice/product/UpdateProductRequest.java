package com.example.productorderservice.product;

import org.springframework.util.Assert;

 record UpdateProductRequest(String name, int price, DiscountPolicy discountPolicy) {
     UpdateProductRequest {
        Assert.hasText(name, "상품명은 필수 입니다."); //valid
        Assert.isTrue(price > 0, "상품가격은 0보다 커야 합니다.");
        Assert.notNull(discountPolicy, "할인 정책은 필수 입니다.");

    }
}