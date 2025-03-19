package com.coding.gradebook.controller;

import com.coding.gradebook.service.GradeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeBookController {

    @Autowired
    private GradeBookService gradeBookService;

    //@PostMapping()

}

