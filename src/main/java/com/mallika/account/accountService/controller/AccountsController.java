package com.mallika.account.accountService.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/accounts")
public class AccountsController {

    @GetMapping(value = "/getAccount")
    public String getAccount(){
        return "Welcome to Account Service via Payment Service";
    }
}
