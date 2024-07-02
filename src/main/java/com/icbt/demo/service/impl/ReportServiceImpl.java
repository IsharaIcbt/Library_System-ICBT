package com.icbt.demo.service.impl;

import com.icbt.demo.repository.ReportRepository;
import com.icbt.demo.service.ReportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {
    private final ReportRepository reportRepository;

}
