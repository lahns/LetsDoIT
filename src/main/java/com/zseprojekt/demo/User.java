package com.zseprojekt.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    private int id;
    private String username;
    private String password; //TODO - hashowac haslo(albo jakkolwiek je szyfrowac)

}
