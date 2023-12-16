package com.example.CategoryMicroService.service

import com.example.CategoryMicroService.model.Dto.Requrest.CategoryReqDto
import com.example.CategoryMicroService.model.entities.CateReqDto
import com.example.CategoryMicroService.model.entities.CateResponseDto

import com.example.CategoryMicroService.model.entities.CategoryEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.UUID

import kotlin.random.Random


@Service
class CategoryService(private val categRepo: CategRepo){


    fun getAllCategory():List<CategoryEntity>{
       val list= categRepo.findAll()
        return list
    }


    fun addCategory(categoryEntity: CategoryEntity): CategoryEntity {
        return categRepo.save(categoryEntity)
    }


    fun delectAll(){
        categRepo.deleteAll()
    }

  

}

@Repository
interface CategRepo : JpaRepository<CategoryEntity,Int>