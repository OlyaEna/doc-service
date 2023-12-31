package com.example.docservice.service;


import com.example.docservice.model.dto.DocumentDto;
import com.example.docservice.model.dto.DocumentRequest;

import java.util.List;

public interface DocumentService {
    List<DocumentDto> findAll();

    DocumentDto save(DocumentRequest dto);

    void delete(String id);

    DocumentDto update(DocumentRequest dto);

    DocumentDto findById(String id);
}
