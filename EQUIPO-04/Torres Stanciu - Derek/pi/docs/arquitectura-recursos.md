# Arquitectura funcional del sistema y previsión de recursos
**Consultora:** AzaharTech Software Consulting  
**Proyecto Seleccionado:** Simulador de fisicas 2D   
**Desarrollador/a:** Torres Stanciu, Derek  
**Fecha:** 21 de octubre de 2026  
**Versión:** 1.0 (Sprint 2)

---

## 1. Diagrama de Bloques Funcional de la Arquitectura
El siguiente esquema técnico modela visualmente el flujo de información y la descomposición en subsistemas de la solución:

![Diagrama del Simulador de fisicas 2D](img/diagrama-bloques.png)
*Figura 1. Modelo de arquitectura funcional Entrada-Procesamiento-Salida (IPO).*

---

## 2. Descripción de los Subsistemas
* **Subsistema de Entrada (Captura).** [Describe qué componentes capturan los datos de tu cliente y mediante qué mecanismos].
* **Subsistema de Procesamiento (Lógica Java).** [Explica cómo las clases Java y las operaciones matemáticas transforman los datos en memoria].
* **Subsistema de Salida (Presentación).** [Describe el formato y soporte final donde se presentan los resultados al usuario].

---

## 3. Previsión de Recursos Materiales y Humanos
| Categoría de Recurso | Descripción del Elemento | Justificación Técnica en el Proyecto |
| :--- | :--- | :--- |
| **Recursos Humanos** | Desarrollador/a junior (34 h lectivas) | Análisis, documentación en PI, codificación en PR y control en ED. |
| **Hardware de Desarrollo** | PC con procesador x86_64 y 8 GB RAM | Entorno de compilación local y ejecución fluida de IntelliJ IDEA. |
| **Hardware de Despliegue** | Terminal de cliente / Pantalla operativa | Soporte físico para la visualización del software en producción. |
| **Software de Base** | OpenJDK 21 LTS | Entorno de ejecución estándar multiplataforma mediante la JVM. |
| **Herramientas de Gestión** | Apache Maven 3.9+ / Git & GitHub | Automatización de construcción y control de versiones distribuido. |