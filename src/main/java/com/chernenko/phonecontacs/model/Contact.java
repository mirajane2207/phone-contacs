package com.chernenko.phonecontacs.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ElementCollection
    private Set<String> emails;

    @ElementCollection
    private Set<String> numbers;
}
