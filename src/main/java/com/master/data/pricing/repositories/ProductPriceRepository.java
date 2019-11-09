package com.master.data.pricing.repositories;

import java.util.Set;

import com.master.data.pricing.models.ProductPrice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "price", path = "prices")
public interface ProductPriceRepository extends CrudRepository<ProductPrice, Long> {

    public Set<ProductPrice> findByProductCode(final String productCode);
}