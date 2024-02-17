package com.ramjava.springboot.reaccionar.guias.backend.repository;

import com.ramjava.springboot.reaccionar.guias.backend.model.ReaccionarEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpleados extends JpaRepository<ReaccionarEmpleado, Long> {
}
