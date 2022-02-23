package beans.model;

import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Candidato {
    private String nombre;
    private String apellido;
    private ArrayList<String> nombresCandidatos= new ArrayList<>();
    private String salarioDeseado;
    
   
   
    public Candidato(){
        nombresCandidatos.add("Juan");
        nombresCandidatos.add("Pedro");
        this.setNombre("Introduce tu nombre");
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
       
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        
    }

    public String getSalarioDeseado() {
        return salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
       
    }

    /**
     * @return the nombresCandidatos
     */
    public ArrayList<String> getNombresCandidatos() {
        return nombresCandidatos;
    }

    /**
     * @param nombresCandidatos the nombresCandidatos to set
     */
    public void setNombresCandidatos(ArrayList<String> nombresCandidatos) {
        this.nombresCandidatos = nombresCandidatos;
    }
}
