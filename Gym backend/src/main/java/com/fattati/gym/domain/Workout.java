package com.fattati.gym.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fattati.gym.enums.workouts.*;
import com.fattati.gym.enums.workouts.ChestAndTriceps;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
public class Workout {

    @Id
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID id;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    @Nullable
    @ElementCollection(targetClass = ChestAndTriceps.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "workouts_chestAndTriceps", joinColumns = @JoinColumn(name = "workout_id"))
    @Column(name = "chestAndTriceps")
    @Enumerated(EnumType.ORDINAL)
    private Set<ChestAndTriceps> chestAndTriceps;

    @Nullable
    @ElementCollection(targetClass = BackAndBiceps.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "workouts_backAndBiceps", joinColumns = @JoinColumn(name = "workout_id"))
    @Column(name = "backAndBiceps")
    @Enumerated(EnumType.ORDINAL)
    private Set<BackAndBiceps> backAndBiceps;

    @Nullable
    @ElementCollection(targetClass = LegsAndAbs.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "workouts_legsAndAbs", joinColumns = @JoinColumn(name = "workout_id"))
    @Column(name = "legsAndAbs")
    @Enumerated(EnumType.ORDINAL)
    private Set<LegsAndAbs> legsAndAbs;

    @Nullable
    @ElementCollection(targetClass = BackAndShoulders.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "workouts_backAndShoulders", joinColumns = @JoinColumn(name = "workout_id"))
    @Column(name = "backAndShoulders")
    @Enumerated(EnumType.ORDINAL)
    private Set<BackAndShoulders> backAndShoulders;


    public List<String> getChestAndTriceps() {
        List<String> list = new ArrayList<>();
        for (ChestAndTriceps element: chestAndTriceps){
            list.add(element.getChestAndTriceps());
        }
        return list;
    }

    public List<String> getBackAndBiceps() {
        List<String> list = new ArrayList<>();
        for (BackAndBiceps element: backAndBiceps){
            list.add(element.getBackAndBiceps());
        }
        return list;
    }

    public List<String> getLegsAndAbs() {
        List<String> list = new ArrayList<>();
        for (LegsAndAbs element: legsAndAbs){
            list.add(element.getLegsAndAbs());
        }
        return list;
    }

    public List<String> getBackAndShoulders() {
        List<String> list = new ArrayList<>();
        for (BackAndShoulders element: backAndShoulders){
            list.add(element.getBackAndShoulders());
        }
        return list;
    }

    public Workout() {
        this.id = UUID.randomUUID();
    }
}
