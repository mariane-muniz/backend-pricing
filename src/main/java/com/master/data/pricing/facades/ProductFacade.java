package com.master.data.pricing.facades;

import java.util.Set;

import com.master.data.pricing.models.ProductPrice;

public interface ProductFacade {
    Set<ProductPrice> findProductPrices(final String productCode);
}