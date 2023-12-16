package com.example.CategoryMicroService.model.entities

import jakarta.persistence.*
import java.lang.Error
import javax.annotation.processing.Messager


@Entity
@Table(name ="category" )
data class CategoryEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val cateId:Int,
    @Column(name = "categoryName")
    val categoryName:String
)

data class CateResponseDto(

    val cateId: Int,
    val categoryName: String,
    val messager: String,
    val error: String
)

data class CateReqDto(
    val categoryName: String,
)


