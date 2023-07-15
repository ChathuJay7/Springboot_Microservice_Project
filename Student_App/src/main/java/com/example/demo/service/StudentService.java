package com.example.demo.service;



import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
        public Student getStudentByID(int id){
            return studentRepo.findById(id).get();
     }

    public Student insert(Student student){
        return studentRepo.save(student);
    }
}
