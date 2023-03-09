package com.Cinelitas.repository;

import com.Cinelitas.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jdmat
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala,Long>{
    
}
