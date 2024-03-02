package com.biomelo.pizzaria.pizzaria.pizza;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final ModelMapper modelMapper;

    public PizzaDTO criarPizza(PizzaDTO pizzaDTO) {
      Pizza pizza =  modelMapper.map(pizzaDTO, Pizza.class);
      pizzaRepository.save(pizza);
      return modelMapper.map(pizza, PizzaDTO.class);
    }
}
