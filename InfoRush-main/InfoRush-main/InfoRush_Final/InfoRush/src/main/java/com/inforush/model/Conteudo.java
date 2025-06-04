package com.inforush.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "conteudos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conteudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @Lob
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Area area;

    // outros campos que julgar necessários
}
