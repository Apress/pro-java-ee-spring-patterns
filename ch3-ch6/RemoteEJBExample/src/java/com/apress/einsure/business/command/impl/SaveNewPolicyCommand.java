/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.command.impl;

/**
 *
 * @author DKAYAL
 */
public class SaveNewPolicyCommand {
    private String name;
    private String productCd;
    private int age;
    
    public Object execute(){
        Object returnVal = null;
        
        System.out.println("Inside command object -");
        System.out.println("name -"+name);
        System.out.println("productCd -"+productCd);
        System.out.println("age -"+age);
        
        return returnVal;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }
    
    
}
