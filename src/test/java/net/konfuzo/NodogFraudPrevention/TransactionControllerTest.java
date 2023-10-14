package net.konfuzo.NodogFraudPrevention;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionControllerTest {

    TransactionController transactionController;

    @BeforeEach
    void setUp() {transactionController = new TransactionController();
    }

    @Test
    void shouldGetNumber() {
        String transactionId = transactionController.getNumber();
        assertEquals(8, transactionId.length());
    }
}