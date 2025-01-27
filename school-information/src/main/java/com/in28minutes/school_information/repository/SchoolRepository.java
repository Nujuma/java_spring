package com.in28minutes.school_information.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.school_information.school.bean.School;

public interface SchoolRepository extends JpaRepository<School,Integer>
{

}