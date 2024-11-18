package com.shakthi.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shakthi.entity.RegisterEntity;
import com.shakthi.repository.RegisterRepo;
import com.shakthi.serviceInterface.RegisterService;

@Service
public class RegisterServiceImple implements RegisterService {
    @Autowired
    private RegisterRepo repo;

    @Override
    public void saveUser(RegisterEntity entity) {    
        repo.save(entity);
        System.out.println("Saved succesfully...");
    }

   

}
