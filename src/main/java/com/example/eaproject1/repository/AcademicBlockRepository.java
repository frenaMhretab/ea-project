package com.example.eaproject1.repository;


import com.example.eaproject1.domian.AcademicBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicBlockRepository extends JpaRepository<AcademicBlock,Long> {
}
