package com.chentian.ssjwt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.chentian.ssjwt.entity.Account;
import com.chentian.ssjwt.mapper.AccountMapper;
import com.chentian.ssjwt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findByUsername(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        System.out.println(4);
        return accountMapper.selectOne(wrapper);
    }
}
