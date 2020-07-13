package com.mn.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mn.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Serializable> {

}
