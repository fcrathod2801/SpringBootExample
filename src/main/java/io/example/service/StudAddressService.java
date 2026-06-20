package io.example.service;

import io.example.inter.StudAddressInterface;
import io.example.model.Stud;
import io.example.repository.AddressRepository;
import io.example.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudAddressService implements StudAddressInterface{

    @Autowired
    StudRepository studRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Stud saveData(Stud stud) {
        if (stud.getAddresses() != null) {
            stud.getAddresses().forEach(address -> {
                address.setStud(stud);
            });
        }
        return studRepository.save(stud);
    }

    @Override
    public List<Stud> getAllData() {
        return studRepository.getAllData();
    }

    @Override
    public Stud updateData(Stud stud) {
        return null;
    }

    @Override
    public void deleteData(Long id) {

    }
}
