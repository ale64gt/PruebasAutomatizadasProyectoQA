package com.salesmanager.core.modules.integration.shipping.model;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomShippingQuotesConfigurationTest {

    @MockBean
    List<CustomShippingQuotesRegion> regionList;
    @MockBean
    CustomShippingQuotesRegion region;
    @BeforeClass
    void init(){
        regionList = new ArrayList<>();
        region = new CustomShippingQuotesRegion();
        List<String> countries = new ArrayList<>();
        countries.add("Costa Rica");
        countries.add("Austria");
        region.setCountries(countries);
        region.setCustomRegionName("Earth");
        regionList.add(region);
    }


    @Test
    void toJSONStringTestNull() {
        CustomShippingQuotesConfiguration quote = new CustomShippingQuotesConfiguration();
        String result = quote.toJSONString();
        String expected = "{\"moduleCode\":\"null\",\"active\":false}";
        assertEquals(expected, result);
    }

    @Test
    void toJSONStringTest() {
        init();
        CustomShippingQuotesConfiguration quote = new CustomShippingQuotesConfiguration();
        quote.setActive(true);
        quote.setModuleCode("23");
        quote.setRegions(regionList);
        String result = quote.toJSONString();
        String expected = "{\"moduleCode\":\"23\",\"active\":true,\"regions\":[{\"customRegionName\":\"Earth\",\"countries\":[\"Costa Rica\",\"Austria\"]}]}";
        assertEquals(expected, result);
    }

}