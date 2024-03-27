package com.springboot.jpa.tutorial.entity;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({
    @AttributeOverride(
        name = "name",
        column = @Column(name = "gurdian_name")
    ),
    @AttributeOverride(
        name = "email",
        column = @Column(name = "gurdian_email_id")
    )}
)
public class Guardian {
    
    private String name;
    private String email;
}
