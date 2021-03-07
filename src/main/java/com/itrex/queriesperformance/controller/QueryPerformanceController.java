package com.itrex.queriesperformance.controller;

import com.itrex.queriesperformance.service.QueryPerformanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QueryPerformanceController {

    private final QueryPerformanceService queryPerformanceService;
}
