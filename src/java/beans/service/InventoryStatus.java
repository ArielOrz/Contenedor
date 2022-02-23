/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.service;

import java.io.Serializable;

/**
 *
 * @author Ariel
 */
public class InventoryStatus implements Serializable {

    
    
 public String INSTOCK;

    public InventoryStatus(String INSTOCK) {
        this.INSTOCK = INSTOCK;
    }

    public String getINSTOCK() {
        return INSTOCK;
    }

    public void setINSTOCK(String INSTOCK) {
        this.INSTOCK = INSTOCK;
    }
 
   
}
