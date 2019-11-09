package com.master.data.pricing.services;

import java.util.Set;

import com.master.data.pricing.models.ProductPrice;

public interface ProductService {
    Set<ProductPrice> findOneByProductCode(final String productCode);
}