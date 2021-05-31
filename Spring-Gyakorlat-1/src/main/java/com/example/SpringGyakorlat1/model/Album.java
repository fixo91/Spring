package com.example.SpringGyakorlat1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Albums")
@Builder (toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Album {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    protected String id;

    //@JsonIgnore
    @OneToMany(mappedBy = "album")
    private List<Track> trackList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Band band;

    @Column
    protected String albumName;

    @Column(nullable = false)
    protected String releaseDate;
}
