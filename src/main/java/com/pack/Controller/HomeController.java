package com.pack.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pack.Entity.Student;
import com.pack.Service.StudentService;




@Controller
@RequestMapping("/list")
public class HomeController {
	

	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	//mapping for home Page
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	//mapping for registration Page
	@RequestMapping("/register")
	public String Register(Model m){
		Student s=new Student();
		m.addAttribute("student", s);
		return "register";
	}
	//mapping for list of student
	@RequestMapping(value="", method=RequestMethod.GET)
    public ModelAndView listOFStud() {
        ModelAndView model = new ModelAndView("list");
        model.addObject("studentlist", studentService.ListofStu());
        return model;
    }
	//mapping for data insertion 
	@RequestMapping(value="/saveData", method = RequestMethod.POST)
	public ModelAndView saveStudent(
			@ModelAttribute("student") Student student){
		
		ModelAndView model=new ModelAndView("list");
		if(student!=null){
			studentService.saveStu(student);
			model.addObject("Data insertion success");
		}else model.addObject("Bad Credential");
		
		return new ModelAndView("redirect:/list");
	}
	//mapping for showing updation form // data coming for update
	@RequestMapping(value="/{reg_no}/update", method = RequestMethod.GET)
	public ModelAndView updateStu(
			@PathVariable("reg_no") Integer reg_no ){
		ModelAndView m=new ModelAndView("update");
		Optional<Student> student=studentService.getStuById(reg_no);
		m.addObject("student", student.get());
		return m;
	}
	//mapping for data coming for updation
	@RequestMapping(value="/{reg_no}/saveData")
	public ModelAndView saveUpdatedStudent(
			@ModelAttribute("student") Student student){
		
		ModelAndView model=new ModelAndView("list");
		studentService.updateStu(student);
		return new ModelAndView("redirect:/list");
	}
	//mapping for data coming for delete
	@RequestMapping("/{reg_no}/delete")
	public ModelAndView deleteStu(@PathVariable Integer reg_no){
		
		studentService.deleteStu(reg_no);
		return new ModelAndView("redirect:/list");
	}
	
	
}
