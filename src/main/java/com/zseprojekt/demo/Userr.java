package com.zseprojekt.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Userr {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password; //TODO - hashowac haslo(albo jakkolwiek je szyfrowac)

}
