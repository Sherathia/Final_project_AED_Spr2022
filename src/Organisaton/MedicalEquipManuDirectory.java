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
public class MedicalEquipManuDirectory {
    public List<MedicalEquipManu> medicalEquipmentList;
    
    public MedicalEquipManuDirectory()
    {
        medicalEquipmentList = new ArrayList<>();
    }

    public List<MedicalEquipManu> getMedicalEquipmentList() {
        return medicalEquipmentList;
    }

    public void setMedicalEquipmentList(List<MedicalEquipManu> medicalEquipmentList) {
        this.medicalEquipmentList = medicalEquipmentList;
    }
    
}

