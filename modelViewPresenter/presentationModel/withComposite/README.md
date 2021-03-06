# Mastermind. Solución 9.3. *mvp.pm.+composite*
Santa Tecla  
[parqueNaturalSantaTecla@gmail.com ](mailto:parqueNaturalSantaTecla@gmail.com )  
version 0.0.1  

**Índice**
1. [Requisitos 3. Undo/Redo](#requisitos-3-undo/redo)   
2. [Vista de Lógica/Diseño](#vista-de-lógicadiseño)  
    2.1. [Arquitectura](#arquitectura)  
    2.2. [Paquete mastermind](#paquete-mastermind)  
    2.3. [Paquete mastermind.views](#paquete-mastermind-viewa)  
    2.4. [Paquete mastermind.controllers](#paquete-mastermind-controllers)  
    2.5. [Paquete mastermind.models](#paquete-mastermind-models)  
    2.6. [Paquete mastermind.utils](#paquete-mastermind-utils)  
3. [Calidad del Software](#calidad-del-software)  
    3.1. [Diseño](#diseño)  
4. [Vista de Desarrollo/Implementación](#vista-de-desarrolloimplementación)  
5. [Vista de Despliegue/Física](#vista-de-desplieguefísica)  
6. [Vista de Procesos](#vista-de-procesos)  

## Requisitos 3. *Undo/Redo*<a name="requisitos-3-undo/redo"></a>

| [Youtube](https://www.youtube.com/watch?v=2-hTeg2M6GQ)  <br/>* _Funcionalidad: **Básica +undo/redo**_<br/>  * _Interfaz: **Gráfica** y **Texto**_<br/>  * _Distribución: **Stand Alone**_<br/>  * _Persistencia: **No**_<br/> | ![Texto alternativo](./docs/images/mastermind.jpg) | 
| :------- | :------: |

## Vista de Lógica/Diseño<a name="vista-de-lógicadiseño"></a>

- Modelo/Vista/Presentador con Presentador del Modelo con **Vista Achicda**

### Arquitectura<a name="arquitectura"></a>
![Texto alternativo](./docs/diagrams/out/arquitectura/arquitectura.svg)

### Paquete *mastermind*<a name="paquete-mastermind"></a>
![Texto alternativo](./docs/diagrams/out/paquetes/mastermind.svg)

### Paquete *mastermind.views*<a name="paquete-mastermind-viewa"></a>
![Texto alternativo](./docs/diagrams/out/paquetes/usantatecla.mastermind.views.svg)

### Paquete *mastermind.controllers*<a name="paquete-mastermind-controllers"></a>
![Texto alternativo](./docs/diagrams/out/paquetes/usantatecla.mastermind.controllers.svg)

### Paquete *mastermind.models*<a name="paquete-mastermind-models"></a>
![Texto alternativo](./docs/diagrams/out/paquetes/usantatecla.mastermind.models.svg)

### Paquete *utils*<a name="paquete-mastermind-utils"></a>
![Texto alternativo](./docs/diagrams/out/paquetes/usantatecla.utils.svg)

## Calidad del Software<a name="calidad-del-software"></a>
### Diseño<a name="diseño"></a>
- **Principio de Sustitución de Liskov:** *las vistas preguntan por el tipo de controlador polimórfico.*

## Vista de Desarrollo/Implementación<a name="vista-de-desarrolloimplementación"></a>
![Texto alternativo](./docs/diagrams/out/vistas/desarrollo_implementacion.svg)

## Vista de Despliegue/Física<a name="vista-de-desplieguefísica"></a>
![Texto alternativo](./docs/diagrams/out/vistas/despliegue_fisica.svg)

## Vista de Procesos<a name="vista-de-procesos"></a>

- No hay concurrencia