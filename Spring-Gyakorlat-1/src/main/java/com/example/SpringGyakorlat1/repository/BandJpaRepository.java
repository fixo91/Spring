package com.example.SpringGyakorlat1.repository;
import com.example.SpringGyakorlat1.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BandJpaRepository extends JpaRepository<Band, String> {

//    List<Band> findByBandNameContainingOrAlbumNameContaining(String name);

}
