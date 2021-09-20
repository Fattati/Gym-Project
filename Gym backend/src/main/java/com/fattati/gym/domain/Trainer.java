package com.fattati.gym.domain;

import lombok.Data;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Data
@Entity
public class Trainer {
    @Id
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID id;
    private int age;

    @org.hibernate.annotations.Type(type="uuid-char")
    @ElementCollection
    @CollectionTable(name = "assigned_members", joinColumns = @JoinColumn(name = "trainerId"))
    @Column(name = "assignedMembers")
    private List<UUID> assignedMembers;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;



    public Trainer() {
        this.id = UUID.randomUUID();
    }

    //    @Column(name="assignedMembers")
//    @ElementCollection(targetClass=String.class)
//    private List<String> assignedMembers;
}
