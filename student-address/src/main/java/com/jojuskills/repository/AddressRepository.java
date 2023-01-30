package com.jojuskills.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jojuskills.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
