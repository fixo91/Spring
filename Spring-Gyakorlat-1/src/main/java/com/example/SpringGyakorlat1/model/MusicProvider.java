package com.example.SpringGyakorlat1.model;

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
@Table(name = "Providers")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class MusicProvider {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    protected String id;


    @Column(nullable = false)
    protected String providerName;

    @OneToMany(mappedBy = "musicProvider")
    private List<Track> providedTracks;


}
