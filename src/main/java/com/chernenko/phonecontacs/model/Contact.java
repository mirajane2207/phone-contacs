package com.chernenko.phonecontacs.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection
    private Set<String> emails;

    @ElementCollection
    private Set<String> numbers;
}
