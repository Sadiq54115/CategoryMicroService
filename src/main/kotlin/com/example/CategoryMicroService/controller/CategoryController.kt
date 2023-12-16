package com.example.CategoryMicroService.controller

import com.example.CategoryMicroService.model.Dto.Requrest.CategoryReqDto
import com.example.CategoryMicroService.model.Dto.Response.CategoryResponseDto
import com.example.CategoryMicroService.model.entities.CateReqDto
import com.example.CategoryMicroService.model.entities.CateResponseDto
import com.example.CategoryMicroService.service.CategoryService
import com.example.CategoryMicroService.model.entities.CategoryEntity
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/category")
class CategoryController(val categoryService: CategoryService){


//127.0.0.1:8083/Category/all
    @GetMapping("/all")
    fun getAll() : ResponseEntity<List<CategoryEntity>> {
        val categorylist = categoryService.getAllCategory()
        return ResponseEntity.ok(categorylist)

    }

    //127.0.0.1:8083/Category/add
    @PostMapping("/add")
    fun addcategory(@RequestBody categoryEntity: CategoryEntity ):ResponseEntity<CategoryEntity>
    {
         val savedcate = categoryService.addCategory(categoryEntity)
        return ResponseEntity<CategoryEntity>(HttpStatus.CREATED)

    }

    //127.0.0.1:8083/Category/add
    @DeleteMapping("/all")
    fun delectCate(){

        categoryService.delectAll()
    }




}
