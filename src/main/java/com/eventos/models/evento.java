package com.eventos.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.annotations.NotFound;

@Entity
public class evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para gerar automaticamente
    private long codigo;
    private String nome;
    private String data;
    private String endereco;

}
