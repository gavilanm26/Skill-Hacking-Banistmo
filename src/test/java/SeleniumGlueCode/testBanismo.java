package SeleniumGlueCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.util.Set;

public class testBanismo extends TestBase{

    @Given("^que ingreso a la pagina web de Bancolombia$")
    public void que_ingreso_a_la_pagina_web_de_Bancolombia() throws Throwable {
        Assert.assertTrue(HomePage.homePageIsDispayed());
    }

    @When("^hago click en el enlace Acerca de Nosotros$")
    public void hago_click_en_el_enlace_Acerca_de_Nosotros() throws Throwable {
        AcercaDeN.acercaDeNosotros();
    }

    @When("^doy click en la opción Información Corporativa$")
    public void doy_click_en_la_opción_Información_Corporativa() throws Throwable {
        AcercaDeN.informacionCoorporativa();
    }

    @When("^Selecciono las opcione Proveedores del menú desplegado$")
    public void selecciono_las_opcione_Proveedores_del_menú_desplegado() throws Throwable {
        AcercaDeN.proveedores();
<<<<<<< HEAD

=======
        
>>>>>>> b2607f6fe43216b711715b2193fcbfd846bf641c
    }

    @When("^por ultimo hago click en el boton Descarga el documento$")
    public void por_ultimo_hago_click_en_el_boton_Descarga_el_documento() throws Throwable {
        Thread.sleep(5000);
        AcercaDeN.descargarDocumento();
    }

    @Then("^Valido que el informe generado sea el correcto$")
    public void valido_que_el_informe_generado_sea_el_correcto() throws Throwable {
<<<<<<< HEAD

=======
>>>>>>> b2607f6fe43216b711715b2193fcbfd846bf641c
        String mainTab = driver.getWindowHandle();
        String url_pdf = "";

        Set<String> handles = driver.getWindowHandles();

        for(String actual : handles){
            if(!actual.equalsIgnoreCase(mainTab)){
                driver.switchTo().window(actual);

                //System.out.println(actual);
                url_pdf = driver.getCurrentUrl();
            }
        }
        leerpdf.leerPDFTest(url_pdf);

        Assert.assertTrue("Archivo PDF no es correcto", leerpdf.isTextInicioDisplayed());
<<<<<<< HEAD

=======
>>>>>>> b2607f6fe43216b711715b2193fcbfd846bf641c
    }

    @When("^hago click en el contact center$")
    public void hago_click_en_el_contact_center() throws Throwable {
        Chat.contactCenter();
    }

    @When("^doy click en la opción de chat en linea$")
    public void doy_click_en_la_opción_de_chat_en_linea() throws Throwable {
        Chat.chatEnLinea();
    }

    @When("^lleno los datos solicitados \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" y doy click en enviar$")
    public void lleno_los_datos_solicitados_y_doy_click_en_enviar(String cedula, String numeroCedula, String pais, String nombre, String apellido, String correo, String telefono, String asunto) throws Throwable {
        Thread.sleep(1000);
        Chat.cedula(cedula);
        Chat.numeroCedula(numeroCedula);
        Chat.pais(pais);
        Chat.nombre(nombre);
        Chat.apellido(apellido);
        Chat.correo(correo);
        Chat.telefono(telefono);
        Chat.asunto(asunto);
        Chat.terminos();
        Chat.submit();
    }

    @Then("^Valido el ingreso exitoso al chat$")
    public void valido_el_ingreso_exitoso_al_chat() throws Throwable {
        Thread.sleep(3000);
        Assert.assertTrue("El documento generado es diferente", ChatBienvenido.isTextInicioDisplayed());
    }
}
