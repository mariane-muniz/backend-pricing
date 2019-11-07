package com.master.data.pricing.services.impl;

import javax.annotation.Resource;

import com.master.data.pricing.models.ProductPrice;
import com.master.data.pricing.repositories.ProductPriceRepository;
import com.master.data.pricing.services.ProductService;

import org.springframework.stereotype.Component;

@Component("productService")
public class DefaultProductService implements ProductService {

    @Resource
    private ProductPriceRepository productPriceRepository;

    @Override
    public ProductPrice findOneByProductCode(final String productCode) {
        return this.productPriceRepository.findOneByProductCode(productCode);
    }
}