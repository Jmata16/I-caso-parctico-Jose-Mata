package com.Cinelitas.service;

import com.Cinelitas.entity.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Cinelitas.repository.PeliculaRepository;

/**
 * List<Pelicula> getAllPelicula
 *
 * @author jdmat
 */
@Service
public class PeliculaService implements IPeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAll() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaById(long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePelicula(Pelicula lugar) {
        peliculaRepository.save(lugar);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }
}
