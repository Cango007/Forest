package com.slokam.Jungle.ServiceImpl;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Jungle.Dao.ParkDao;
import com.slokam.Jungle.Entity.NationalPark;
import com.slokam.Jungle.Exception.ParkNotFoundException;
import com.slokam.Jungle.Service.ParkService;

@Service
public class ParkServiceImpl implements ParkService {
	
	@Autowired
	private ParkDao parkDao;

	@Override
	public List<NationalPark> getAllNationalParks(NationalPark nationalPark) {
		// TODO Auto-generated method stub
		return parkDao.findAll();
	}

	@Override
	public NationalPark saveNationalPark(NationalPark nationalPark) {
		// TODO Auto-generated method stub
		return parkDao.save(nationalPark);
	}

	@Override
	public void updateNationalPark(NationalPark nationalPark) {
		// TODO Auto-generated method stub
		parkDao.save(nationalPark);
	}

	@Override
	public Optional<NationalPark> getById(Integer nationalParkId) {
		// TODO Auto-generated method stub
		return parkDao.findById(nationalParkId);
	

	}

	@Override
	public void deleteById(Integer nationalParkId) {
		// TODO Auto-generated method stub
		parkDao.deleteById(nationalParkId);
	}

}
