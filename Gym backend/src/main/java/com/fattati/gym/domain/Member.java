package com.fattati.gym.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Member {

    @Id
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID id;
    private int age;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date joinDate;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @OneToMany(targetEntity = Workout.class)
    @CollectionTable(name = "member_workouts", joinColumns = @JoinColumn(name = "memberId"))
    private Set<Workout> workout;

    @ManyToOne
    @JoinColumn(name = "trainer_id", nullable = true, unique = false)
    private Trainer trainer;




    public Member() {
        this.id = UUID.randomUUID();
    }
}
