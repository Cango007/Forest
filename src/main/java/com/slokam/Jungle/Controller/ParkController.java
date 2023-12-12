package com.slokam.Jungle.Controller;


import java.util.Optional;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Jungle.Dao.ParkDao;
import com.slokam.Jungle.Entity.NationalPark;
import com.slokam.Jungle.Exception.ParkNotFoundException;
import com.slokam.Jungle.Service.ParkService;

@RestController
@RequestMapping("/park")
public class ParkController {
	
@Autowired
	private ParkService parkService;

    @PostMapping("/save")
    public ResponseEntity<NationalPark>  saveNationalPark(@RequestBody NationalPark nationalPark)
    {
    	return new ResponseEntity<NationalPark>(parkService.saveNationalPark(nationalPark),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<NationalPark>  updateNationalPark(@RequestBody NationalPark nationalPark)
    {
    	return new ResponseEntity<NationalPark>(parkService.saveNationalPark(nationalPark),HttpStatus.CREATED);
    }
    @GetMapping("/findAllparks")
    public ResponseEntity<String> findAllParks(NationalPark nationalPark)
    {
   return new ResponseEntity<String>("Get Success",HttpStatus.OK);

    }
   @GetMapping("/findById/{nationalparkId}") 
   public  NationalPark findById(@PathVariable("nationalparkId") Integer nationalparkId)  throws ParkNotFoundException
   {
	    
    Optional<NationalPark> np = parkService.getById(nationalparkId);
    if(np.isPresent())
    {
    	return np.get();
    }
    else
    {
    	throw new ParkNotFoundException("aa");
    }
	   
	  
   }
   @DeleteMapping("/deleteById/{nationalparkId}")
   public void deleteById(@PathVariable ("nationalparkId") Integer nationalparkId) throws ParkNotFoundException
   {
	   Optional<NationalPark> opt = parkService.getById(nationalparkId);
	   
	   if(opt.isEmpty())
	   {
		   throw new ParkNotFoundException("NOt Deleted");
	   }
	   else
	   {
		  parkService.deleteById(nationalparkId);
	   }
   }
   

}
