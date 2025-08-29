package br.com.edukacode.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long>{
    //JpaRepository estâo presentes na interface 
}
