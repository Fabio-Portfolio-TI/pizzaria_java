package com.biomelo.pizzaria.pizzaria.pizza;

import org.springframework.data.jpa.repository.JpaRepository;

// extends = herdando de outra classe
// @Repository = versões antigas
public interface PizzaRepository extends JpaRepository<Pizza, Long>{


}
