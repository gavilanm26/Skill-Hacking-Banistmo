Feature: Skill Hacking Banistmo
  Como: Usuario
  quiero: ingresar a la pagina web de Bancolombia
  Para: ingresar al enlace Acerca de Nosotros y otras opciones dentro
  y: descargar el documento Políticas de tratamiento y de protección de datos personales de proveedores

  @documentoPoliticas @smoke
  Scenario: Descargar documento Bancolombia
    Given que ingreso a la pagina web de Bancolombia
    When hago click en el enlace Acerca de Nosotros
    And doy click en la opción Información Corporativa
    And Selecciono las opcione Proveedores del menú desplegado
    And por ultimo hago click en el boton Descarga el documento
    Then Valido que el informe generado sea el correcto

    @chat @smoke
  Scenario Outline: diligenciar formulario Chat
    Given que ingreso a la pagina web de Bancolombia
    When hago click en el contact center
    And doy click en la opción de chat en linea
    And lleno los datos solicitados "<cedula>" "<numeroCedula>" "<pais>" "<nombre>" "<apellido>" "<correo>" "<telefono>" "<asunto>" y doy click en enviar
    Then Valido el ingreso exitoso al chat

    Examples:
      | cedula                     | numeroCedula | pais          | nombre   | apellido | correo                    | telefono   | asunto                            |
      | CC - Cédula de Ciudadanía  | 800003       | COLOMBIA      | Mauricio | Gamer    | amantedelacomid@gmail.com | 3134569875 | probando el chat con automatizado |
