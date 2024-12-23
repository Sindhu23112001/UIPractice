
package com.studentdetails1.studentdetails1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails1")
public class studentdetails1 {
    @Id
    private String id;
    private String name;
    private String number;
    private String address;
    public studentdetails1() {
    }
    public studentdetails1(String id, String name, String number, String address) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
