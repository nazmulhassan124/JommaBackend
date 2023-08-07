package com.nazmul.controller;

import com.nazmul.entity.Products;
import com.nazmul.entity.Transactions;
import com.nazmul.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class TransactionController {

    @Autowired
    TransactionsService transactionsService;




    @PostMapping("/post")
    public Transactions post(@RequestBody Transactions transactions) {

        return transactionsService.post(transactions);
    }

    @PostMapping("/postAll")
    public List<Transactions> addProduct (@RequestBody List<Transactions> productList){

        return transactionsService.postAll(productList);
    }


    @GetMapping("/get/{id}")
    public Transactions get(@PathVariable Long id) {

        return transactionsService.getById(id);
    }

    @PutMapping("/update")
    public Transactions update(@RequestBody Transactions transactions) {

        return transactionsService.update(transactions);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return transactionsService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Transactions> getAll() {
        return transactionsService.getAllCategory();
    }




}
