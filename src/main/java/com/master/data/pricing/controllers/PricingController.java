package com.master.data.pricing.controllers;

import java.util.Set;

import javax.annotation.Resource;

import com.master.data.pricing.facades.ProductFacade;
import com.master.data.pricing.models.ProductPrice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "false")
@RestController
@RequestMapping("/price")
public class PricingController {

    private final static Logger LOG = LoggerFactory.getLogger(PricingController.class);

    @Resource
    private ProductFacade ProductFacade;

    @GetMapping("/{productCode}")
    public ResponseEntity<Set<ProductPrice>> getProductPrices(@PathVariable("productCode") final String productCode) {

        try {
            Set<ProductPrice> price = this.ProductFacade.findProductPrices(productCode);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(price);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
        }
        return null;
    }
}