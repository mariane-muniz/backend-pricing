package com.master.data.pricing.repositories;

import java.util.List;
import java.util.Set;

import com.master.data.pricing.models.ProductPrice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "price", path = "price")
public interface ProductPriceRepository extends CrudRepository<ProductPrice, Long> {

    public Set<ProductPrice> findByProductCodeIn(final List<String> codes);
}