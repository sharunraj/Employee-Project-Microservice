package com.ust.Employeeinfo.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fullresponse {
    private Long ccode;
    private String name;
    private String department;
    private String designation;
    private List<String> skills;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private int exp;
    private String doj;
    public Project projects;

}
