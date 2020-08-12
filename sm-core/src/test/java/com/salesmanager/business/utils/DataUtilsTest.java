package com.salesmanager.core.business.utils;

import com.salesmanager.core.model.merchant.MerchantStore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class DataUtilsTest {
    @MockBean
    MerchantStore store = new MerchantStore();

    @Test
    void trimPostalCodeTest() {
        String result = DataUtils.trimPostalCode("40703");
        String expected = "40703";
        assertEquals(expected,result);
    }

    @Test
    void getWeightTestKGtoLB() {
        double result = DataUtils.getWeight(12d,store,"KG");
        double expected = 5.45d;
        assertEquals(expected,result);
    }

    @Test
    void getWeightTestLB() {
        double result = DataUtils.getWeight(5.45d,store,"LB");
        double expected = 5.45d;
        assertEquals(expected,result);
    }

    @Test
    void getWeightTestLBtoKG() {
        double result = DataUtils.getWeight(5d,store,"");
        double expected = 2.27d;
        assertEquals(expected,result);
    }

    @Test
    void getMeasureTestINtoCM() {
        double result = DataUtils.getMeasure(5d,store,"CM");
        double expected = 1.95;
        assertEquals(expected,result);
    }

    @Test
    void getMeasureIN() {
        double result = DataUtils.getMeasure(5d,store,"IN");
        double expected = 5d;
        assertEquals(expected,result);
    }

    @Test
    void getMeasureCMtoIN() {
        double result = DataUtils.getMeasure(15d,store,"");
        double expected = 5.85d;
        assertEquals(expected,result);
    }
}