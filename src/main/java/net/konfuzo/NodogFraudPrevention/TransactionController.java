package net.konfuzo.NodogFraudPrevention;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TransactionController {

    private final Random rand = new Random();

    @GetMapping("/transaction/get-number")
    public String getNumber() {
        long transactionInt = rand.nextLong(0xF0000000L) + 0x10000000L;
        return Long.toHexString(transactionInt);
    }
}
