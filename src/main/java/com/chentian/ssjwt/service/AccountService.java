package com.chentian.ssjwt.service;


import com.chentian.ssjwt.entity.Account;

public interface AccountService {
    public Account findByUsername(String username);
}
