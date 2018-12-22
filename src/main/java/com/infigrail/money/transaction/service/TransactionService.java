package com.infigrail.money.transaction.service;

import com.infigrail.money.services.AbstractInfigrailService;
import com.infigrail.money.transaction.dao.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends AbstractInfigrailService {
    @Autowired
    TransactionDao transactionDao;
}
