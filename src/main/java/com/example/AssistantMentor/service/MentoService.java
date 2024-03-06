package com.example.AssistantMentor.service;
import com.example.AssistantMentor.model.Mentor;
import com.example.AssistantMentor.model.Student;
import com.example.AssistantMentor.repository.MentorRepository;
import com.example.AssistantMentor.repository.StudentRepository;
import com.example.AssistantMentor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentoService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    MentorRepository mentorRepository;

    public Mentor  addMentor(Mentor mentor){
        return mentorRepository.save(mentor);
    }
   public Mentor updateMentor(Mentor mentor){
        Mentor mentor1 = mentorRepository.findBymentorId(mentor.getMentorId()).orElse(null);
        mentor1.setMentorName(mentor.getMentorName());
        mentor1.setAppointtime(mentor.getAppointtime());
        mentor1.setExperience(mentor.getExperience());
        mentor1.setStatus(mentor.getStatus());
       // mentor1.set
       return mentor1;
   }
   public void deleteMentor(int mentorId){
         mentorRepository.deleteById(mentorId);
   }

   public Student addStudent(Student student){
        return  studentRepository.save(student);
   }
   public Student updateStudent(Student student){
        Student student1 = studentRepository.findById(student.getStudentId()).orElseThrow(null);
        student1.setStudentName(student.getStudentName());
        student1.setEducation(student.getEducation());
        student1.setAge(student.getAge());
        student1.setStream(student.getStream());
        student1.setSpecilization(student.getSpecilization());
        return student1;
   }


}
