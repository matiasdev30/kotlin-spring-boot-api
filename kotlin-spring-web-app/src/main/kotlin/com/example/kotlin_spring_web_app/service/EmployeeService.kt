package com.example.demo.service

import com.example.demo.model.EmployeeModel
import com.example.demo.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService (var repository: EmployeeRepository){

    fun createEmployee(messageModel: EmployeeModel) : EmployeeModel = repository.save(messageModel)

    fun listEmployee() : List<EmployeeModel> = repository.findAll()

    fun deleteEmployee(id: Long) = repository.deleteById(id)

    fun updateEmployee(id: Long, employeeModel: EmployeeModel): EmployeeModel {
        employeeModel.id = id
        return repository.save(employeeModel)
    }
}