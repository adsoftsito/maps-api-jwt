package com.grokonez.jwtauthentication.repository;
import java.util.List;

import com.grokonez.jwtauthentication.model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
//    List<Capa> findCapasWithOutGeometryByActivo(Boolean activo);
    

//    @Query(value ="select idestado, idmunicipio, municipio  from Municipios where idestado = ?1")
    @Query(value = "select NEW com.grokonez.jwtauthentication.model.Municipio(c.idestado, c.idmunicipio, c.municipio) from Municipio c where c.idestado=?1 order by c.idmunicipio")
    List<Municipio> findMunicipiosByEstado(Long idestado);

    //Integer findCapaByName(String name);
}