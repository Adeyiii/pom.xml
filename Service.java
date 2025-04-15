package com.hospital.service;

import com.hospital.model.*;
import com.hospital.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HospitalService {
    @Autowired private PatientRepository patientRepo;
    @Autowired private DoctorRepository doctorRepo;
    @Autowired private AppointmentRepository appointmentRepo;

    public List<Patient> getAllPatients() { return patientRepo.findAll(); }
    public Patient savePatient(Patient p) { return patientRepo.save(p); }

    public List<Doctor> getAllDoctors() { return doctorRepo.findAll(); }
    public Doctor saveDoctor(Doctor d) { return doctorRepo.save(d); }

    public List<Appointment> getAllAppointments() { return appointmentRepo.findAll(); }
    public Appointment saveAppointment(Appointment a) { return appointmentRepo.save(a); }
}
