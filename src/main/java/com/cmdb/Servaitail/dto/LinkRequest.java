package com.cmdb.Servaitail.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class LinkRequest {

    public UUID appId;
    public UUID ciId;
}
