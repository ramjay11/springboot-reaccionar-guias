package com.ramjava.springboot.reaccionar.guias.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reaccionar_empleado")
public class ReaccionarEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre_de_pila")
    private String firstName;
    @Column(name = "apellido")
    private String lastName;
    @Column(name = "correo_electronico")
    private String email;

    public ReaccionarEmpleado() {}

    public ReaccionarEmpleado(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
