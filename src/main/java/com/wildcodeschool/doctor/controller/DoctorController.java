package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public ResponseEntity<Object> getDoctor(@PathVariable int number) {
        Doctor doctor;
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                // Return 303 if number is valid but not 13
                return ResponseEntity.status(HttpStatus.SEE_OTHER).header("Location", "/").build();
            case 13:
                // Return JSON for the 13th Doctor
                doctor = new Doctor(13, "Jodie Whittaker");
                return ResponseEntity.ok().body(doctor);
            default:
                // Return 404 if number is not valid
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Impossible de récupérer l'incarnation " + number);
        }
    }
}
