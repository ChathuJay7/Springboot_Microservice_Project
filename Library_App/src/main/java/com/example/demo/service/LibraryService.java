package com.example.demo.service;


import com.example.demo.entity.Library;
import com.example.demo.repo.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService
{
     @Autowired
     private LibraryRepo libraryRepo;

     public Library insertLibrary(Library library){

         return libraryRepo.save(library);
     }

    public Library getLibraryById(int id){

        return libraryRepo.findById(id).get();
    }

}
