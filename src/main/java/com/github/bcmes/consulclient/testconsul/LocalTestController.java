package com.github.bcmes.consulclient.testconsul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalTestController {
    @Autowired
    private LocalTestValues localTestValues;

    @GetMapping("/consul-test")
    public String getMyMessage() {
        return localTestValues.getMessage();
    }
}
