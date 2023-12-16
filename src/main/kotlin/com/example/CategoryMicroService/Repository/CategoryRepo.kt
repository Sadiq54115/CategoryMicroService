package com.example.CategoryMicroService.Repository

import com.example.CategoryMicroService.model.entities.CategoryEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CategRep : CrudRepository<CategoryEntity,Int>