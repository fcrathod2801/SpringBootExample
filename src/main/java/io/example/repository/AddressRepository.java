package io.example.repository;

import io.example.model.AddressOfStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressOfStudent ,Long> {
}
