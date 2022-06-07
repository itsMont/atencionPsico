# Atención Psicológica - Programa 🧠
Este es un programa desarrollado para la materia POO para el parcial 2. Este programa cuenta con una GUI hecha en Swing y una conexión a MySql
Tiene el objetivo de ser un sistema de información donde los estudiantes puedan agendar una cita de apoyo psicológico y posteriormente consultar la información asociada a esta.
## Requerimientos 📝
### Planteamiento
- ~~El practicante de Psicología debe ser registrado con la siguiente información: **nombre**, **correo electrónico** y un **profesor tutor asignado**~~
- ~~Cada profesor tutor tiene **nombre** y **correo electrónico**~~
- ~~Cada estudiante tiene **código, nombre, correo electrónico y carrera**~~
- Cada estudiante podrá ver disponibilidad de practicantes por **fecha y hora**
- El estudiante **podrá agendar una consulta psicológica según la disponibilidad de los practicantes**
- El practicante podrá dar **por iniciada o finalizada una consulta psicológica**
- El practicante podrá ver la **historia clínica** del paciente
- Se puede cambiar el cambio de practicante al momento de reservar. Cita solicitada cambia de estado a "**por asignar**"
### Implementación 💻
- ~~Usted debe utilizar un patrón de datos~~
- ~~Persistencia de datos (el método de su preferencia)~~
- ~~Uso de Colecciones de tipo Set~~
- ~~Imprimir todos los practicantes registrados en el sistema~~
- Obtener la disponibilidad de un practicante, dado su correo electrónico y un rango de tiempo
- ~~Obtener la información de un estudiante a partir de su código~~
- Obtener la información de un practicante a partir de su correo electrónico
- Obtener la información de un profesor tutor a partir de su correo electrónico
- Obtener la iformación de todas las consultas a las que ha asistido un estudiante a partir de su código
- Crear una consulta psicológica. Tiene asociados a un estudiante, un practicante, una fecha y una hora de consulta
- Agregar observaciones referentes al paciente, por parte del practicante, en una consulta psicológica
- Modificar el estado de una consulta psicológica: Cambiar de estado a "creada", "en proceso", "finalizada" o "reasignada"
- Obtener el historial de consultas psicológicas que han recibido todos los estudiantes.
