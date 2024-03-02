package com.biomelo.pizzaria.pizzaria.pizza;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Pizza")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private double preco;

    private boolean disponivel;

    @Enumerated
    private Tamanho tamanho; // ENUM

    @Enumerated
    private Sabor sabor;
}
