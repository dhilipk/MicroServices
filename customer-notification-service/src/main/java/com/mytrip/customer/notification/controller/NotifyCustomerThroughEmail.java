package com.mytrip.customer.notification.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.common.customer.vo.CustomerAccountVo;

@RestController
@RequestMapping(path = "/v1")
@EnableResourceServer
public class NotifyCustomerThroughEmail {

    @PreAuthorize(value = "hasRole('R')")
    @RequestMapping(path = "/notify/{id}", method = RequestMethod.GET)
    public CustomerAccountVo notify(@PathVariable(name = "id", required = true)String id) {
        CustomerAccountVo accountVo = new CustomerAccountVo();
        accountVo.setId(id);
        return accountVo;
    }
}
