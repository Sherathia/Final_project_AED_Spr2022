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
public class InsuranceDirectory {
    public List<Insurance> insuranceList;
    
    public InsuranceDirectory()
    {
        insuranceList = new ArrayList<>();
    }

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
    
}
