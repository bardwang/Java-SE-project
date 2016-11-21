/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

/**
 *
 * @author bardw_000
 */
public class Drug {
    
    private String name;
    private int price;
    private String pharma;
    private int caplets;
    private int weight;
    private String origin;
    private String description;
    
    public Drug(){
    }
    
    public Drug(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPharma() {
        return pharma;
    }

    public void setPharma(String pharma) {
        this.pharma = pharma;
    }

    public int getCaplets() {
        return caplets;
    }

    public void setCaplets(int caplets) {
        this.caplets = caplets;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return this.name;
    }
    
}
