package com.master.data.pricing.services;

import com.master.data.pricing.models.ProductPrice;

public interface ProductService {
    ProductPrice findOneByProductCode(final String productCode);
}