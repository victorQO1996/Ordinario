package com.uabc.ordi.demo.Repository;

import org.springframework.stereotype.Repository;
import com.uabc.ordi.demo.Entity.TipoAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

@Repository("tipoAnimalRepository")
public interface TipoAnimalRepository extends JpaRepository<TipoAnimal, Serializable> {
        public abstract TipoAnimal findByIdTipoAnimal(String idTipoAnimal);
}

