package com.example.AssistantMentor.controller;
import com.example.AssistantMentor.model.Mentor;
import com.example.AssistantMentor.model.Student;
import com.example.AssistantMentor.service.MentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/assistant")
public class StudentController {
    @Autowired
    MentoService mentoService;

    @PostMapping("/addmentor")
    public Mentor addMentor(@RequestBody Mentor mentor){
       return  mentoService.addMentor(mentor);
    }
    @PutMapping("/updatementor")
    public Mentor updateMenntor(@RequestBody Mentor mentor)
    {
        return mentoService.updateMentor(mentor);
    }
    @DeleteMapping("/{mentorId}")
    public void deleteMentor(@PathVariable int mentorId){
        mentoService.deleteMentor(mentorId);
    }
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return mentoService.addStudent(student);
    }
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        //mentoService.deleteMentor();
    }
}
