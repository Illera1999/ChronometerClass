package chronometerclass;

import java.util.UUID;

public class Alumno implements Comparable<Alumno>{
    
    //Attributes
    private String name;
    private UUID id;


    public Alumno(String name) {
        this.name=name;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
    
    @Override
    public boolean equals(Object a){
        if(a instanceof Alumno){
            Alumno b = (Alumno)a;
            if(this.getId().equals(b.getId())){
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int compareTo(Alumno b){
        if(this.getName().compareTo(b.getName())>0){
            return 1;
        }else if(this.getName().compareTo(b.getName())<0){
            return -1;
        }else if(this.getName().compareTo(b.getName())==0){
            return 0;
        }
        return 0;
    }
}
