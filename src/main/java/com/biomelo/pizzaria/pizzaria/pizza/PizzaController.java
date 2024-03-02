package com.biomelo.pizzaria.pizzaria.pizza;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/pizzas")
@RequiredArgsConstructor
public class PizzaController {

    private final PizzaService pizzaService;

    // CREATE READ UPDATE DELETE
    // POST   GET  PUT    DELETE

    @PostMapping
    public void cadastrarPizza(@RequestBody PizzaDTO pizzaDTO){
        pizzaService.criarPizza(pizzaDTO);
    }


}
