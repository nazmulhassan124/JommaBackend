package com.nazmul.service;


import com.nazmul.entity.Products;
import com.nazmul.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;


    public Products post(Products product) {
        if(!product.equals(null)) {
            return productsRepository.save(product);
        }
        return null;
    }

    public Products getById(Long id) {
        Optional<Products> optional = productsRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public Products update(Products product) {
        return productsRepository.save(product);
    }

    public String delete(Long id) {
        Optional<Products> optional = productsRepository.findById(id);
        if(optional.isPresent()) {
            productsRepository.delete(optional.get());
            return null;
        }
        return "fail";
    }


    public List<Products> getAllCategory() {

        return productsRepository.findAll();
    }


    public List<Products> postAll(List<Products> product) {

        return productsRepository.saveAll(product);
    }

}
