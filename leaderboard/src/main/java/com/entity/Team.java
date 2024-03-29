package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "team")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue
    @JsonProperty("teamId")
    int id;
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
    @OneToMany(mappedBy = "team")
    @JsonIgnore
    List<TeamPlayer> teamPlayers;

    @Transient
    int rank;
}
