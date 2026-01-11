# Sistema de Gestión Hospitalaria

## Descripción
Sistema de gestión hospitalaria desarrollado con Spring Boot que permite administrar la información de hospitales, departamentos, doctores, pacientes y citas médicas.

## Tecnologías Utilizadas
- Java 17
- Spring Boot 4.0.1
- Spring Data JPA
- H2 Database
- Lombok
- Maven/Gradle

## Estructura del Proyecto
```
com.davidr.hospital
├── modelo
│   └── entidad
│       ├── Hospital.java
│       ├── Departamento.java
│       ├── Doctor.java
│       ├── Paciente.java
│       └── Cita.java
└── repositorio
    ├── IHospitalRepositorio.java
    ├── IDepartamentoRepositorio.java
    ├── IDoctorRepositorio.java
    ├── IPacienteRepositorio.java
    └── ICitaRepositorio.java
```

## Entidades y Relaciones
- **Hospital** (1) → (N) **Departamento**
- **Departamento** (1) → (N) **Doctor**
- **Doctor** (1) → (N) **Cita**
- **Paciente** (1) → (N) **Cita**

## Cómo ejecutar
1. Clonar el repositorio
2. Abrir en Spring Tool Suite o IntelliJ IDEA
3. Ejecutar como Spring Boot Application
4. La aplicación estará disponible en: http://localhost:8080

## Autor
David R.