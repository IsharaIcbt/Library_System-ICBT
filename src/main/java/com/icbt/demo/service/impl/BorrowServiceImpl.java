package com.icbt.demo.service.impl;

import com.icbt.demo.repository.BorrowRepository;
import com.icbt.demo.service.BorrowService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {
    private final BorrowRepository borrowRepository;

}
