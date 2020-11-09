package chronometerclass;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ListaDeAlumnos {

    //Attributes
    private Set<Alumno> listaAlumnos;

    public ListaDeAlumnos() {
        listaAlumnos = new TreeSet<>();
    }

    public Set<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    
    public boolean addAlumno (Alumno a){
        for (Alumno b : listaAlumnos) {
            if (a.equals(b)){
                return false;
            }
        }
        listaAlumnos.add(a);
        return true;
    }
    
    public int tamaño(){
        return listaAlumnos.size();
    }
    
}
