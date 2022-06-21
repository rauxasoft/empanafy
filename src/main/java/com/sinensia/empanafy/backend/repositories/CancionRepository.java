package com.sinensia.empanafy.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.empanafy.backend.model.Cancion;

public interface CancionRepository extends JpaRepository<Cancion,String> {

}
