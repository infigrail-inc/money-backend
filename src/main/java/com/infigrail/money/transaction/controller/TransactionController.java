package com.infigrail.money.transaction.controller;

import com.infigrail.money.controllers.AbstractInfigrailController;
import com.infigrail.money.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TransactionController extends AbstractInfigrailController {
    @Autowired
    TransactionService transactionService;

    @RequestMapping(method = RequestMethod.GET, path = "sample")
    public String getData() {
        return "hello";
    }
}
