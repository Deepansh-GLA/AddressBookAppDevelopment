package com.example.AddressBookAppDevelopment.service;


import com.example.AddressBookAppDevelopment.DTOs.AddressBookDTO;
import com.example.AddressBookAppDevelopment.model.AddressBook;

import java.util.List;

public interface AddressBookService {
    List<AddressBookDTO> getAllAddresses();
    AddressBookDTO getAddressById(Long id);
    AddressBookDTO createAddress(AddressBookDTO addressBookDTO);
    AddressBookDTO updateAddress(Long id, AddressBookDTO addressBookDTO);
    void deleteAddress(Long id);
}