package no.billy.KotlinSpringButikk.controller

import no.billy.KotlinSpringButikk.model.Customer
import no.billy.KotlinSpringButikk.repo.CustomerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ApplicationController {

    @Autowired
    lateinit var customerRepo: CustomerRepo

    @GetMapping("/")
    @ResponseBody
    fun customers(): List<Customer> = customerRepo.findAll()

}