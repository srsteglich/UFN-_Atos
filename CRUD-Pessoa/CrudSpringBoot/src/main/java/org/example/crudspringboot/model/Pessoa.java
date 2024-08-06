package org.example.crudspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name = "tbl_pessoas")
public class Pessoa {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true, nullable = false )
    private String email;
    @Column(length = 15)
    private String fone;
}
