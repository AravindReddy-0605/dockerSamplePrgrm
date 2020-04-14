
package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.classes.MyClass;

@Repository
public interface SpringDao extends JpaRepository<MyClass, Integer> {

}
