package com.example.schooldatabase.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "contact",
                column = @Column(name = "guardian_contact")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        )
})
public class Guardian {

    private String name;
    private String contact;
    private String email;
}
