/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgw.persistence_webchatt.repository;

import java.util.List;
import mgw.domaine_webchatt.entities.Chatteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BigWave
 */
@Repository
public interface ChatteurRepository extends JpaRepository<Chatteur, Long> {

    @Query(nativeQuery = true)
    public List<Chatteur> findChatteurByKeyWord(@Param("search") String search);

//    @Query(nativeQuery = true)
//    public List<Chatteur> findChatteurByLoginAndPassword(@Param("email") String loginEmail, @Param("password") String password);

    public Chatteur findChatteurByLogin(String login);
    
    
}
