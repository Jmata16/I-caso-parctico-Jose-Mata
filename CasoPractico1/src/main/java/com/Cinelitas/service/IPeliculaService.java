package com.Cinelitas.service;

import com.Cinelitas.entity.Pelicula;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IPeliculaService {
    public List<Pelicula> getAll();
    public Pelicula getPeliculaById(long id);
    public void savePelicula(Pelicula pelicula);
    public void delete(long id);
}
