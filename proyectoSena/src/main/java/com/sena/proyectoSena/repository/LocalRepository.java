package com.sena.proyectoSena.repository;

import com.sena.proyectoSena.entity.Local;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocalRepository extends JpaRepository<Local,Long> {


}
