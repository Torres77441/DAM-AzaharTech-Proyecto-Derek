# Catálogo de requisitos del sistema y fuentes técnicas
**Consultora:** AzaharTech Software Consulting  
**Proyecto Seleccionado:** Simulador de fisicas 2D  
**Cliente / Sector:** Riot Games  
**Desarrollador/a:** Derek Torres Stanciu  
**Fecha:** 14 de octubre de 2026  
**Versión:** 1.0 (Sprint 2)

---

## 1. Alcance y objetivos técnicos del Sprint 2
El objetivo de esta fase es estructurar la lógica del software mediante el uso de objetos estándar y clases predefinidas de Java, gestionando la construcción mediante Apache Maven y definiendo con exactitud el comportamiento esperado del sistema.

---

## 2. Catálogo de Requisitos Funcionales (RF)
| Código | Nombre del Requisito | Descripción técnica obligatoria | Prioridad |
| :---: | :--- | :--- | :---: |
| **RF-01** | Captura de parámetros base | El sistema solicitará interactivamente los identificadores y valores iniciales de la operación del cliente. | Alta |
| **RF-02** | Procesamiento de objetos | El sistema empleará clases predefinidas del lenguaje (Scanner, String, Math) para transformar los datos de entrada. | Alta |
| **RF-03** | Generación de identificador | El sistema compondrá un identificador o código alfanumérico combinando prefijos fijos y marcas de transacción. | Media |
| **RF-04** | Resumen estructurado | El sistema emitirá un informe de resultados formateado sin pérdida de precisión numérica. | Media |

---

## 3. Catálogo de Requisitos No Funcionales (RNF)
| Código | Categoría | Restricción técnica o estándar | Verificación |
| :---: | :--- | :--- | :--- |
| **RNF-01** | Entorno y Plataforma | El software debe compilar y ejecutarse bajo OpenJDK 21 LTS sin librerías externas no estándar. | Inspección de compilación |
| **RNF-02** | Gestión de Proyecto | La estructura de carpetas y dependencias debe regirse bajo el estándar de Apache Maven con su archivo `pom.xml`. | Archivo de configuración |
| **RNF-03** | Calidad de Código | Nombres de variables en camelCase, constantes en UPPER_SNAKE_CASE y código autoformateado. | Revisión de estilo |

---

## 4. Fuentes técnicas oficiales contrastadas
1. **Oracle Java SE 21 Specification:** Documentación de la API estándar para clases del paquete `java.lang` y `java.util`. URL: `https://docs.oracle.com/en/java/javase/21/`
2. **Apache Maven Project Standard Directory Layout:** Especificación oficial de la jerarquía de carpetas en proyectos de software. URL: `https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html`

---

## 5. Registro ético de uso de Inteligencia Artificial (Prompt Log)
| Fecha | Herramienta | Objetivo de la consulta | Prompt introducido | Revisión crítica y ajuste aplicado |
| :---: | :---: | :--- | :--- | :--- |
| 09/10/2026 | ChatGPT / Claude | Redactar requisitos no funcionales | *"Actúa como analista y redacta 2 requisitos no funcionales SMART para..."* | Se adaptaron las métricas de rendimiento y se eliminaron peticiones de bases de datos externas para respetar el Sprint 2. |