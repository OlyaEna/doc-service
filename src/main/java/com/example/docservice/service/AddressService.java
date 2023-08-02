package com.example.docservice.service;


import com.example.docservice.model.dto.AddressDto;

import java.util.List;

public interface AddressService {

    List<AddressDto> findAll();
    AddressDto save(AddressDto addressDto);

    void delete(String id);

    AddressDto update(AddressDto addressDto);
    AddressDto findById(String id);
}
