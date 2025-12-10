# SpringBoot-Basket

Este proyecto es una completa **API REST para la gestión integral de ligas de baloncesto**, desarrollada con Spring Boot. El sistema permite administrar todos los aspectos relacionados con la competición, desde la creación de ligas y equipos hasta la gestión de fichajes y el registro de estadísticas detalladas de los partidos.

## Funcionalidad del Proyecto

El sistema está dividido en varios módulos interconectados que permiten los siguientes flujos de trabajo:

### 1. Gestión de Competiciones (Ligas y Equipos)
*   **Ligas**: Permite la creación y administración de diferentes competiciones o ligas.
*   **Equipos**: Gestión completa de los clubes. Los equipos se asocian a una liga específica y pueden ser buscados no solo por su ID, sino también filtrando por su nombre y la liga a la que pertenecen, facilitando la navegación y búsqueda en front-ends o clientes externos.

### 2. Gestión de Personal (Jugadores y Entrenadores)
*   **Perfiles Detallados**: Se almacenan datos personales y profesionales tanto de jugadores como de entrenadores.
*   **Vinculación**: Los jugadores y entrenadores están vinculados a los equipos, permitiendo conocer la plantilla actual de cada club.

### 3. Mercado de Fichajes
El sistema incluye un módulo avanzado para la gestión de transferencias:
*   **Histórico y Activos**: Se puede acceder al historial completo de fichajes o consultar exclusivamente los **fichajes activos** en el momento actual.
*   **Filtrado por Temporada**: Permite consultar los movimientos de mercado realizados en una temporada específica (ej. "2023-2024"), lo cual es fundamental para el análisis histórico y la gestión de plantillas por temporada.

### 4. Gestión de Partidos y Estadios
*   **Calendario**: Programación de partidos definiendo equipo local, visitante y fecha.
*   **Búsqueda Avanzada**: Funcionalidad para buscar partidos específicos cruzando los datos del equipo local, equipo visitante y la fecha del encuentro.
*   **Sedes**: Gestión de la información de los estadios donde se disputan los encuentros.

### 5. Estadísticas Deportivas
*   **Rendimiento Individual**: El sistema permite registrar y consultar estadísticas detalladas de cada jugador. Esto es clave para el seguimiento del rendimiento deportivo y la generación de rankings o análisis post-partido.

---

## Documentación Técnica de la API

A continuación se detallan los endpoints técnicos disponibles para interactuar con el sistema.

### 1. Entrenadores (`/api/entrenadores`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Listar todos los entrenadores. |
| `GET` | `/{id}` | Ver detalle de un entrenador. |
| `POST` | `/` | Registrar un nuevo entrenador. |
| `PUT` | `/{id}` | Actualizar datos de un entrenador. |
| `DELETE` | `/{id}` | Eliminar un entrenador. |

### 2. Equipos (`/api/equipos`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Listar todos los equipos. |
| `GET` | `/{id}` | Ver detalle de un equipo. |
| `GET` | `/buscar` | **Búsqueda**: Filtrar por `nombre` y `ligaId`. |
| `POST` | `/` | Crear un nuevo equipo. |
| `PUT` | `/{id}` | Modificar datos de un equipo. |
| `DELETE` | `/{id}` | Eliminar un equipo. |

### 3. Estadios (`/api/estadios`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Listar todos los estadios. |
| `GET` | `/{id}` | Ver detalle de un estadio. |
| `POST` | `/` | Registrar un nuevo estadio. |
| `PUT` | `/{id}` | Actualizar información de un estadio. |
| `DELETE` | `/{id}` | Eliminar un estadio. |

### 4. Estadísticas (`/api/estadisticas`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Consultar registro general de estadísticas. |
| `GET` | `/{id}` | Consultar una estadística específica. |
| `POST` | `/` | Registrar nuevas estadísticas de jugador. |
| `PUT` | `/{id}` | Corregir o actualizar estadísticas. |
| `DELETE` | `/{id}` | Eliminar registro estadístico. |

### 5. Fichajes (`/api/fichajes`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Histórico completo de fichajes. |
| `GET` | `/activos` | **Filtro**: Obtener solo los fichajes vigentes. |
| `GET` | `/temporada/{temporada}` | **Filtro**: Obtener fichajes de una temporada (ej. "24-25"). |
| `GET` | `/{id}` | Ver detalle de un fichaje. |
| `POST` | `/` | Registrar un nuevo fichaje/traspaso. |
| `PUT` | `/{id}` | Actualizar datos de un fichaje. |
| `DELETE` | `/{id}` | Eliminar un registro de fichaje. |

### 6. Jugadores (`/api/jugadores`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Listar todos los jugadores. |
| `GET` | `/{id}` | Ver perfil de un jugador. |
| `POST` | `/` | Registrar un nuevo jugador. |
| `PUT` | `/{id}` | Actualizar perfil de un jugador. |
| `DELETE` | `/{id}` | Eliminar un jugador. |

### 7. Ligas (`/api/ligas`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Listar todas las ligas. |
| `GET` | `/{id}` | Ver detalle de una liga. |
| `POST` | `/` | Crear una nueva competición/liga. |
| `PUT` | `/{id}` | Modificar datos de una liga. |
| `DELETE` | `/{id}` | Eliminar una liga. |

### 8. Partidos (`/api/partidos`)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/` | Calendario completo de partidos. |
| `GET` | `/{id}` | Ver detalles de un partido. |
| `GET` | `/buscar` | **Búsqueda**: Encuentro por `local` (id), `visitante` (id) y `fecha`. |
| `POST` | `/` | Programar un nuevo partido. |
| `PUT` | `/{id}` | Modificar datos de un partido (resultado, fecha, etc). |
| `DELETE` | `/{id}` | Cancelar/Eliminar un partido. |
