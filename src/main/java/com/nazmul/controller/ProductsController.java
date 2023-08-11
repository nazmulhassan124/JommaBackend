package com.nazmul.controller;

import com.nazmul.entity.Products;
import com.nazmul.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ProductsController {
    @Autowired

    ProductsService productsService;




    @PostMapping("/post")
    public Products post(@RequestBody Products product) {

        boolean status = true;
        Products pro = new Products();
        pro.setProduct_code(product.getProduct_code());
        pro.setProduct_name(product.getProduct_name());
        pro.setUnit_price(product.getUnit_price());
        pro.setYear_to_date(product.getYear_to_date());
        pro.setGain_loss(product.getGain_loss());
        pro.setActive_status(status);


        return productsService.post(pro);
    }

    @PostMapping("/postAll")
    public List<Products> addProduct (@RequestBody List<Products> productList){

        return productsService.postAll(productList);
    }

    @GetMapping("/get/{id}")
    public Products get(@PathVariable Long id) {

        return productsService.getById(id);
    }

    @PutMapping("/update")
    public Products update(@RequestBody Products product) {

        return productsService.update(product);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return productsService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Products> getAll() {
        return productsService.getAllCategory();
    }





}
