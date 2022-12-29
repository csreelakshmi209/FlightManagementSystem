package com.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.entity.Inventory;

@Repository
public interface IInventoryRepo extends JpaRepositoryImplementation<Inventory, Integer> {

}
