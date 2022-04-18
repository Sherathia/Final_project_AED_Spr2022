/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Enterprise.Government.GovernmentDirectory;
import Enterprise.Medical.BloodBankDirectory;
import Enterprise.Medical.HospitalDirectory;
import Enterprise.Medical.InsuranceDirectory;
import Enterprise.Medical.MedicalEquipManuDirectory;
import Enterprise.Medical.VaccineManuDirectory;
import Enterprise.Voluntary.FundraiserDirectory;
import Enterprise.Voluntary.NGODirectory;
import Enterprise.Warehouse.ClothingChainDirectory;
import Enterprise.Warehouse.FoodMarketRtlDirectory;
import Enterprise.Warehouse.TransportAgenciesDirectory;
import Users.UserAccountDirectory;

/**
 *
 * @author aesha
 */
public abstract class Organization{
    
    private String name;
    private int organizationID;
    private static int counter = 0;
    private UserAccountDirectory userAccountDirectory;
    private BloodBankDirectory bloodBankDirectory;
    private HospitalDirectory hospitalDirectory;
    private InsuranceDirectory insuranceDirectory;
    private MedicalEquipManuDirectory medicalEquipManuDirectory;
    private VaccineManuDirectory vaccineManuDirectory;
    private FundraiserDirectory fundraiserDirectory;
    private NGODirectory nGODirectory;
    private GovernmentDirectory governmentDirectory;
    private ClothingChainDirectory clothingChainDirectory;
    private FoodMarketRtlDirectory foodMarketRtlDirectory;
    private TransportAgenciesDirectory transportAgenciesDirectory;
    
   /* public enum OrgType {
        
    }*/
     public Organization(String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
     
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public BloodBankDirectory getBloodBankDirectory() {
        return bloodBankDirectory;
    }

    public void setBloodBankDirectory(BloodBankDirectory bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public InsuranceDirectory getInsuranceDirectory() {
        return insuranceDirectory;
    }

    public void setInsuranceDirectory(InsuranceDirectory insuranceDirectory) {
        this.insuranceDirectory = insuranceDirectory;
    }

    public MedicalEquipManuDirectory getMedicalEquipManuDirectory() {
        return medicalEquipManuDirectory;
    }

    public void setMedicalEquipManuDirectory(MedicalEquipManuDirectory medicalEquipManuDirectory) {
        this.medicalEquipManuDirectory = medicalEquipManuDirectory;
    }

    public VaccineManuDirectory getVaccineManuDirectory() {
        return vaccineManuDirectory;
    }

    public void setVaccineManuDirectory(VaccineManuDirectory vaccineManuDirectory) {
        this.vaccineManuDirectory = vaccineManuDirectory;
    }

    public FundraiserDirectory getFundraiserDirectory() {
        return fundraiserDirectory;
    }

    public void setFundraiserDirectory(FundraiserDirectory fundraiserDirectory) {
        this.fundraiserDirectory = fundraiserDirectory;
    }

    public NGODirectory getnGODirectory() {
        return nGODirectory;
    }

    public void setnGODirectory(NGODirectory nGODirectory) {
        this.nGODirectory = nGODirectory;
    }

    public GovernmentDirectory getGovernmentDirectory() {
        return governmentDirectory;
    }

    public void setGovernmentDirectory(GovernmentDirectory governmentDirectory) {
        this.governmentDirectory = governmentDirectory;
    }

    public ClothingChainDirectory getClothingChainDirectory() {
        return clothingChainDirectory;
    }

    public void setClothingChainDirectory(ClothingChainDirectory clothingChainDirectory) {
        this.clothingChainDirectory = clothingChainDirectory;
    }

    public FoodMarketRtlDirectory getFoodMarketRtlDirectory() {
        return foodMarketRtlDirectory;
    }

    public void setFoodMarketRtlDirectory(FoodMarketRtlDirectory foodMarketRtlDirectory) {
        this.foodMarketRtlDirectory = foodMarketRtlDirectory;
    }

    public TransportAgenciesDirectory getTransportAgenciesDirectory() {
        return transportAgenciesDirectory;
    }

    public void setTransportAgenciesDirectory(TransportAgenciesDirectory transportAgenciesDirectory) {
        this.transportAgenciesDirectory = transportAgenciesDirectory;
    }

     
    
}
