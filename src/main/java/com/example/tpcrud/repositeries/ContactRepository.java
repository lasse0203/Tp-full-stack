package com.example.tpcrud.repositeries;

import com.example.tpcrud.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository <Contact, Long> {
}
