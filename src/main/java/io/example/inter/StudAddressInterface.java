package io.example.inter;

import io.example.model.Stud;

import java.util.List;

public interface StudAddressInterface {

    Stud saveData(Stud stud);

    List<Stud> getAllData();

    Stud updateData(Stud stud);

    void deleteData(Long id);


}
