package com.sinensia.empanafy.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.empanafy.backend.model.Compositor;

@Repository
public interface CompositorRepository extends JpaRepository<Compositor,Integer> {

}
