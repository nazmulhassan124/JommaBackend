package com.nazmul.service;

import com.nazmul.entity.Products;
import com.nazmul.entity.Transactions;
import com.nazmul.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;



    public Transactions post(Transactions transactions) {
        if(!transactions.equals(null)) {
            return transactionsRepository.save(transactions);
        }
        return null;
    }

    public Transactions getById(Long id) {
        Optional<Transactions> optional = transactionsRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public Transactions update(Transactions transactions) {
        return transactionsRepository.save(transactions);
    }

    public String delete(Long id) {
        Optional<Transactions> optional = transactionsRepository.findById(id);
        if(optional.isPresent()) {
            transactionsRepository.delete(optional.get());
            return null;
        }
        return "fail";
    }


    public List<Transactions> getAllCategory() {

        return transactionsRepository.findAll();
    }


    public List<Transactions> postAll(List<Transactions> transactions) {

        return transactionsRepository.saveAll(transactions);
    }



}
