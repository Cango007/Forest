package com.slokam.Jungle.Service;

import java.util.List;
import java.util.Optional;

import com.slokam.Jungle.Entity.NationalPark;

public interface ParkService {
	
	
	public List<NationalPark> getAllNationalParks(NationalPark nationalPark);
	
	public NationalPark saveNationalPark(NationalPark nationalPark);
	
	public void updateNationalPark(NationalPark nationalPark);
	
	public Optional<NationalPark> getById(Integer nationalParkId);
	
	public void deleteById(Integer nationalParkId);

}
