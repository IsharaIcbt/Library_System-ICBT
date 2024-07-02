package com.icbt.demo.service.impl;

import com.icbt.demo.repository.RoleRepository;
import com.icbt.demo.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

}
