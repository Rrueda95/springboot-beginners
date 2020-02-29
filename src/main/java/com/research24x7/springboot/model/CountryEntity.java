package com.research24x7.springboot.model;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "country")
public class CountryEntity implements Serializable {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="cou_id", unique=true, nullable=false)
    private Long id;

    @Column(name="cou_name", nullable=false, length=64)
    private String name;
}