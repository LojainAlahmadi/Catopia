/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattopia;
import java.util.*;
/**
 *
 * @author shaha
 */
public class Cat {
    
    private int catId;
    private String catName;
    private String sex;
    private int age;
    private String breed;
    private Cat bound;
    private String behavior;
    private boolean disabled;
    private String medicalHistory;
    private boolean likesCats;
    private boolean likesChildrens;
    private String adoptionState;
    private String adoptionReason;
    private ArrayList<String> adoptionUpdates;  
    private int adoptionFees;
    private ArrayList<Cat> cats;

    public Cat(int catId, String catName, String sex, int age, String breed, Cat bound, String behavior, boolean disabled, String medicalHistory, boolean likesCats, boolean likesChildrens, String adoptionState, String adoptionReason, int adoptionFees) {
        this.catId = catId;
        this.catName = catName;
        this.sex = sex;
        this.age = age;
        this.breed = breed;
        this.bound = bound;
        this.behavior = behavior;
        this.disabled = disabled;
        this.medicalHistory = medicalHistory;
        this.likesCats = likesCats;
        this.likesChildrens = likesChildrens;
        this.adoptionState = adoptionState;
        this.adoptionReason = adoptionReason;
//        this.adoptionUpdates = adoptionUpdates;
        this.adoptionFees = adoptionFees;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat getBound() {
        return bound;
    }

    public void setBound(Cat bound) {
        this.bound = bound;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public boolean isLikesCats() {
        return likesCats;
    }

    public void setLikesCats(boolean likesCats) {
        this.likesCats = likesCats;
    }

    public boolean isLikesChildrens() {
        return likesChildrens;
    }

    public void setLikesChildrens(boolean likesChildrens) {
        this.likesChildrens = likesChildrens;
    }

    public String getAdoptionState() {
        return adoptionState;
    }

    public void setAdoptionState(String adoptionState) {
        this.adoptionState = adoptionState;
    }

    public String getAdoptionReason() {
        return adoptionReason;
    }

    public void setAdoptionReason(String adoptionReason) {
        this.adoptionReason = adoptionReason;
    }

    public ArrayList getAdoptionUpdates() {
        return adoptionUpdates;
    }

   public void setAdoptionUpdates(ArrayList adoptionUpdates) {
        this.adoptionUpdates = adoptionUpdates;
    }

    public int getAdoptionFees() {
        return adoptionFees;
    }

    public void setAdoptionFees(int adoptionFees) {
        this.adoptionFees = adoptionFees;
    }
    
    public ArrayList<Cat> FilterByBreed(String breed){
        ArrayList Filtered= new ArrayList();
        for(Cat cat:cats){
            if(cat.getBreed().equalsIgnoreCase(breed)){
                Filtered.add(cat);
            }
        }
        return Filtered;
    }
    
    public ArrayList<Cat> FilterByAge(int age){
        ArrayList Filtered= new ArrayList();
        for(Cat cat:cats){
            if(cat.getAge()==age){
                Filtered.add(cat);
            }
        }
        return Filtered;
    }
    
    public ArrayList<Cat> FilterByGender(String gender){
        ArrayList Filtered= new ArrayList();
        for(Cat cat:cats){
            if(cat.getSex().equalsIgnoreCase(gender)){
                Filtered.add(cat);
            }
        }
        return Filtered;
    }

}