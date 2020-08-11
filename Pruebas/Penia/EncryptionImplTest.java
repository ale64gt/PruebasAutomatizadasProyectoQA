package com.salesmanager.core.business.modules.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionImplTest {

    EncryptionImpl encryption = new EncryptionImpl();

    @Test
    void encryptTest() throws Exception {
        encryption.setSecretKey("1234567890abcdef");
       String result = encryption.encrypt("Daniel");
       String expected = "3522aaea21b2a589ae261bdf53242186";
       assertEquals(expected,result);
    }

    @Test
    void decryptTest() throws Exception {
        encryption.setSecretKey("1234567890abcdef");
        String result = encryption.decrypt("3522aaea21b2a589ae261bdf53242186");
        String expected = "Daniel";
        assertEquals(expected,result);
    }

}