package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
public class Team1 {

    @Id
    @GeneratedValue
    int teamId;
    String teamName;

    @JsonIgnore
    int userId;
    @JsonIgnore
    int matchId;
    @JsonIgnore
    int captainId;
    @JsonIgnore
    int vcaptainId;
    double totalScore;

    @Transient
    int rank;
}
