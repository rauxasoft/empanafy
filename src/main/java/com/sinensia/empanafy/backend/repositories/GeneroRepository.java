package com.sinensia.empanafy.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.empanafy.backend.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>{
	
	List<Genero> findByNombreStartsWithIgnoringCase(String genero);
	List<Genero> findByNombreContainsIgnoringCaseOrderByNombre(String genero);
	List<Genero> findByObservacionesNotNull();
	List<Genero> findByObservacionesNull();
	
//	@Query(value="SELECT (NAME, OBSERVACIONES) FROM GENEROS",nativeQuery = true)
//	List<Genero> dameGenerosUsandoSQLDeTodaLaVida();
	
}
