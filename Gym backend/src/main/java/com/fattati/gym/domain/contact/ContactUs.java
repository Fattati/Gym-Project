package com.fattati.gym.domain.contact;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class ContactUs {
    @Id
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID id;

    private String email;
    private String fullName;
    private String message;

    public ContactUs() {
        this.id = UUID.randomUUID();
    }
}
