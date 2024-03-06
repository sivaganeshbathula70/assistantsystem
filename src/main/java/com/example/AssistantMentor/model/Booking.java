package com.example.AssistantMentor.model;
import jakarta.persistence.*;
@Table
@Entity
public class Booking {
    @Id
    @GeneratedValue
    private int bookingId;
    private String bookingDate;
    private String AppointTime;
    private String Location;
    private String AppointmentStatus;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="mentorId")
    private Mentor mentor;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="studentId")
    private Student student;
}
