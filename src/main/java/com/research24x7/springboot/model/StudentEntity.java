
package com.research24x7.springboot.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.*;
import org.apache.commons.lang3.builder.EqualsExclude;
import org.apache.commons.lang3.builder.HashCodeExclude;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {

    @Id
    @Column(name = "stu_dni", nullable = false, unique = true)
    private String dni;

    @Column(name = "stu_name", nullable = false, length = 64)
    private String name;

    @Column(name = "stu_last_name", nullable = false, length = 64)
    private String lastName;

    @Column(name = "stu_street", nullable = false, length = 64)
    private String street;

    @Column(name = "stu_postal", nullable = false, length = 10)
    private String postal;

    @Column(name = "stu_street_number", nullable = false)
    private Long streetNumber;

    @ManyToOne
    @JoinColumn (name="cou_id")
    private CountryEntity nationality;
}