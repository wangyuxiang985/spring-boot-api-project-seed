package com.company.project.service.impl;

import com.company.project.dao.TEmpMapper;
import com.company.project.model.TEmp;
import com.company.project.service.TEmpService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/14.
 */
@Service
@Transactional
public class TEmpServiceImpl extends AbstractService<TEmp> implements TEmpService {
    @Resource
    private TEmpMapper tEmpMapper;

}
