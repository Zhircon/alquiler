public class Conductor {
    private String nombre;
    private String sexo;
    private int edad;
    public Conductor(String nombre,String sexo,int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    //Setters 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String toString(){
        return "\tNombre: "+nombre+"\n\t Sexo: "+sexo+"\n\t Edad: "+edad;
    }

}
