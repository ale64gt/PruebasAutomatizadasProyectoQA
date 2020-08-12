package com.salesmanager.shop.admin.controller.categories;

import com.salesmanager.core.business.services.catalog.category.CategoryService;
import com.salesmanager.core.business.services.reference.country.CountryService;
import com.salesmanager.core.business.services.reference.language.LanguageService;
import com.salesmanager.shop.utils.LabelUtils;
import org.apache.maven.model.Model;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.jupiter.api.Assertions.*;

class CategoryControllerTest {

    CategoryController categoryController = new CategoryController();
    @MockBean
    org.springframework.ui.Model model;
    @MockBean
    HttpServletRequest request;

    @MockBean
    HttpServletResponse response;

    @MockBean
    LanguageService languageService;

    @MockBean
    CategoryService categoryService;

    @MockBean
    CountryService countryService;

    @MockBean
    LabelUtils messages;

    @Test
    void displayCategoryEdit() throws Exception {
        Long categoryId = 123l;
        String result = categoryController.displayCategoryEdit(categoryId, model,request,response);
        String expected = "";
        assertEquals(expected,result);
    }

    @Test
    void displayCategoryCreate() {
    }

    @Test
    void saveCategory() {
    }

    @Test
    void displayCategories() {
    }

    @Test
    void pageCategories() {
    }

    @Test
    void displayCategoryHierarchy() {
    }

    @Test
    void deleteCategory() {
    }

    @Test
    void moveCategory() {
    }

    @Test
    void checkCategoryCode() {
    }
}