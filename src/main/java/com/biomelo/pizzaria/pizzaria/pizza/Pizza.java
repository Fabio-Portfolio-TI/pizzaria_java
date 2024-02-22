package com.biomelo.pizzaria.pizzaria.pizza;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Pizza")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Tipo de composição que vem de outra Classe
    private String nome;

    // BigDecimal => Utilizado para dinheiro
    private double preco;

    private boolean disponivel;

    // Tipo de composição que vem de outra Classe
    @Enumerated
    private Tamanho tamanho; // ENUM

    // Tipo de composição que vem de outra Classe
    @Enumerated
    private Sabor sabor;
}
