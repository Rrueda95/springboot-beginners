
package com.research24x7.springboot.dto;

import java.io.Serializable;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class StudentDTO implements Serializable {

    private String dni;

    private String name;

    private String lastName;

    private String street;

    private String postal;

    private Long streetNumber;

    private String nationality;
}