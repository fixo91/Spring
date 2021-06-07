package com.example.SpringGyakorlat1.repository;

import com.example.SpringGyakorlat1.model.MusicProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicProviderJpaRepository extends JpaRepository<MusicProvider, String> {

    List<MusicProvider> findByProviderNameContaining(String providerName);

}
