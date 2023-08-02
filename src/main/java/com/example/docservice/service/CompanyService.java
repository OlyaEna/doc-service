package com.example.docservice.service;



import com.example.docservice.model.dto.CompanyDto;
import com.example.docservice.model.dto.CompanyRequest;

import java.util.List;

public interface CompanyService {
    List<CompanyDto> findAll();
    CompanyDto save(CompanyRequest dto);

    void delete(String id);

    CompanyDto update(CompanyRequest dto);
    CompanyDto findById(String id);
}
