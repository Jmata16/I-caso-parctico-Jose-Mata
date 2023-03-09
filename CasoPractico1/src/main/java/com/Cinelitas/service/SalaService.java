package com.Cinelitas.service;

import com.Cinelitas.entity.Sala;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Cinelitas.repository.SalaRepository;

/**
 *
 * @author jdmat
 */
@Service
public class SalaService implements ISalaService{
       @Autowired
    private SalaRepository artistaRepository;

    @Override
    public List<Sala> listHall() {
        return (List<Sala>) artistaRepository.findAll();} 
}
