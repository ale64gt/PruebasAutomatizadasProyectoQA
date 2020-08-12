package com.salesmanager.core.business.utils;

import org.junit.jupiter.api.Test;
import org.mockito.internal.stubbing.answers.ThrowsException;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardUtilsTest {

    @Test
    void maskCardNumberTestPass() throws Exception {
        String result = CreditCardUtils.maskCardNumber("1234567890123456");
        String expected = "1234XXXXXXXXXX3456";
        assertEquals(expected, result);
    }

    @Test
    void maskCardNumberTestFail() throws Exception {
        Exception exception = assertThrows(Exception.class, () ->{
            CreditCardUtils.maskCardNumber("12344");
        });
        String expectedMessage = "Invalid number of digits";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}