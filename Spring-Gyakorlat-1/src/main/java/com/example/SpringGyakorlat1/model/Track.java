package com.example.SpringGyakorlat1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "Track")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Track {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    protected String id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Album album;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private MusicProvider musicProvider;

    @Column(nullable = false)
    protected String trackName;

    @Column(nullable = false)
    protected String trackLength;

    @Column(nullable = false)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    protected String licencePrice;
}
