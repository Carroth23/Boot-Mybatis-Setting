package com.tmp.domain.service;

import com.tmp.domain.dto.TmpDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TmpServiceTest {

    @Autowired
    TmpService tmpService;

    @Test
    @DisplayName("TmpTest")
    void getDto() {
        TmpDTO tmpDTO = tmpService.getDto();
        Assertions.assertThat(tmpDTO.getName()).isEqualTo("Spring");
    }
}