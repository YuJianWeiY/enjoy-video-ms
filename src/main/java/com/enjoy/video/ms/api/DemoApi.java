package com.enjoy.video.ms.api;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DemoApi {


    @GetMapping("/demos")
    public Long msget(@RequestParam Long id){
        return id;
    }

    @PostMapping("/demos")
    public Map<String, Object> mspost(@RequestBody Map<String, Object> params){
        return params;
    }

    @GetMapping("/timeout")
    public String timeout(@RequestParam Long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "熔断测试";
    }

}
