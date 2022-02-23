/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.service;
 

import beans.model.insumo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.Random;




@Named
@ApplicationScoped


public class insumoService {
    
    
    private List<insumo> insumos;
      @PostConstruct
      
              public void init(){
                insumos = new ArrayList <>();
                
                insumos.add (new insumo (1,"Hojas blancas",12," Paquete 500 hojas","12/12/21"));
                insumos.add (new insumo (2,"Lapices ",12," Paquete 10 lapices","12/11/21"));
                insumos.add (new insumo (3,"Lapiceros",12," Paquete 10 lapiceros","12/01/22"));
                insumos.add (new insumo (4,"Folders",10," Paquete 100 folders","10/08/20"));
                insumos.add (new insumo (5,"Tinta Impresora",3," Paquete de 3 colores","09/12/21"));
                insumos.add (new insumo (6,"Diurex",12," Pza","07/12/20"));
                insumos.add (new insumo (7,"Goma",5," Paquete 10 pzas","12/12/21"));
                
              }

    public List<insumo> getInsumos() {
        return new ArrayList<>(insumos);
    }

    
     public List<insumo> getinsumos(int size) {

        if (size > insumos.size()) {
            Random rand = new Random();

            List<insumo> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(insumos.size());
                randomList.add(insumos.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(insumos.subList(0, size));
        }

    }

     public List<insumo> getClonedinsumos(int size) {
        List<insumo> results = new ArrayList<>();
        List<insumo> originals = getinsumos(size);
        for (insumo original : originals) {
            results.add(original.clone());
        }
        return results;
    }
              
}
