package com.example.demo.repo;


import com.example.demo.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<Library,Integer> {
}
