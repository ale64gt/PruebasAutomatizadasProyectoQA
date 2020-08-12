package com.salesmanager.shop.admin.security;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesImplTest {

    @Test
    void loadUserByUsername() {
        UserServicesImpl userServices = new UserServicesImpl();
        userServices.loadUserByUsername("admin@shopizer.com");
    }
}