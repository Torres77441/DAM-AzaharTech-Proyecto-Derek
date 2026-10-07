# Estudio de viabilidad técnica y arquitectura del sistema
**Consultora:** AzaharTech Software Consulting  
**Proyecto:** Simulador de fisicas 2D 
**Desarrollador/a:** Torres Stanciu, Derek 
**Fecha:** 25 de septiembre de 2026  
**Versión:** 1.0 (Sprint 1)  

---

## 1. Diagrama de bloques funcional del sistema
El sistema se descompone en tres subsistemas funcionales coordinados:

```text
+-----------------------------------------------------------------------+
|                       BLOQUE 1: ENTRADA DE DATOS                      |
|  - Captura interactiva por teclado mediante clase Scanner             |
|  - Parámetros de identificación de cliente y volumen de demanda       |
+-----------------------------------┬-----------------------------------+
                                    |
                                    v
+-----------------------------------------------------------------------+
|                    BLOQUE 2: PROCESAMIENTO Y CÁLCULO                  |
|  - Módulo Java en OpenJDK 21                                          |
|  - Descomposición de unidades mediante división entera y módulo (%)   |
|  - Fórmulas de recargos económicos y casting explícito a decimal      |
+-----------------------------------┬-----------------------------------+
                                    |
                                    v
+-----------------------------------------------------------------------+
|                   BLOQUE 3: SALIDA DE INFORMACIÓN                     |
|  - Consola de usuario formateada mediante System.out.printf()         |
|  - Resumen tabular con columnas de ancho fijo y decimales acotados    |
+-----------------------------------------------------------------------+

---

## 2. Estudio de viabilidad técnica

* **Entorno de Ejecución:** Java SE 21 (LTS) garantizando portabilidad multiplataforma mediante la JVM.
* **Requisitos mínimos de hardware:**
    * Procesador con arquitectura x86_64 o ARM64.
    * Memoria RAM mínima: 2 GB (óptima: 4 GB para entorno de pruebas).
    * Espacio en disco: 500 MB libres para instalación del JDK y logs.
* **Análisis de restricciones del Sprint 1:** Se prescinde de bases de datos externas en esta fase inicial; el procesamiento se realiza en memoria volátil de forma secuencial y transparente.

---

## 3. Fuentes técnicas oficiales contrastadas
1. **Documentación Oficial de Java SE 21 (Oracle):** Consulta de especificaciones de tipos primitivos y clase Scanner. URL: `https://docs.oracle.com/en/java/javase/21/`
2. **Guía de Estilo Java de Google:** Estándares de nomenclatura *camelCase* y buenas prácticas de ingeniería de software.
