package com.tmp.domain.service;

import com.tmp.domain.dto.TmpDTO;
import com.tmp.domain.repository.TmpMapper;
import org.springframework.stereotype.Service;

@Service
public class TmpService {

    TmpMapper tmpMapper;

    public TmpService(TmpMapper tmpMapper) {
        this.tmpMapper = tmpMapper;
    }

    public TmpDTO getDto(){
        return tmpMapper.getDto();
    }
}
