/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organisaton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author saisr
 */
public class HospitalDirectory {
    private List<Hospitals> HospitalList;
    
     public HospitalDirectory() {
        HospitalList = new ArrayList<>();
    }

    public List<Hospitals> getHospitalList() {
        return HospitalList;
    }

    public void setHospitalList(List<Hospitals> HospitalList) {
        this.HospitalList = HospitalList;
    }
     
}