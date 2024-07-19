package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "messages")
data class EmployeeModel(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0, var name: String?, var email: String?)