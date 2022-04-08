package com.tmp.domain.repository;

import com.tmp.domain.dto.TmpDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TmpMapper {

    TmpDTO getDto();

}
