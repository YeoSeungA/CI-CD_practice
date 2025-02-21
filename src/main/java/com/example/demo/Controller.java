package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class Controller {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/member/1")
    public ResponseEntity version2() {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("sabun", "1");
        response.put("name", "hong gildong");
        response.put("dept_cd", "CS001023004");
        response.put("dept_nm", "컨테이너 실습");
        response.put("role_cd", "EEF9852");
        response.put("role_nm", "STUDENT");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/dept/{dept-id}")
    public ResponseEntity version3(@PathVariable("dept-id") String id) {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("id", id);
        response.put("dept_cd", "CS001023004");
        response.put("dept_nm", "컨테이너 실습");
        response.put("level", "3");
        response.put("rel_dept_cd", "CS0010230000");
        response.put("rel_dept_nm", "수강생대표팀");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
