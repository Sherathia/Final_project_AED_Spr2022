/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organisaton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saisr
 */
public class VaccineManuDirectory {
    public List<VaccineManuf> vaccineManufList;
    
    public VaccineManuDirectory()
    {
        vaccineManufList = new ArrayList<>();
    }

    public List<VaccineManuf> getVaccineManufList() {
        return vaccineManufList;
    }

    public void setVaccineManufList(List<VaccineManuf> vaccineManufList) {
        this.vaccineManufList = vaccineManufList;
    }
    

}
