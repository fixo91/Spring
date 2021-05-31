package com.example.SpringGyakorlat1.repository;
import com.example.SpringGyakorlat1.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumJpaRepository extends JpaRepository<Album, String> {

    //List<Album> findByAlbumName(String name);

}
