package com.hospital.controller;

import com.hospital.model.*;
import com.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(\"/api\")
public class HospitalController {

    @Autowired
    private HospitalService service;

    @GetMapping(\"/patients\")
    public List<Patient> getPatients() { return service.getAllPatients(); }

    @PostMapping(\"/patients\")
    public Patient createPatient(@RequestBody Patient p) { return service.savePatient(p); }

    @GetMapping(\"/doctors\")
    public List<Doctor> getDoctors() { return service.getAllDoctors(); }

    @PostMapping(\"/doctors\")
    public Doctor createDoctor(@RequestBody Doctor d) { return service.saveDoctor(d); }

    @GetMapping(\"/appointments\")
    public List<Appointment> getAppointments() { return service.getAllAppointments(); }

    @PostMapping(\"/appointments\")
    public Appointment createAppointment(@RequestBody Appointment a) { return service.saveAppointment(a); }
}
