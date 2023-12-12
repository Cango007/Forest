package com.slokam.Jungle.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Jungle.Entity.NationalPark;
@Repository
public interface ParkDao extends JpaRepository<NationalPark, Integer>  {

}
