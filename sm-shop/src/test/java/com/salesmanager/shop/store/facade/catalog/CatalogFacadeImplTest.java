package com.salesmanager.shop.store.facade.catalog;

import com.salesmanager.core.business.utils.CreditCardUtils;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.shop.model.catalog.catalog.PersistableCatalog;
import com.salesmanager.shop.model.catalog.catalog.PersistableCatalogEntry;
import com.salesmanager.shop.model.catalog.catalog.ReadableCatalog;
import java.lang.NullPointerException;
import org.drools.core.xml.ExtensibleXmlParser;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import javax.xml.transform.Result;

import static org.junit.jupiter.api.Assertions.*;

class CatalogFacadeImplTest {




    @Test
    void saveCatalogTestNUllCatalogTest() {
        Exception exception = assertThrows(Exception.class, () ->{
            PersistableCatalog persistableCatalog = null;
            MerchantStore merchantStore = new MerchantStore();
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            ReadableCatalog result = catalogFacade.saveCatalog(persistableCatalog, merchantStore, language);
        });
        String expectedMessage = "Catalog cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    void saveCatalogTestNullStoreTest() {
        Exception exception = assertThrows(Exception.class, () ->{
            PersistableCatalog persistableCatalog = new PersistableCatalog();
            MerchantStore merchantStore = null;
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            ReadableCatalog result = catalogFacade.saveCatalog(persistableCatalog, merchantStore, language);
        });
        String expectedMessage = "MerchantStore cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    void saveCatalogTestNUllLanguageTest() {
        Exception exception = assertThrows(Exception.class, () ->{
            PersistableCatalog persistableCatalog = new PersistableCatalog();
            MerchantStore merchantStore = new MerchantStore();
            Language language = null;
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            ReadableCatalog result = catalogFacade.saveCatalog(persistableCatalog, merchantStore, language);
        });
        String expectedMessage = "Language cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    void deleteCatalogNullMercTest(){
        Exception exception = assertThrows(Exception.class, () ->{
            long catalogId = 1123l;
            MerchantStore merchantStore = null;
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.deleteCatalog(catalogId, merchantStore, language);
        });
        String expectedMessage = "MerchantStore cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void deleteCatalogNullCatalogidTest(){
        Exception exception = assertThrows(Exception.class, () ->{
            long catalogId = -1l;
            MerchantStore merchantStore = new MerchantStore();
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.deleteCatalog(catalogId, merchantStore, language);
        });
        String expectedMessage = "Catalog id cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    void updateCatalogNullId() {
        Exception exception = assertThrows(Exception.class, () ->{
            PersistableCatalog persistableCatalog = new PersistableCatalog();
            long catalogId = -1l;
            MerchantStore merchantStore = new MerchantStore();
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.updateCatalog(catalogId, persistableCatalog,merchantStore, language);
        });
        String expectedMessage = "Catalog id cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void updatecatalog1() {
        Exception exception = assertThrows(Exception.class, () ->{
            PersistableCatalog persistableCatalog = new PersistableCatalog();
            long catalogId = 1223l;
            MerchantStore merchantStore = null;
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.updateCatalog(catalogId, persistableCatalog,merchantStore, language);
        });
        String expectedMessage = "MerchantStore cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void updatecatalog() {
        Exception exception = assertThrows(Exception.class, () ->{
            PersistableCatalog persistableCatalog = new PersistableCatalog();
            long catalogId = 1223l;
            MerchantStore merchantStore = new MerchantStore();
            Language language = null;
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.updateCatalog(catalogId, persistableCatalog,merchantStore, language);
        });
        String expectedMessage = "Language cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getCatalogNullCodeTest1(){
        Exception exception = assertThrows(Exception.class, () ->{

            String code = null;
            MerchantStore merchantStore = new MerchantStore();
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.getCatalog(code, merchantStore, language);
        });
        String expectedMessage = "Catalog code cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getCatalogNullStoreTest1(){
        Exception exception = assertThrows(Exception.class, () ->{

            String code = "SA30";
            MerchantStore merchantStore = null;
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.getCatalog(code, merchantStore, language);
        });
        String expectedMessage = "MerchantStore cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getCatalogNullLanguageTest1(){
        Exception exception = assertThrows(Exception.class, () ->{
            String code = "SA30";
            MerchantStore merchantStore = new MerchantStore();
            Language language = null;
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.getCatalog(code, merchantStore, language);
        });
        String expectedMessage = "Language cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void getCatalogNullIdTest2(){
        Exception exception = assertThrows(Exception.class, () ->{
            Long id = null;
            MerchantStore merchantStore = new MerchantStore();
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.getCatalog(id, merchantStore, language);
        });
        String expectedMessage = "Catalog id cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getCatalogNullStoreTest2(){
        Exception exception = assertThrows(Exception.class, () ->{
            long id = 123l;
            MerchantStore merchantStore = null;
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.getCatalog(id, merchantStore, language);
        });
        String expectedMessage = "MerchantStore cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getCatalogNullCodeTest3(){
        Exception exception = assertThrows(Exception.class, () ->{
            String code = null;
            MerchantStore merchantStore = new MerchantStore();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.getCatalog(code, merchantStore);
        });
        String expectedMessage = "Catalog code cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getCatalogNullStoreTest3(){
        Exception exception = assertThrows(Exception.class, () ->{

            String code = "SA30";
            MerchantStore merchantStore = null;
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.getCatalog(code, merchantStore);
        });
        String expectedMessage = "MerchantStore cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void addCatalogEntryTest(){
        Exception exception = assertThrows(Exception.class, () ->{

            PersistableCatalogEntry persistableCatalog = null;
            MerchantStore merchantStore = new MerchantStore();
            Language language = new Language();
            CatalogFacadeImpl catalogFacade = new CatalogFacadeImpl();
            catalogFacade.addCatalogEntry(persistableCatalog, merchantStore,language);
        });
        String expectedMessage = "PersistableCatalogEntry cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}