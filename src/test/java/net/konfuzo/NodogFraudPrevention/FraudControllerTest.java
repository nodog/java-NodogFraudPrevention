package net.konfuzo.NodogFraudPrevention;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class FraudControllerTest {

    FraudController fraudController;

    @BeforeEach
    void setUp() {fraudController = new FraudController();}

    @Test
    void shouldReturnAFraudResponse() {
        FraudResponse fraudResponse = fraudController.fraudCheck("2345");

        assertEquals(1, fraudResponse.id());
        assertEquals("2345", fraudResponse.transaction());
        Assertions.assertTrue(Objects.equals(fraudResponse.content(), "fraud true")
                || Objects.equals(fraudResponse.content(), "fraud false"));
    }
}