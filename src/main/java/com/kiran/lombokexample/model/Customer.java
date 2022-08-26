package com.kiran.lombokexample.model;


import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;


}
