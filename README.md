<img width="381" height="380" alt="image" src="https://github.com/user-attachments/assets/2bbff79e-06db-4cfe-91de-ac5ce8803fe5" />

Sistema de Conteo de Votos y Resultados Electorales

 Descripción

Este proyecto consiste en desarrollar un sistema de conteo de votos en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo, la herencia y la abstracción.

El sistema permite contabilizar los votos de diferentes categorías electorales, como intendentes, concejales y legisladores, utilizando una estructura común y respetando las reglas de validación correspondientes a cada tipo de boleta.

 Objetivo

Implementar un sistema de escrutinio capaz de procesar diferentes categorías de votación mediante un método común, delegando en cada tipo de boleta la responsabilidad de validar y contabilizar los sufragios.

 Clases utilizadas

BoletaElectoral: Clase abstracta que contiene los atributos nombreCandidato y partidoPolitico, además del método abstracto contarVoto(int cantidadEmitida).

BoletaIntendente: Representa las boletas para intendente y define sus propias reglas de conteo.

BoletaConcejales: Representa las boletas para concejales y aplica sus respectivas restricciones de tachas o preferencias.

BoletaLegisladores: Representa las boletas para legisladores y establece su propia lógica de validación.

CentroComputos: Clase encargada de procesar una colección de boletas, realizar el conteo polimórfico y obtener el total de sufragios válidos.

Main: Contiene el método principal, instancia las diferentes boletas y demuestra el funcionamiento del sistema.

 Conceptos aplicados

Programación Orientada a Objetos (POO).

Herencia.

Polimorfismo.

Clases abstractas.

Sobrescritura de métodos (@Override).

Encapsulamiento.

Colecciones de objetos.

Validaciones condicionales.

 Funcionamiento

Se define la clase abstracta BoletaElectoral con los atributos generales y el método contarVoto().

Se crean las clases BoletaIntendente, BoletaConcejales y BoletaLegisladores, cada una con sus propias reglas de conteo.

Se implementan las validaciones correspondientes para determinar qué sufragios son válidos.

La clase CentroComputos recibe y administra una colección de objetos de tipo BoletaElectoral.

Se recorren las boletas y se contabilizan los votos mediante el polimorfismo.

Finalmente, se totalizan los sufragios válidos y se muestra el reporte electoral por consola.

💻 Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

 Resultado esperado

Al ejecutar el programa, el centro de cómputos podrá procesar diferentes categorías electorales utilizando una estructura común. Cada tipo de boleta aplicará sus propias reglas de validación y conteo, mostrando por consola los resultados y el total de sufragios válidos.
