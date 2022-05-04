package com.example.hibernateuploadfilespringboot.repository;


import com.example.hibernateuploadfilespringboot.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

}