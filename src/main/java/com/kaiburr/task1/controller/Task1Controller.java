package com.kaiburr.task1.controller;

import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kaiburr.task1.dao.CarData;
import com.kaiburr.task1.myentities.Cars;

@RestController
public class Task1Controller {
	
	@Autowired
	private CarData cardata;
	
	//Displays a welcome message
	@GetMapping("/homepage")
	public String myHome() {
		return "Hello there, Welcome to the Homepage of Cars Store";
	}
	
	//Retrieves all Car objects.
	@GetMapping("/allcars")
	public ResponseEntity<?> getCars() {
		return ResponseEntity.ok(this.cardata.findAll());
	}
	
	//Retrieves the Car object with the specified id number.
	@GetMapping("/allcars/{carid}")
	public ResponseEntity<?> searchCar(@PathVariable BigInteger carid) {
		try {
			Cars details = this.cardata.findById(carid).get();
			return ResponseEntity.ok(details);	
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}

	//Adds a new Car object.
	@PostMapping("/allcars")
	public ResponseEntity<?> newCar(@RequestBody Cars car) {
		Cars details = this.cardata.save(car);
		return ResponseEntity.ok(details);
	}
	
	//Updates the car object.
	@PutMapping("/allcars")
	public ResponseEntity<?> updateCar(@RequestBody Cars car) {
		Cars details = this.cardata.save(car);
		return ResponseEntity.ok(details);
	}
	
	//Deletes the car object.	
	@DeleteMapping("/allcars/{carid}")
	public ResponseEntity<?> removeCar(@PathVariable BigInteger carid) {
			Cars details = cardata.findById(carid).get();
			cardata.delete(details);
			return ResponseEntity.ok(details);
	}
	
//	@GetMapping("/allcars/{carname}")
//	public List<Cars> carName(@PathVariable String carname) {
//		return this.cardata.carName
}