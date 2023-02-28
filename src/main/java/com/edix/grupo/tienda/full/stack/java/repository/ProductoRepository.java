package com.edix.grupo.tienda.full.stack.java.repository;

<<<<<<< HEAD
import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
=======
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> main

import com.edix.grupo.tienda.full.stack.java.entitybeans.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
<<<<<<< HEAD
	@Query("Select p from Producto p where p.estado = ?1")
	public List<Producto> findByState(String estado);
	@Query("SELECT p FROM Producto p WHERE p.nombre LIKE %:nombre%")
	public List<Producto> findLikeName(String nombre);
	
	@Query("Select p FROM Producto p where p.tipo.nombreTipo = ?1")
	public List<Producto> findByTipo(String tipo);
=======

>>>>>>> main
}
