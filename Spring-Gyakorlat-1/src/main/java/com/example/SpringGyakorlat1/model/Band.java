package com.example.SpringGyakorlat1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "Bands")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Band {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    protected String id;


    @Column(nullable = false)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    protected String bandGenre;

    @Column(nullable = false)
    protected String bandName;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    protected LocalDateTime createdAt;

    @OneToMany(mappedBy = "band")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Album> albums;


}
