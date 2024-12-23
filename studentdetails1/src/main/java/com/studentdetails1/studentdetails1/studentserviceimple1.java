package com.studentdetails1.studentdetails1;

//import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentserviceimple1 implements studentservice1 {
    studentrepo1 repo;

    public studentserviceimple1(studentrepo1 repo) {
        this.repo = repo;
    }

    @Override
    public String createstudentdetails1(studentdetails1 det) {
        repo.save(det);
        return "created";
    }

    @Override
    public String updatestudentdetails1(studentdetails1 det) {
        repo.save(det);
        return "updated";
    }

    @Override
    public String deletestudentdetails1(String id) {
        repo.deleteById(id);
        return "Deleted";
    }

    @Override
    public studentdetails1 getstudentdetails1(String id) {
        return repo.findById(id).get();
    }

    /*// @Override
    public List<studentdetails1> getallStudentdetails1s() {
        return repo.findAll();
    }*/

}
