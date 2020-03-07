package com.research24x7.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractResponseDTO<T> {

    private LocalTime timestamp = LocalTime.now();

    private T body;
}
