package com.master.data.pricing.facades.impl;

import javax.annotation.Resource;

import com.master.data.pricing.facades.ProductFacade;
import com.master.data.pricing.models.ProductPrice;
import com.master.data.pricing.services.ProductService;

import org.springframework.stereotype.Component;

@Component("productFacade")
public class DefaultProductFacade implements ProductFacade {

    @Resource
    private ProductService productService;

    @Override
    public double findProductPrices(final String productCode) {
        final ProductPrice price = this.productService.findOneByProductCode(productCode);
        return price.getPrice();
    }
}