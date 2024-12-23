package com.studentdetails1.studentdetails1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/studentdetails1")
public class studentdetailscontroller1 {
    studentservice1 service1;

    public studentdetailscontroller1(studentservice1 service1) {
        this.service1 = service1;
    }

    @GetMapping("{id}")
    public studentdetails1 getstudentdetails1(@PathVariable("id") String id) {
        return service1.getstudentdetails1(id);
        
    }

    @PostMapping
    public String createstudentdetails1(@RequestBody studentdetails1 det){
        service1.createstudentdetails1(det);

        return "created successfully";
    }

    @PutMapping
    public String updatestudentdetails1(@RequestBody studentdetails1 det) {
        service1.updatestudentdetails1(det);
        return "updated successfully";
    }

    @DeleteMapping("{id}")
    public String deletestudentdetails1(@PathVariable("id")String id){
        return service1.deletestudentdetails1("id");
    }
    
    //@GetMapping("{id}")
    /*public String getallstudentdetails1(@RequestBody studentdetails1 det) {
         service1.getallstudentdetails1(det);
        return "Retrieved Successfully";
    }*/
    
    
}

