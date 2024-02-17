package com.ramjava.springboot.reaccionar.guias.backend.controller;

import com.ramjava.springboot.reaccionar.guias.backend.model.ReaccionarEmpleado;
import com.ramjava.springboot.reaccionar.guias.backend.repository.RepositorioEmpleados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControladorEmpleados {
    private RepositorioEmpleados repositorioEmpleados;

    public ControladorEmpleados(RepositorioEmpleados repositorioEmpleados) {
        this.repositorioEmpleados = repositorioEmpleados;
    }
    // Get all employees
    @GetMapping("/empleados")
    public List<ReaccionarEmpleado> obtenerTodosLosEmpleados() {
        return repositorioEmpleados.findAll();
    }
}
