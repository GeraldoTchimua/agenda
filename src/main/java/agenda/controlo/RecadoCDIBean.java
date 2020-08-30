
package agenda.controlo;

import agenda.modelo.Recado;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author GENATCHI
 */
@Named(value = "recadoCDIBean")
@RequestScoped
public class RecadoCDIBean {
    
    Recado recado;

 @PostConstruct
 public void inicializar(){
     recado = new Recado();
 }

    public Recado getRecado() {
        return recado;
    }

    public void setRecado(Recado recado) {
        this.recado = recado;
    }
 
 public String mostraMunicipio(){
     
     return "Municipio Escolhido"+getRecado().getMunicipio();
 }
  
    
}
