package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.dto.LinkRequest;
import com.cmdb.Servaitail.entity.AppCi;
import com.cmdb.Servaitail.service.AppCiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/link")
@RequiredArgsConstructor
public class AppCiController {

    private final AppCiService appCiService;

    @PostMapping
    public AppCi link(@RequestBody LinkRequest linkRequest){
        return appCiService.link(linkRequest.appId,linkRequest.ciId);
    }

}
