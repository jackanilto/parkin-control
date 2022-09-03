package com.api.parkincontrol.controller;

import com.api.parkincontrol.services.ParkingSpotService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("parking-spot")
public class ParkingSpotControler {

    final ParkingSpotService parkingSpotService;

    public ParkingSpotControler(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }


}
