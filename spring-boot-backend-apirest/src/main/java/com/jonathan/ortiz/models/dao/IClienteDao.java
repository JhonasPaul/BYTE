package com.jonathan.ortiz.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.ortiz.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
