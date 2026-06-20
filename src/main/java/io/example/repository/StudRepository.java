package io.example.repository;

import io.example.model.Stud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudRepository extends JpaRepository<Stud, Long> {

    @Query("SELECT s FROM Stud s")
    List<Stud> getAllData();
}
