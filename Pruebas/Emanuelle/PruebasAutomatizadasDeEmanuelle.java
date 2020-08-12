package Pruebas.Emanuelle;

import Pruebas.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.junit.*;

import static org.junit.Assert.*;

public class PruebasAutomatizadasDeEmanuelle {

    Base base;

    @Before
    public void setup() throws InterruptedException {

        WebDriver driver = null;
        base = new Base(driver);
        base.firefoxDriverConnection();
        base.visit("http://localhost:8080/admin/logon.html");

        base.setText("admin@shopizer.com", By.id("username"));
        base.setText("password", By.id("password"));
        base.clickId("formSubmitButton");
        Thread.sleep(2000);

    }

    /*
    -------------------------------
        Pruebas automatizadas
    -------------------------------

     */

    @Test
    public void prueba90() {

        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("90",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clearText(By.id("seUrl0"));
        base.setText("www.google.com",By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Keywords de prueba",By.id("descriptions0.metatagKeywords"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Assert.assertEquals("Request completed with success", base.getText(By.id("store.success")));

    }

    @Test
    public void prueba91() {

        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.clearText(By.id("order"));
        base.setText("91",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clearText(By.id("seUrl0"));
        base.setText("www.google.com",By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Keywords de prueba",By.id("descriptions0.metatagKeywords"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Assert.assertEquals("Request completed with success", base.getText(By.id("store.success")));

    }

    @Test
    public void prueba92() {

        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("92",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("seUrl0"));
        base.setText("www.google.com",By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Keywords de prueba",By.id("descriptions0.metatagKeywords"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Assert.assertEquals("", base.getText(By.id("store.success")));

    }

    @Test
    public void prueba93() {

        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("93",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Nombre de prueba extremadamente grandeNombre de prueba extremadamente grande",By.id("name0"));
        base.clearText(By.id("seUrl0"));
        base.setText("www.google.com",By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Keywords de prueba",By.id("descriptions0.metatagKeywords"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Assert.assertEquals("", base.getText(By.id("store.success")));

    }

    @Test
    public void prueba94() {

        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("94",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clearText(By.id("seUrl0"));
        base.setText("www.google.com",By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Assert.assertEquals("Request completed with success", base.getText(By.id("store.success")));

    }

    @Test
    public void prueba95() {

        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.clearText(By.id("order"));
        base.setText("95",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clearText(By.id("seUrl0"));
        base.setText("www.google.com",By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Keywords de prueba",By.id("descriptions0.metatagKeywords"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Assert.assertNotEquals("Request completed with success", base.getText(By.id("store.success")));

    }

    @Test
    public void prueba96() {

        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("96",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clearText(By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Keywords de prueba",By.id("descriptions0.metatagKeywords"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Assert.assertNotEquals("Request completed with success", base.getText(By.id("store.success")));

    }

    @Test
    public void prueba87() throws InterruptedException {

        // Crear una página
        base.redirect("http://localhost:8080/admin/content/pages/create.html");

        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("97",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clearText(By.id("seUrl0"));
        base.setText("www.google.com",By.id("seUrl0"));
        base.clearText(By.id("descriptions0.metatagTitle"));
        base.setText("Titulo de prueba",By.id("descriptions0.metatagTitle"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Keywords de prueba",By.id("descriptions0.metatagKeywords"));
        base.clearText(By.id("descriptions0.metatagDescription"));
        base.setText("Descripción de prueba",By.id("descriptions0.metatagDescription"));

        base.clickClass("btn-success");

        Thread.sleep(1000);

        base.redirect("http://localhost:8080/admin/content/pages/list.html");

        Thread.sleep(1000);
        Actions act = new Actions(base.getDriver());
        WebElement shop = base.getDriver().findElement((By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div[1]/table/tbody[2]/tr/td[5]/div/nobr/img")));
        act.moveToElement(shop).click().build().perform();

        Thread.sleep(1000);

        base.acceptAlert();

        Thread.sleep(1000);

        Assert.assertEquals("No items to show.", base.getText(By.className("emptyMessage")));

    }

    @Test
    public void prueba98() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/boxes/create.html");
        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("98",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertEquals("Request completed with success", base.getText(By.className("alert-success")));

    }

    @Test
    public void prueba99() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/boxes/create.html");
        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertNotEquals("Request completed with success", base.getText(By.className("alert-success")));

    }

    @Test
    public void prueba100() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/boxes/create.html");
        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("100",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertNotEquals("Request completed with success", base.getText(By.className("alert-success")));

    }

    @Test
    public void prueba101() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/boxes/create.html");
        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("101",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clickClass("btn-success");

        base.redirect("http://localhost:8080/admin/content/boxes/create.html");
        base.clickId("visible1");
        base.clickId("linkToMenu1");
        base.clearText(By.id("code"));
        base.setText("101",By.id("code"));
        base.clearText(By.id("order"));
        base.setText("0",By.id("order"));
        base.clearText(By.id("name0"));
        base.setText("Test",By.id("name0"));
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertEquals("Request completed with success", base.getText(By.className("alert-success")));

    }

    @Test
    public void prueba102() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/contentImages.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));
        String path = System.getProperty("user.dir");
        uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\imagenes\\foto.png");
        Thread.sleep(1000);
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertEquals("foto.png",base.getText(By.cssSelector("html body.body div.sm div.container div.row div.span9 div.tabbable div.tab-content div#catalogue-section.tab-pane.active div.sm-ui-component div#isc_B.normal div#isc_C div#isc_3.sectionStack div#isc_4 div#isc_0 div#isc_1 div#isc_J.simpleTile div#isc_K table.normal tbody tr td.name nobr")));

        Thread.sleep(1000);

        Actions act = new Actions(base.getDriver());
        WebElement shop = base.getDriver().findElement((By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/img")));
        act.moveToElement(shop).click().build().perform();
        base.acceptAlert();

    }

    @Test
    public void prueba103() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/contentImages.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));
        String path = System.getProperty("user.dir");
        uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\imagenes\\fotovacia.png");
        Thread.sleep(1000);
        base.clickClass("btn-success");

        Thread.sleep(1000);
        try{
            Assert.assertEquals("fotovacia.png",base.getText(By.cssSelector("html body.body div.sm div.container div.row div.span9 div.tabbable div.tab-content div#catalogue-section.tab-pane.active div.sm-ui-component div#isc_B.normal div#isc_C div#isc_3.sectionStack div#isc_4 div#isc_0 div#isc_1 div#isc_J.simpleTile div#isc_K table.normal tbody tr td.name nobr")));
        }catch(Exception e){
            assertTrue(false);
        }

    }

    @Test
    public void prueba104() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/contentImages.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));
        String path = System.getProperty("user.dir");
        uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\imagenes\\fotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofoto" +
                "ofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofo.png");
        Thread.sleep(1000);
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertEquals("fotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofoto" +
                "ofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofotoofo.png",base.getText(By.cssSelector("html body.body div.sm div.container div.row div.span9 div.tabbable div.tab-content div#catalogue-section.ta" +
                "b-pane.active div.sm-ui-component div#isc_B.normal div#isc_C div#isc_3.sectionStack div#isc_4 div#isc_0 div#isc_1 div#isc_J.simpleTile div#isc_K table.normal tbody tr td.name nobr")));

        Thread.sleep(1000);

        try{
            Actions act = new Actions(base.getDriver());
            WebElement shop = base.getDriver().findElement((By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/img")));
            act.moveToElement(shop).click().build().perform();
            base.acceptAlert();
        }catch (Exception e){

        }

    }

    @Test
    public void prueba105() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/contentImages.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));
        String path = System.getProperty("user.dir");
        uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\imagenes\\prueba_imagen_grande.png");
        Thread.sleep(1000);
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertEquals("prueba_imagen_grande.png",base.getText(By.cssSelector("html body.body div.sm div.container div.row div.span9 div.tabbable div.tab-content div#catalogue-section.tab-pane.active div.sm-ui-component div#isc_B.normal div#isc_C div#isc_3.sectionStack div#isc_4 div#isc_0 div#isc_1 div#isc_J.simpleTile div#isc_K table.normal tbody tr td.name nobr")));

        Thread.sleep(1000);

        try{
            Actions act = new Actions(base.getDriver());
            WebElement shop = base.getDriver().findElement((By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/img")));
            act.moveToElement(shop).click().build().perform();
            base.acceptAlert();
        }catch (Exception e){

        }


    }

    @Test
    public void prueba106() {

        base.redirect("http://localhost:8080/admin/content/contentImages.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));


        try{
            String path = System.getProperty("user.dir");
            uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\imagenes\\prueba.txt");
            Thread.sleep(1000);
            base.clickClass("btn-success");

            Thread.sleep(1000);
            Assert.assertNotEquals("prueba.txt",base.getText(By.cssSelector("html body.body div.sm div.container div.row div.span9 div.tabbable div.tab-content div#catalogue-section.tab-pane.active div.sm-ui-component div#isc_B.normal div#isc_C div#isc_3.sectionStack div#isc_4 div#isc_0 div#isc_1 div#isc_J.simpleTile div#isc_K table.normal tbody tr td.name nobr")));

            Thread.sleep(1000);
            Actions act = new Actions(base.getDriver());
            WebElement shop = base.getDriver().findElement((By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/img")));
            act.moveToElement(shop).click().build().perform();
            base.acceptAlert();
        }catch (InvalidArgumentException | InterruptedException e){
            assertTrue(false);
        }

    }

    @Test
    public void prueba107() {

        base.redirect("http://localhost:8080/admin/content/contentImages.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));


        try{
            String path = System.getProperty("user.dir");
            uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\imagenes\\!#$%&()=.png");
            Thread.sleep(1000);
            base.clickClass("btn-success");

            Thread.sleep(1000);
            Assert.assertEquals("!#$%&()=.png",base.getText(By.cssSelector("html body.body div.sm div.container div.row div.span9 div.tabbable div.tab-content div#catalogue-section.tab-pane.active div.sm-ui-component div#isc_B.normal div#isc_C div#isc_3.sectionStack div#isc_4 div#isc_0 div#isc_1 div#isc_J.simpleTile div#isc_K table.normal tbody tr td.name nobr")));

            Thread.sleep(1000);
            Actions act = new Actions(base.getDriver());
            WebElement shop = base.getDriver().findElement((By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/img")));
            act.moveToElement(shop).click().build().perform();
            base.acceptAlert();
        }catch (InvalidArgumentException | InterruptedException e){
            assertTrue(false);
        }


    }
    


    @Test
    public void prueba088() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/static/contentFiles.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));
        String path = System.getProperty("user.dir");
        uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\archivos\\prueba.txt");
        Thread.sleep(1000);
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertEquals("foto.png",base.getText(By.cssSelector("#isc_Ptable > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > nobr:nth-child(1)")));

        Thread.sleep(1000);

        Actions act = new Actions(base.getDriver());
        WebElement shop = base.getDriver().findElement((By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/table/tbody[2]/tr/td[4]/div/nobr/img")));
        act.moveToElement(shop).click().build().perform();
        Thread.sleep(1000);
        base.acceptAlert();

    }

    @Test
    public void prueba109() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/static/contentFiles.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));
        String path = System.getProperty("user.dir");
        uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\archivos\\prueba.txt");
        Thread.sleep(1000);
        base.clickClass("btn-success");

        Thread.sleep(1000);

        Assert.assertEquals("prueba.txt",base.getText(By.cssSelector("#isc_Ptable > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > nobr:nth-child(1)")));

    }

    @Test
    public void prueba110() throws InterruptedException {

        base.redirect("http://localhost:8080/admin/content/static/contentFiles.html");
        WebElement uploadElement = base.getDriver().findElement(By.className("input-file"));
        String path = System.getProperty("user.dir");
        uploadElement.sendKeys(path + "\\Pruebas\\Emanuelle\\archivos\\prueba_vacia.txt");
        Thread.sleep(1000);
        base.clickClass("btn-success");

        Thread.sleep(1000);

        try {
            Assert.assertNotEquals("prueba_vacia.txt", base.getText(By.cssSelector("#isc_Ptable > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > nobr:nth-child(1)")));
        }catch(Exception e){
            Assert.assertTrue(true);
        }
    }



    @After
    public void close(){
        base.Quit();
    }


}
