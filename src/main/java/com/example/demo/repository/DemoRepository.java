package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.DemoEntity;

// Repositories are used to manipulate the database

@Repository
public interface DemoRepository extends PagingAndSortingRepository<DemoEntity, Integer> {
}
