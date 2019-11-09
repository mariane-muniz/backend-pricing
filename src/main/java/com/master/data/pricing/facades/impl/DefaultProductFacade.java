package com.master.data.pricing.facades.impl;

import java.util.Set;

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
    public Set<ProductPrice> findProductPrices(final String productCode) {
        final Set<ProductPrice> price = this.productService.findOneByProductCode(productCode);
        return price;
    }
}