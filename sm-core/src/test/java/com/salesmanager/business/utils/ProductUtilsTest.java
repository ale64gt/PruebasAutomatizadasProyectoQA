package com.salesmanager.core.business.utils;

import com.salesmanager.core.model.order.orderproduct.OrderProduct;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class ProductUtilsTest {


    @MockBean
    OrderProduct product;

    @Test
    void buildOrderProductDisplayNameTest() {
        product = new OrderProduct();
        product.setProductName("Air Jordan");
        String result = ProductUtils.buildOrderProductDisplayName(product);
        String expected = "Air Jordan";
        assertEquals(expected,result);

    }
}