package com.example.demo.controller

import com.example.demo.model.EmployeeModel
import com.example.demo.service.EmployeeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(var service: EmployeeService) {

    @GetMapping("/getEmployees")
    fun getMessage(): ResponseEntity<List<EmployeeModel>>  = ResponseEntity.status(HttpStatus.OK).body(service.listEmployee())

    @PostMapping("/createEmployee")
    fun createMessage(@RequestBody messageModel: EmployeeModel) : ResponseEntity<EmployeeModel> = ResponseEntity.status(HttpStatus.CREATED).body(service.createEmployee(messageModel))

    @DeleteMapping("/deleteEmployee")
    fun deleteMessage(@RequestParam("id") id: Long) {
        ResponseEntity.status(HttpStatus.OK).body(service.deleteEmployee(id = id))
    }

    @PutMapping("/updateEmployee")
    fun updateEmploye(@RequestParam("id") id: Long, @RequestBody employeeModel: EmployeeModel) {
        service.updateEmployee(id, employeeModel)
    }
}