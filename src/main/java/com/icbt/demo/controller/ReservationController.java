package com.icbt.demo.controller;

import com.icbt.demo.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("v1/reservation")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

}
