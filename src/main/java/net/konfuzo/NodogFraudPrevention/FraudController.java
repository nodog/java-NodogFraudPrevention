package net.konfuzo.NodogFraudPrevention;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FraudController {

    private static final String template = "fraud %s";
    private final AtomicLong counter = new AtomicLong();
    private final Random rand = new Random();

    @GetMapping("/fraud/check")
    public FraudResponse fraudCheck(@RequestParam(value="transaction", defaultValue = "0") String transaction) {
        boolean isFraud = !(rand.nextFloat() > 0.5);
        return new FraudResponse(counter.incrementAndGet(), transaction, String.format(template, isFraud));
    }
}
