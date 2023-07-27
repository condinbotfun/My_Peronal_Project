package com.imroz.condinbotfun.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imroz.condinbotfun.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}