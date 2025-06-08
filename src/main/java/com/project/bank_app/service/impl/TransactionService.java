package com.project.bank_app.service.impl;

import com.project.bank_app.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
