/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.controller;

import beans.model.insumo;
import beans.service.insumoService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named ("dtmenuIns")
@ViewScoped
public class menuInsumo implements Serializable{
    
    private List<insumo> insumos;
    
    
    @Inject
    private insumoService service;
    
    @PostConstruct
       public void init (){
       
       insumos=service.getinsumos(5);
       }

    public List<insumo> getInsumos() {
        return insumos;
    }

   
    public void setService(insumoService service) {
        this.service = service;
    }

       
}
