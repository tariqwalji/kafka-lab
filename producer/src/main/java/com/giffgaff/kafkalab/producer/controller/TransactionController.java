package com.giffgaff.kafkalab.producer.controller;

import com.giffgaff.kafkalab.generated.TransactionPayload.Transaction;
import com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType;
import com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection;
import com.giffgaff.kafkalab.producer.dto.TransactionDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/transaction")
public class TransactionController {
    private KafkaTemplate<String, Transaction> kafkaTemplate;

    public TransactionController(KafkaTemplate<String, Transaction> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping(consumes = {"application/json"})
    public void createTransaction(@RequestBody TransactionDto transaction) {
        Transaction transactionPayload = Transaction.newBuilder()
                .setAccountId(transaction.accountId)
                .setAmount(transaction.amount)
                .setTransactionType(TransactionType.CARD)
                .setTransactionDirection(TransactionDirection.DEBIT)
                .build();

        this.kafkaTemplate.send("transactions", null, transactionPayload);
    }
}
