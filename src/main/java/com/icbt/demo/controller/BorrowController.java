package com.icbt.demo.controller;

import com.icbt.demo.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("v1/borrow")
@RequiredArgsConstructor
public class BorrowController {
    private final BorrowService borrowService;

}
